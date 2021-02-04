package com.kgc.study.studytravelcoach.controller.ZhangJiaheController.banner;

import com.kgc.study.bean.AdvertisementInfo;
import com.kgc.study.bean.AdvertisementInfoExample;
import com.kgc.study.service.zhangjiaheService.AdvertisementInfoService;
import com.kgc.study.studytravelcoach.loaliyun.Aliyun2;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.data.elasticsearch.annotations.MultiField;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "研学旅行后台广告中心",description = "提供广告信息管理")
public class adController {
@Resource
    AdvertisementInfoService advertisementInfoService;
//后台广告页面
@ApiOperation("显示广告列表")
@RequestMapping("/banner")
@ApiImplicitParam(name = "adName",value = "如果查询广告标题不为空进行查询",required = true)
    /*@RequestMapping("/banner")*/
    public  String  orderlist(Model model,String adName){
        //显示广告列表 逻辑删除显示为0的
        //根据广告名称进行模糊查询
        List<AdvertisementInfo> advertisementInfos = advertisementInfoService.selectad(adName);
        System.out.println("广告列表查询内容"+advertisementInfos.toString());
        model.addAttribute("advertisementInfos",advertisementInfos);
        return "banner";
    }
    //批量删除  逻辑删除
    @ApiOperation("批量删除广告")
    @PostMapping("/updatedeletelist")
    @ApiImplicitParam(name = "str",value = "数组",required = true)
   /* @RequestMapping("/updatedeletelist")*/
    @ResponseBody
    public  Map updatedeletelist(String str){
        Map map=new HashMap();
        int updatedeletelist = advertisementInfoService.updatedeletelist(str);
        if (updatedeletelist>0){
            map.put("status", "true");
        }else {
            map.put("status", "false");
        }
        return map;
    }
    //删除单条广告 逻辑删除
    @ApiOperation("删除单条广告")
    @PostMapping("/updatedeleteID")
    @ApiImplicitParam(name = "adId",value = "根绝adId单条删除",required = true)
    /*@RequestMapping("/updatedeleteID")*/
    @ResponseBody
    public Map updatedeleteID(Long adId){
        Map map=new HashMap();
        int updatedeleteID = advertisementInfoService.updatedeleteID(adId);
        if (updatedeleteID>0){
            map.put("status", "true");
        }else {
            map.put("status", "false");
        }
        return map;
    }
    @ApiOperation("跳转添加页面")
    @GetMapping("/bannerinsert")
   /* @RequestMapping("/bannerinsert")*/
    public  String bannerinsert(){
        return "banner-insert.html";
    }
    @ApiOperation("添加广告")
    @PostMapping("/dobannerinsert")
    @ApiImplicitParam(name = "AdvertisementInfo",value = "advertisementInfo实体类",required = true)
   /* @RequestMapping("/dobannerinsert")*/
    public  String dobannerinsert(MultipartFile img, AdvertisementInfo advertisementInfo, HttpServletRequest request){
    try {
        String realPath = ResourceUtils.getURL("classpath:").getPath() + "/static/images";
        String oldname = img.getOriginalFilename();
        /*获取拓展名*/
        String extension = FilenameUtils.getExtension(oldname);
        //生成新文件名
        String fileName = System.currentTimeMillis() + RandomUtils.nextInt(1000000) + "_Personal." + extension;
        File file1 = new File(realPath, fileName);
        // 把内存图片写入磁盘中
        try {
            img.transferTo(file1);
            InputStream inputStream=new FileInputStream(realPath+"/"+fileName);
            String s= Aliyun2.upload(inputStream,oldname);
            advertisementInfo.setAdImg(s);
            advertisementInfoService.insertbanner(advertisementInfo);
            return "redirect:banner";
        } catch (IOException e) {
            e.printStackTrace();
        }
    }catch (Exception ex){

    }


        return "redirect:banner";
    }
    @ApiOperation("修改查询")
    @GetMapping("/bannerupdate")
    @ApiImplicitParam(name = "adId",value = "根绝id修改前查询数据",required = true)
   /* @RequestMapping("/bannerupdate")*/
    public  String bannerupdate(Model model,Long adId){
        AdvertisementInfo updatecha = advertisementInfoService.updatecha(adId);
        model.addAttribute("updatecha",updatecha);
        return "banner-update.html";
    }
    @ApiOperation("修改数据")
    @PostMapping("/dobannerupdate")
    @ApiImplicitParam(name = "AdvertisementInfo",value = "advertisementInfo实体类",required = true)
   /* @RequestMapping("/dobannerupdate")*/
    public  String dobannerupdate(MultipartFile img,AdvertisementInfo advertisementInfo,HttpServletRequest request){
        try {
            String realPath = ResourceUtils.getURL("classpath:").getPath() + "/static/images";
            String oldname = img.getOriginalFilename();
            /*获取拓展名*/
            String extension = FilenameUtils.getExtension(oldname);
            //生成新文件名
            String fileName = System.currentTimeMillis() + RandomUtils.nextInt(1000000) + "_Personal." + extension;
            File file1 = new File(realPath, fileName);
            // 把内存图片写入磁盘中
            try {
                if (img!=null&&img.isEmpty()==false){
                    img.transferTo(file1);
                    InputStream inputStream=new FileInputStream(realPath+"/"+fileName);
                    String s= Aliyun2.upload(inputStream,oldname);
                    System.out.println(s);
                    advertisementInfo.setAdImg(s);
                }
                advertisementInfo.setAdGmtModified(new Date());
                advertisementInfoService.updatebanner(advertisementInfo);
                return "redirect:banner";
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (Exception ex){

        }
        return "redirect:banner";
    }
    @ApiOperation("跳转显示等级设置页面")
    @GetMapping("/bannersequence")
    @ApiImplicitParam(name = "adId",value = "根绝id设置该数据的显示等级",required = true)
    /* @RequestMapping("/bannersequence")*/
    public  String bannersequence(Model model, Long adId){
        AdvertisementInfo sequencecha = advertisementInfoService.updatecha(adId);
        model.addAttribute("sequence",sequencecha);
        return "banner-sequence.html";
    }
    @ApiOperation("设置等级")
    @PostMapping("/dosequenceupdate")
    @ApiImplicitParam(name = "AdvertisementInfo",value = "advertisementInfo实体类",required = true)
    /* @RequestMapping("/dosequenceupdate")*/
    public  String dosequenceupdate(AdvertisementInfo advertisementInfo){
          advertisementInfoService.updatesequence(advertisementInfo);
        return "redirect:banner";
    }
}
