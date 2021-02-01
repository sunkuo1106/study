package com.kgc.study.studytravelcoach.controller.ZhangJiaheController.Learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class learncenterController {
    //学习中心页面
    @RequestMapping("/learncenter")
    public  String  orderlist(){
        return "learncenter.html";
    }
}
