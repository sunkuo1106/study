package com.kgc.study.studytravelcoach.controller.wangxinyuController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 孙阔
 * @date 2021/2/2 14:32
 */

@Controller
public class AgencyController {

    /*
    *跳转机构管理页面
    * */
    @GetMapping("/agency")
    public String toAgency(){
        return "agency";
    }
}
