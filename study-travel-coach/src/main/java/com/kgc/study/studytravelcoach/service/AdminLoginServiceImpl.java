package com.kgc.study.studytravelcoach.service;

import com.kgc.study.bean.AdminLogin;
import com.kgc.study.bean.AdminLoginExample;
import com.kgc.study.service.AdminLoginService;
import com.kgc.study.studytravelcoach.mapper.AdminLoginMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class AdminLoginServiceImpl implements AdminLoginService {

    @Resource
    AdminLoginMapper adminLoginMapper;

    @Override
    public AdminLogin AdminLogin(String adminName, String adminPassword) {
        if(adminName!=null && adminName.isEmpty()==false){
            AdminLoginExample example=new AdminLoginExample();
            example.createCriteria().andAdminNameEqualTo(adminName);
            List<AdminLogin> adminLogins = adminLoginMapper.selectByExample(example);
            if(adminLogins!=null && adminLogins.size()>0){
                if(adminLogins.get(0).getAdminPassword().equals(adminPassword)){
                    return adminLogins.get(0);
                }
            }
        }
        return null;
    }
}
