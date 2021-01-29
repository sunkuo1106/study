package com.kgc.study.bean;

import java.util.Date;

public class AdvertisementInfo {
    private Long id;

    private Date adStartTime;

    private Date adEndTime;

    private String adName;

    private String adRemarks;

    private String adImg;

    private String adUrl;

    private String adTitle;

    private Integer adStatus;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer logicDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAdStartTime() {
        return adStartTime;
    }

    public void setAdStartTime(Date adStartTime) {
        this.adStartTime = adStartTime;
    }

    public Date getAdEndTime() {
        return adEndTime;
    }

    public void setAdEndTime(Date adEndTime) {
        this.adEndTime = adEndTime;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public String getAdRemarks() {
        return adRemarks;
    }

    public void setAdRemarks(String adRemarks) {
        this.adRemarks = adRemarks == null ? null : adRemarks.trim();
    }

    public String getAdImg() {
        return adImg;
    }

    public void setAdImg(String adImg) {
        this.adImg = adImg == null ? null : adImg.trim();
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl == null ? null : adUrl.trim();
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle == null ? null : adTitle.trim();
    }

    public Integer getAdStatus() {
        return adStatus;
    }

    public void setAdStatus(Integer adStatus) {
        this.adStatus = adStatus;
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

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}