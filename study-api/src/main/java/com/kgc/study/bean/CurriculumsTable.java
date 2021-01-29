package com.kgc.study.bean;

import java.util.Date;

public class CurriculumsTable {
    private Long id;

    private String currName;

    private Long currMgrId;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer logicDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrName() {
        return currName;
    }

    public void setCurrName(String currName) {
        this.currName = currName == null ? null : currName.trim();
    }

    public Long getCurrMgrId() {
        return currMgrId;
    }

    public void setCurrMgrId(Long currMgrId) {
        this.currMgrId = currMgrId;
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