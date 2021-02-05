package com.kgc.study.studytravelcoach.controller;

import com.kgc.study.bean.EduUser;
import com.kgc.study.bean.MyPageInfo;
import com.kgc.study.service.loService;
import com.kgc.study.studytravelcoach.utils.ExcelUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "学员管理API",description = "提供学员管理相关的Rest API")
public class loController {
    @Resource
    loService loService;
    @Resource
    ExcelUtils excelUtils;
    @RequestMapping("userlist")
    public String userlist(
            @RequestParam(value = "eduUserName", required = false, defaultValue = "-1") String eduUserName,
                           @RequestParam(value = "eduUserPhone", required = false, defaultValue = "") String eduUserPhone,
                           @RequestParam(value = "eduUserIdCard", required = false, defaultValue = "") String eduUserIdCard,
                           @RequestParam(value = "eduUserGender", required = false, defaultValue = "2") Integer eduUserGender,
                          @RequestParam(value = "eduUserIsAvalible", required = false, defaultValue = "3") String eduUserIsAvalible,
                         @RequestParam(value = "eduUserIsGoodStudent", required = false, defaultValue = "2") Integer eduUserIsGoodStudent,
                          @RequestParam(value = "eduUserEnrollmentMethod", required = false, defaultValue = "2") Integer eduUserEnrollmentMethod,
                           @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                           @RequestParam(value = "pageSize", required = false, defaultValue = "2") Integer pageSize,
                           Model model){
        MyPageInfo<EduUser> eduUserMyPageInfo = loService.selectEduUser(
                eduUserName, eduUserPhone, eduUserIdCard, eduUserGender, eduUserIsAvalible, eduUserIsGoodStudent, eduUserEnrollmentMethod,
                pageNum, pageSize);
        for (EduUser edu : eduUserMyPageInfo.getList()) {
            System.out.println(edu.toString());
        }

        model.addAttribute("eduUserMyPageInfo",eduUserMyPageInfo);
        return "member-list";
    }
    @RequestMapping("toEduUserBatchUpload")
    public  String toEduUserBatchUpload(){
        return "eduUserBatchUpload";
    }


    //批量添加学员信息方法
    @ApiOperation(value = "批量添加学员信息")
    @ApiImplicitParam(name = "multipartFile",value = "文件对象")
    @RequestMapping("eduUserBatchUpload")
    @ResponseBody
    public Map<String,Object> upload(MultipartFile multipartFile, HttpSession session, HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        //生成后缀名集合
        List<String> suffixs=new ArrayList<>();
        suffixs.add("xlsx");
        suffixs.add("xls");
        //是否选择文件
        if (multipartFile==null||multipartFile.isEmpty()) {
            map.put("msg","请选择文件");
            map.put("status", "error");
            return map;
        }
        String path="";
        try {
            String originalFileName = multipartFile.getOriginalFilename();
            //文件路径
            path = ResourceUtils.getURL("classpath:").getPath()+"/static/excel";
            //获取扩展名，原文件后缀
            String originalFileSuffix= FilenameUtils.getExtension(originalFileName);
            //是否包含上传后缀
            if (suffixs.contains(originalFileSuffix)==false){
                map.put("msg", "上传文件格式不正确");
                map.put("status", "error");
                return map;
            }
            //生成新文件名
            String newFileName = System.currentTimeMillis()+ RandomUtils.nextInt(1000000)+"."+originalFileSuffix;
            File file=new File(path,newFileName);
            //生产文件
            multipartFile.transferTo(file);
            List<EduUser> excel = excelUtils.createExcel(file, originalFileSuffix);
            if (excel.size()>0){
                int i = loService.insertEduUserList(excel);
                if (i>0){
                    map.put("status", "success");
                }else{
                    map.put("status", "error");
                }
            }
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

//    @RequestMapping("userById")
//    public String userById(String eduUserName, String eduUserPhone, String eduUserIdCard, Byte eduUserGender, String eduUserIsAvalible, Integer eduUserIsGoodStudent,Byte eduUserEnrollmentMethod,Model model){
//        List<EduUser> eduUserMyPageInfo = loService.selectById(eduUserName, eduUserPhone, eduUserIdCard, eduUserGender, eduUserIsAvalible, eduUserIsGoodStudent, eduUserEnrollmentMethod);
//        model.addAttribute("eduUserMyPageInfo",eduUserMyPageInfo);
//        return "member-list";
//    }

}


