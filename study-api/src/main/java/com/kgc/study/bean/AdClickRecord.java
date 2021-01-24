package com.kgc.study.bean;

import java.util.Date;

public class AdClickRecord {
    private Long adClickId;

    private Long adMentId;

    private Long adClickNum;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getAdClickId() {
        return adClickId;
    }

    public void setAdClickId(Long adClickId) {
        this.adClickId = adClickId;
    }

    public Long getAdMentId() {
        return adMentId;
    }

    public void setAdMentId(Long adMentId) {
        this.adMentId = adMentId;
    }

    public Long getAdClickNum() {
        return adClickNum;
    }

    public void setAdClickNum(Long adClickNum) {
        this.adClickNum = adClickNum;
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