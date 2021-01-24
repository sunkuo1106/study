package com.kgc.study.bean;

import java.util.Date;

public class ActivityType {
    private Long id;

    private String adInfoName;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdInfoName() {
        return adInfoName;
    }

    public void setAdInfoName(String adInfoName) {
        this.adInfoName = adInfoName == null ? null : adInfoName.trim();
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
}