package com.kgc.study.bean;

import java.util.Date;

public class AdvertisementInfo {
    private Long adId;

    private String adName;

    private String adRemarks;

    private String adImg;

    private String adUrl;

    private String adTitle;

    private Integer adSequence;

    private Date adGmtCreate;

    private Date adGmtModified;

    private Integer logicDelete;

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
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

    public Integer getAdSequence() {
        return adSequence;
    }

    public void setAdSequence(Integer adSequence) {
        this.adSequence = adSequence;
    }

    public Date getAdGmtCreate() {
        return adGmtCreate;
    }

    public void setAdGmtCreate(Date adGmtCreate) {
        this.adGmtCreate = adGmtCreate;
    }

    public Date getAdGmtModified() {
        return adGmtModified;
    }

    public void setAdGmtModified(Date adGmtModified) {
        this.adGmtModified = adGmtModified;
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }

    @Override
    public String toString() {
        return "AdvertisementInfo{" +
                "adId=" + adId +
                ", adName='" + adName + '\'' +
                ", adRemarks='" + adRemarks + '\'' +
                ", adImg='" + adImg + '\'' +
                ", adUrl='" + adUrl + '\'' +
                ", adTitle='" + adTitle + '\'' +
                ", adSequence=" + adSequence +
                ", adGmtCreate=" + adGmtCreate +
                ", adGmtModified=" + adGmtModified +
                ", logicDelete=" + logicDelete +
                '}';
    }
}