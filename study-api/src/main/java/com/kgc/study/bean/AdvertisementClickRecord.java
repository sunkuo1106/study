package com.kgc.study.bean;

import java.util.Date;

public class AdvertisementClickRecord {
    private Long id;

    private Long adId;

    private Long adClickCount;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer logicDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
    }

    public Long getAdClickCount() {
        return adClickCount;
    }

    public void setAdClickCount(Long adClickCount) {
        this.adClickCount = adClickCount;
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