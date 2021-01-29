package com.kgc.study.service;

import com.kgc.study.bean.AdministratorTable;

public interface AdministratorTableService {
    AdministratorTable AdminLogin(String adminName, String adminPassword);
}
