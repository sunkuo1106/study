package com.kgc.study.studytravelcoach.controller;

import com.kgc.study.bean.EduUser;
import com.kgc.study.bean.MyPageInfo;
import com.kgc.study.service.loService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class loController {
    @Resource
    loService loService;

    @RequestMapping("userlist")
    public String userlist(
            @RequestParam(value = "eduUserName", required = false, defaultValue = "") String eduUserName,
                           @RequestParam(value = "eduUserPhone", required = false, defaultValue = "") String eduUserPhone,
                           @RequestParam(value = "eduUserIdCard", required = false, defaultValue = "") String eduUserIdCard,
                           @RequestParam(value = "eduUserGender", required = false, defaultValue = "2") Byte eduUserGender,
                          @RequestParam(value = "eduUserIsAvalible", required = false, defaultValue = "0") String eduUserIsAvalible,
                         @RequestParam(value = "eduUserIsGoodStudent", required = false, defaultValue = "2") Integer eduUserIsGoodStudent,
                          @RequestParam(value = "eduUserEnrollmentMethod", required = false, defaultValue = "2") Byte eduUserEnrollmentMethod,
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
//    @RequestMapping("userById")
//    public String userById(String eduUserName, String eduUserPhone, String eduUserIdCard, Byte eduUserGender, String eduUserIsAvalible, Integer eduUserIsGoodStudent,Byte eduUserEnrollmentMethod,Model model){
//        List<EduUser> eduUserMyPageInfo = loService.selectById(eduUserName, eduUserPhone, eduUserIdCard, eduUserGender, eduUserIsAvalible, eduUserIsGoodStudent, eduUserEnrollmentMethod);
//        model.addAttribute("eduUserMyPageInfo",eduUserMyPageInfo);
//        return "member-list";
//    }

}
