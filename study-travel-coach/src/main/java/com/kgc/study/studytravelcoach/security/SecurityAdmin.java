package com.kgc.study.studytravelcoach.security;

import com.kgc.study.bean.AdministratorTable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class SecurityAdmin extends User {

    private AdministratorTable administratorTable;

    public SecurityAdmin(AdministratorTable administratorTable,Collection<? extends GrantedAuthority> authorities) {
        super(administratorTable.getAdminName(), administratorTable.getAdminPassword(), authorities);
        this.administratorTable = administratorTable;
    }

    public AdministratorTable getAdministratorTable() {
        return administratorTable;
    }

    public void setAdministratorTable(AdministratorTable administratorTable) {
        this.administratorTable = administratorTable;
    }
}
