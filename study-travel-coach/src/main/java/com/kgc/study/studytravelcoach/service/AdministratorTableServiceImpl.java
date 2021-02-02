package com.kgc.study.studytravelcoach.service;

import com.kgc.study.bean.AdministratorTable;
import com.kgc.study.bean.AdministratorTableExample;
import com.kgc.study.service.AdministratorTableService;
import com.kgc.study.studytravelcoach.mapper.AdministratorTableMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class AdministratorTableServiceImpl implements AdministratorTableService {

    @Resource
    AdministratorTableMapper administratorTableMapper;

    @Override
    public AdministratorTable AdminLogin(String adminName, String adminPassword) {
        if(adminName!=null && adminName.isEmpty()==false){
            AdministratorTableExample example=new AdministratorTableExample();
            example.createCriteria().andAdminNameEqualTo(adminName);
            List<AdministratorTable> adminLogins = administratorTableMapper.selectByExample(example);
            if(adminLogins!=null && adminLogins.size()>0){
                if(adminLogins.get(0).getAdminPassword().equals(adminPassword)){
                    return adminLogins.get(0);
                }
            }
        }
        return null;
    }
}
