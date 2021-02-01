package com.kgc.study.studytravelcoach.controller.ZhangJiaheController.banner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adController {

//后台广告页面
    @RequestMapping("/banner")
    public  String  orderlist(){
        return "banner";
    }


}
