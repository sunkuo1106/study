package com.kgc.study.bean;

import java.util.Date;

public class Teacher {
    private Long id;

    private String tchName;

    private String tchPicPath;

    private Date gmtCreate;

    private Date gmtModified;

    private String tchSubject;

    private Integer tchStatus;

    private Integer logicDelete;

    private String tchCareer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTchName() {
        return tchName;
    }

    public void setTchName(String tchName) {
        this.tchName = tchName == null ? null : tchName.trim();
    }

    public String getTchPicPath() {
        return tchPicPath;
    }

    public void setTchPicPath(String tchPicPath) {
        this.tchPicPath = tchPicPath == null ? null : tchPicPath.trim();
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

    public String getTchSubject() {
        return tchSubject;
    }

    public void setTchSubject(String tchSubject) {
        this.tchSubject = tchSubject == null ? null : tchSubject.trim();
    }

    public Integer getTchStatus() {
        return tchStatus;
    }

    public void setTchStatus(Integer tchStatus) {
        this.tchStatus = tchStatus;
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }

    public String getTchCareer() {
        return tchCareer;
    }

    public void setTchCareer(String tchCareer) {
        this.tchCareer = tchCareer == null ? null : tchCareer.trim();
    }
}