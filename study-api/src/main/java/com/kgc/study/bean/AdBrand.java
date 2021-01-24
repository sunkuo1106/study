package com.kgc.study.bean;

import java.util.Date;

public class AdBrand {
    private Long adBrandId;

    private String adBrandName;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getAdBrandId() {
        return adBrandId;
    }

    public void setAdBrandId(Long adBrandId) {
        this.adBrandId = adBrandId;
    }

    public String getAdBrandName() {
        return adBrandName;
    }

    public void setAdBrandName(String adBrandName) {
        this.adBrandName = adBrandName == null ? null : adBrandName.trim();
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