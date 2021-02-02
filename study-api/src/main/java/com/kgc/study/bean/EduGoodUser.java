package com.kgc.study.bean;

import java.util.Date;

public class EduGoodUser {
    private Long id;

    private String goodUserImg;

    private Date gmtCreate;

    private Date gmtModified;

    private String goodUserSchool;

    private Long goodUserSalary;

    private String goodUserCompany;

    private Integer logicDelete;

    private String goodUserName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodUserImg() {
        return goodUserImg;
    }

    public void setGoodUserImg(String goodUserImg) {
        this.goodUserImg = goodUserImg == null ? null : goodUserImg.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getGoodUserSchool() {
        return goodUserSchool;
    }

    public void setGoodUserSchool(String goodUserSchool) {
        this.goodUserSchool = goodUserSchool == null ? null : goodUserSchool.trim();
    }

    public Long getGoodUserSalary() {
        return goodUserSalary;
    }

    public void setGoodUserSalary(Long goodUserSalary) {
        this.goodUserSalary = goodUserSalary;
    }

    public String getGoodUserCompany() {
        return goodUserCompany;
    }

    public void setGoodUserCompany(String goodUserCompany) {
        this.goodUserCompany = goodUserCompany == null ? null : goodUserCompany.trim();
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }

    public String getGoodUserName() {
        return goodUserName;
    }

    public void setGoodUserName(String goodUserName) {
        this.goodUserName = goodUserName == null ? null : goodUserName.trim();
    }
}