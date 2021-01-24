package com.kgc.study.bean;

import java.util.Date;

public class AdminLogin {
    private Integer id;

    private String adminName;

    private String adminPassword;

    private Integer adminCompetence;

    private Date adminGmtCreate;

    private Date adminGmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public Integer getAdminCompetence() {
        return adminCompetence;
    }

    public void setAdminCompetence(Integer adminCompetence) {
        this.adminCompetence = adminCompetence;
    }

    public Date getAdminGmtCreate() {
        return adminGmtCreate;
    }

    public void setAdminGmtCreate(Date adminGmtCreate) {
        this.adminGmtCreate = adminGmtCreate;
    }

    public Date getAdminGmtModified() {
        return adminGmtModified;
    }

    public void setAdminGmtModified(Date adminGmtModified) {
        this.adminGmtModified = adminGmtModified;
    }
}