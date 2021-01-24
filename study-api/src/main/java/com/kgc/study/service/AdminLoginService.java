package com.kgc.study.service;

import com.kgc.study.bean.AdminLogin;

public interface AdminLoginService {
    AdminLogin AdminLogin(String adminName,String adminPassword);
}
