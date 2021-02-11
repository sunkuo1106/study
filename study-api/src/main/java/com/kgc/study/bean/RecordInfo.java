package com.kgc.study.bean;

import org.springframework.security.core.userdetails.User;

import java.util.Date;

public class RecordInfo {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String recordTestName;

    private Date recordTestData;

    private Integer recordTestScore;

    private Integer recordTestCount;

    private Integer userId;

    private String recordTestIdList;

    private String recordTestKeysList;

    private Integer logicDelete;

    private EduUser user;

    public EduUser getUser() {
        return user;
    }

    public void setUser(EduUser user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getRecordTestName() {
        return recordTestName;
    }

    public void setRecordTestName(String recordTestName) {
        this.recordTestName = recordTestName == null ? null : recordTestName.trim();
    }

    public Date getRecordTestData() {
        return recordTestData;
    }

    public void setRecordTestData(Date recordTestData) {
        this.recordTestData = recordTestData;
    }

    public Integer getRecordTestScore() {
        return recordTestScore;
    }

    public void setRecordTestScore(Integer recordTestScore) {
        this.recordTestScore = recordTestScore;
    }

    public Integer getRecordTestCount() {
        return recordTestCount;
    }

    public void setRecordTestCount(Integer recordTestCount) {
        this.recordTestCount = recordTestCount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRecordTestIdList() {
        return recordTestIdList;
    }

    public void setRecordTestIdList(String recordTestIdList) {
        this.recordTestIdList = recordTestIdList == null ? null : recordTestIdList.trim();
    }

    public String getRecordTestKeysList() {
        return recordTestKeysList;
    }

    public void setRecordTestKeysList(String recordTestKeysList) {
        this.recordTestKeysList = recordTestKeysList == null ? null : recordTestKeysList.trim();
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}