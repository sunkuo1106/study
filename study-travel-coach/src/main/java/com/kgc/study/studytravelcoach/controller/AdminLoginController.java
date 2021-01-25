package com.kgc.study.studytravelcoach.controller;

import com.kgc.study.bean.AdminLogin;
import com.kgc.study.service.AdminLoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class AdminLoginController {

    @Resource
    AdminLoginService adminLoginService;

    @RequestMapping("/")
    public String ToLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(String adminName, String adminPassword, HttpSession session){
        AdminLogin adminLogin = adminLoginService.AdminLogin(adminName, adminPassword);
        session.setAttribute("admin",adminLogin);
        return "index";
    }
}
