package com.kgc.study.bean;

import java.util.Date;

public class RecordInfo {
    private Long id;

    private Date recordGmtCreate;

    private Date recordGmtModified;

    private String recordTestName;

    private Date recordTestData;

    private Integer recordTestScore;

    private Integer recordTestCount;

    private Integer recordUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRecordGmtCreate() {
        return recordGmtCreate;
    }

    public void setRecordGmtCreate(Date recordGmtCreate) {
        this.recordGmtCreate = recordGmtCreate;
    }

    public Date getRecordGmtModified() {
        return recordGmtModified;
    }

    public void setRecordGmtModified(Date recordGmtModified) {
        this.recordGmtModified = recordGmtModified;
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

    public Integer getRecordUserId() {
        return recordUserId;
    }

    public void setRecordUserId(Integer recordUserId) {
        this.recordUserId = recordUserId;
    }
}