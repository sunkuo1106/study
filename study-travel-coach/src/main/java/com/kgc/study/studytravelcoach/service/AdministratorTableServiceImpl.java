package com.kgc.study.studytravelcoach.service;

import com.kgc.study.bean.AdministratorTable;
import com.kgc.study.bean.AdministratorTableExample;
import com.kgc.study.service.AdministratorTableService;
import com.kgc.study.studytravelcoach.mapper.AdministratorTableMapper;
import com.kgc.study.studytravelcoach.security.SecurityAdmin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Component
public class AdministratorTableServiceImpl implements AdministratorTableService {

    @Resource
    AdministratorTableMapper administratorTableMapper;

    @Resource
    HttpSession httpSession;

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

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        AdministratorTableExample example=new AdministratorTableExample();
        AdministratorTableExample.Criteria criteria = example.createCriteria();
        criteria.andAdminNameEqualTo(s);
        List<AdministratorTable> administratorTables = administratorTableMapper.selectByExample(example);
        if(administratorTables!=null&&administratorTables.size()>0){
            AdministratorTable administratorTable=administratorTables.get(0);
            httpSession.setAttribute("AgencyId",administratorTable.getId());
            //封装角色和权限信息
            List<GrantedAuthority> authorityList = AuthorityUtils.createAuthorityList();
            authorityList.add(new SimpleGrantedAuthority("ROLE_"+"admin"));
            String all="select";
            authorityList.add(new SimpleGrantedAuthority(all));
            SecurityAdmin securityAdmin=new SecurityAdmin(administratorTable,authorityList);
            return securityAdmin;
        }
        return null;
    }
}
