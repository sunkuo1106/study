package com.kgc.study.service;

import com.kgc.study.bean.AdministratorTable;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AdministratorTableService extends UserDetailsService {
    AdministratorTable AdminLogin(String adminName, String adminPassword);
}
