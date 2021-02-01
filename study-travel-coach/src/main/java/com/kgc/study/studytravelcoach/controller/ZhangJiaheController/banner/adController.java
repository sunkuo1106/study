package com.kgc.study.studytravelcoach.controller.ZhangJiaheController.banner;

import com.kgc.study.bean.AdvertisementInfo;
import com.kgc.study.bean.AdvertisementInfoExample;
import com.kgc.study.service.zhangjiaheService.AdvertisementInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class adController {
@Resource
    AdvertisementInfoService advertisementInfoService;
//后台广告页面
    @RequestMapping("/banner")
    public  String  orderlist(Model model,String adName){
        //显示广告列表 逻辑删除显示为0的
        //根据广告名称进行模糊查询
        List<AdvertisementInfo> advertisementInfos = advertisementInfoService.selectad(adName);
        System.out.println("广告列表查询内容"+advertisementInfos.toString());
        model.addAttribute("advertisementInfos",advertisementInfos);
        return "banner";
    }
    @RequestMapping("/deletelist")
    public  String deletelist(String str){
        int deletelist = advertisementInfoService.deletelist(str);
        if (deletelist>0){
            return "redirect:banner";
        }else {
            return "redirect:banner";
        }
    }


}
