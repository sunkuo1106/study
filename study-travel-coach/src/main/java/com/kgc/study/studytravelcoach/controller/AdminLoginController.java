package com.kgc.study.studytravelcoach.controller;

import com.kgc.study.bean.AdminLogin;
import com.kgc.study.service.AdminLoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class AdminLoginController {

    @Resource
    AdminLoginService adminLoginService;

    @RequestMapping("/login")
    @ResponseBody
    public AdminLogin login(String adminName,String adminPassword){
        AdminLogin adminLogin = adminLoginService.AdminLogin(adminName, adminPassword);
        return adminLogin;
    }
}
