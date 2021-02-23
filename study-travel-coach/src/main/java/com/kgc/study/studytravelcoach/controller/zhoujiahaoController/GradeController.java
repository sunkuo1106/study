package com.kgc.study.studytravelcoach.controller.zhoujiahaoController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.*;
import com.kgc.study.service.zhoujiahaoService.gradeService;
import com.kgc.study.studytravelcoach.loaliyun.Aliyun2;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "班级管理中心",description = "提供班级信息管理")
public class GradeController {

    @Resource
    gradeService grade;

    @ApiOperation("显示班级信息列表")
    @GetMapping("/grade")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "gradeName",value="根据班级名称查询",required = false),
            @ApiImplicitParam(name = "gradeType",value="根据班级类型查询",required = false),
            @ApiImplicitParam(name = "pageNum",value="页码",required = false),
    })
    public String grade(Model model,HttpSession session,
                        @RequestParam(value = "gradeName",required = false,defaultValue = "")String gradeName,
                        @RequestParam(value = "gradeType",required = false,defaultValue = "0")Integer gradeType,
                        @RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum){
        Integer pageSize=3;
        Integer admin = (Integer) session.getAttribute("AgencyId");
        System.out.println(admin);
        PageHelper.startPage(pageNum,pageSize);
        List<GradeInfo> gradeInfos = grade.selectAll(gradeName,gradeType,admin);
        PageInfo pageInfo=new PageInfo(gradeInfos);
        List<GradeType> gradeTypes = grade.selectGradeType();
        model.addAttribute("gradeType",gradeTypes);
        model.addAttribute("gradeInfo",pageInfo);
        //回显
        model.addAttribute("typeId",gradeType);
        return "grade";
    }

    @ApiOperation("查询所有地区和所有班型传到添加页面")
    @GetMapping("/addGrade")
    public String addGrade(Model model,HttpSession session){
        Integer admin = (Integer) session.getAttribute("AgencyId");
        //全部地区
        List<AgencyAddress> agencyAddresses = grade.selectAddress(admin);
        //班级类型
        List<GradeType> gradeTypes = grade.selectGradeType();
        model.addAttribute("gradeType",gradeTypes);
        model.addAttribute("agencyAddress",agencyAddresses);
        return "grade-insert";
    }

    @ApiOperation("添加一条班级信息，自动生成开班通知")
    @PostMapping("/gradeinsert")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "gradeName",value = "班级名称需要填写"),
        @ApiImplicitParam(name = "gradePerson",value = "班级人数需要填写"),
        @ApiImplicitParam(name = "agencyAddressId",value = "所在地区需要填写"),
        @ApiImplicitParam(name = "gradeTypeId",value = "班级类型需要填写"),
    })
    public String gradeinsert(GradeInfo gradeInfo,HttpSession session,Model model){
        Integer admin = (Integer) session.getAttribute("AgencyId");
        gradeInfo.setGmtCreate(new Date());
        gradeInfo.setGmtModified(new Date());
        gradeInfo.setGradeStartTime(new Date());
        gradeInfo.setGradeGmtFounderId(admin);
        gradeInfo.setLogicDelete(0);
        grade.insert(gradeInfo);
        return "redirect:/grade";
    }

    @ApiOperation("逻辑删除班级")
    @PutMapping("/delete")
    @ResponseBody
    @ApiImplicitParam(name = "gradeId",value = "班级的id")
    public Map<String,Object> delete(Integer gradeId){
        System.out.println(gradeId);
        Map<String,Object> map=new HashMap<>();
        GradeInfo gradeInfo=new GradeInfo();
        gradeInfo.setId((long)gradeId);
        gradeInfo.setLogicDelete(1);
        gradeInfo.setGmtModified(new Date());
        int update = grade.update(gradeInfo);
        if(update>0){
            map.put("status",true);
        }else{
            map.put("status",false);
        }
        return map;
    }

    @ApiOperation("查看班级详细信息")
    @GetMapping("gradeUpdate")
    @ApiImplicitParam(name = "gradeId",value = "班级id")
    public String gradeUpdate(Integer gradeId,Model model,HttpSession session){
        Integer admin = (Integer) session.getAttribute("AgencyId");
        GradeInfo gradeInfo = grade.selectGrade(gradeId);
        //全部地区
        List<AgencyAddress> agencyAddresses = grade.selectAddress(admin);
        //班级类型
        List<GradeType> gradeTypes = grade.selectGradeType();
        model.addAttribute("gradeType",gradeTypes);
        model.addAttribute("agencyAddress",agencyAddresses);
        model.addAttribute("gradeInfo",gradeInfo);
        return "grade-update";
    }

    @ApiOperation("修改班级信息")
    @PostMapping("/gradeupdate")
    @ApiImplicitParam(name = "gradeInfo",value = "修改后的班级信息")
    public String gradeupdate(GradeInfo gradeInfo){
        int update = grade.update(gradeInfo);
        if(update>0){
            return "redirect:/grade";
        }else{
            return null;
        }
    }

    @ApiOperation("批量逻辑删除班级")
    @PutMapping("/delAll")
    @ResponseBody
    @ApiImplicitParam(name = "gradeIdList",value = "前端传来的id字符串格式：1,2,3")
    public Map<String,Object> delAll(String gradeIdList){
        Map<String,Object> map=new HashMap<>();
        System.out.println(gradeIdList);
        int i = grade.updateList(gradeIdList);
        if(i>0){
            map.put("status",true);
        }else{
            map.put("status",false);
        }
        return map;
    }

    @ApiOperation("查看开班通知信息")
    @GetMapping("LookTZ")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "gradeId",value = "班级的id",required = false),
            @ApiImplicitParam(name = "adminId",value = "创建人的id",required = false)
    })
    public String LookTZ(HttpSession session,Integer gradeId,Integer adminId,Model model){

        if(gradeId==null){
            ClasstoinformInfo classtoinformInfo = (ClasstoinformInfo) session.getAttribute("classtoinformInfo");
            gradeId = Integer.parseInt(classtoinformInfo.getCtfGradeId());
        }
        if(adminId==null){
            ClasstoinformInfo classtoinformInfo = (ClasstoinformInfo) session.getAttribute("classtoinformInfo");
            adminId = classtoinformInfo.getCtfGmtFounderId();
        }
        System.out.println(adminId);
        System.out.println("------");
        System.out.println(gradeId);
        GradeInfo gradeInfo = grade.selectGradeXinXi(gradeId, adminId);
        ClasstoinformInfo classtoinformInfo = grade.selectClasstoinformInfo(gradeId, adminId);
        if(classtoinformInfo==null){
            return "redirect:/grade";
        }
        model.addAttribute("TZ",classtoinformInfo);
        model.addAttribute("grade",gradeInfo);
        return "classtoinform";
    }

    @ApiOperation("补充开班通知信息")
    @PostMapping("/classtoinformadd")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classtoinformInfo",value = "开班通知的信息，注意班级简介分为两段，每段结尾加上句号",required = false),
            @ApiImplicitParam(name = "ctfContext1",value = "班级简介的下半部分",required = false),
    })
    public  String dobannerinsert(HttpSession session,MultipartFile img, ClasstoinformInfo classtoinformInfo,String ctfContext1,HttpServletRequest request){
        try {
            if(img.isEmpty()==false){
                System.out.println("img为"+img);
                String realPath = ResourceUtils.getURL("classpath:").getPath() + "/static/images";
                String oldname = img.getOriginalFilename();
                /*获取拓展名*/
                String extension = FilenameUtils.getExtension(oldname);
                //生成新文件名
                String fileName = System.currentTimeMillis() + RandomUtils.nextInt(1000000) + "_Personal." + extension;
                //String realPath="D:/第三期/IdeaProjects/study/study-travel-coach/target/classes/static/images";
                File file1 = new File(realPath, fileName);
                // 把内存图片写入磁盘中
                img.transferTo(file1);
                InputStream inputStream=new FileInputStream(realPath+"/"+fileName);
                String s= Aliyun2.upload(inputStream,oldname);
                System.out.println(s);
                classtoinformInfo.setCtfPic(s);
            }
            classtoinformInfo.setCtfContext(classtoinformInfo.getCtfContext()+ctfContext1);
            grade.update(classtoinformInfo);
            session.setAttribute("classtoinformInfo",classtoinformInfo);
            return "redirect:/LookTZ";
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "redirect:/LookTZ";
    }
}
