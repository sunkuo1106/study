package com.kgc.study.bean;

import java.util.Date;

public class Advertisement {
    private Long adId;

    private Date adTime;

    private Date adEndtime;

    private String adName;

    private String adBz;

    private String adPicture;

    private String adUrl;

    private String adTitle;

    private Integer adType;

    private Integer adleiId;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
    }

    public Date getAdTime() {
        return adTime;
    }

    public void setAdTime(Date adTime) {
        this.adTime = adTime;
    }

    public Date getAdEndtime() {
        return adEndtime;
    }

    public void setAdEndtime(Date adEndtime) {
        this.adEndtime = adEndtime;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public String getAdBz() {
        return adBz;
    }

    public void setAdBz(String adBz) {
        this.adBz = adBz == null ? null : adBz.trim();
    }

    public String getAdPicture() {
        return adPicture;
    }

    public void setAdPicture(String adPicture) {
        this.adPicture = adPicture == null ? null : adPicture.trim();
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

    public Integer getAdType() {
        return adType;
    }

    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    public Integer getAdleiId() {
        return adleiId;
    }

    public void setAdleiId(Integer adleiId) {
        this.adleiId = adleiId;
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