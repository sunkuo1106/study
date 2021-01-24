package com.kgc.study.bean;

import java.util.Date;

public class CurriculumsTable {
    private Long currId;

    private String currName;

    private Long currMgrId;

    private Date courseSubjectGmtCreate;

    private Date courseSubjectGmtModified;

    public Long getCurrId() {
        return currId;
    }

    public void setCurrId(Long currId) {
        this.currId = currId;
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

    public Date getCourseSubjectGmtCreate() {
        return courseSubjectGmtCreate;
    }

    public void setCourseSubjectGmtCreate(Date courseSubjectGmtCreate) {
        this.courseSubjectGmtCreate = courseSubjectGmtCreate;
    }

    public Date getCourseSubjectGmtModified() {
        return courseSubjectGmtModified;
    }

    public void setCourseSubjectGmtModified(Date courseSubjectGmtModified) {
        this.courseSubjectGmtModified = courseSubjectGmtModified;
    }
}