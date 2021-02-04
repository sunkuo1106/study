package com.kgc.study.studytravelcoach.controller;

import com.kgc.study.bean.AdministratorTable;
import com.kgc.study.service.AdministratorTableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class AdminLoginController {

    @Resource
    AdministratorTableService administratorTableService;

    /**
     * 登陆页
     * @return
     */
    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(String adminName, String adminPassword, HttpSession session){
//        AdministratorTable adminLogin = administratorTableService.AdminLogin(adminName, adminPassword);
//        session.setAttribute("admin",adminLogin);
//        session.setAttribute("AgencyId",adminLogin.getAgencyId());
        return "index";
    }

    @RequestMapping("/toIndex")
    public String index(){
        return "index";
    }


}
