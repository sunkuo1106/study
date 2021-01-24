package com.kgc.study.bean;

import java.util.Date;

public class Remark {
    private Long remarkId;

    private Date remarkGmtCreate;

    private Date remarkGmtModified;

    private Integer eduUserId;

    private Integer remarkSum;

    private Integer courseId;

    private String remarkDetails;

    private Integer remarkIds;

    private Date remarkAddtime;

    public Long getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(Long remarkId) {
        this.remarkId = remarkId;
    }

    public Date getRemarkGmtCreate() {
        return remarkGmtCreate;
    }

    public void setRemarkGmtCreate(Date remarkGmtCreate) {
        this.remarkGmtCreate = remarkGmtCreate;
    }

    public Date getRemarkGmtModified() {
        return remarkGmtModified;
    }

    public void setRemarkGmtModified(Date remarkGmtModified) {
        this.remarkGmtModified = remarkGmtModified;
    }

    public Integer getEduUserId() {
        return eduUserId;
    }

    public void setEduUserId(Integer eduUserId) {
        this.eduUserId = eduUserId;
    }

    public Integer getRemarkSum() {
        return remarkSum;
    }

    public void setRemarkSum(Integer remarkSum) {
        this.remarkSum = remarkSum;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getRemarkDetails() {
        return remarkDetails;
    }

    public void setRemarkDetails(String remarkDetails) {
        this.remarkDetails = remarkDetails == null ? null : remarkDetails.trim();
    }

    public Integer getRemarkIds() {
        return remarkIds;
    }

    public void setRemarkIds(Integer remarkIds) {
        this.remarkIds = remarkIds;
    }

    public Date getRemarkAddtime() {
        return remarkAddtime;
    }

    public void setRemarkAddtime(Date remarkAddtime) {
        this.remarkAddtime = remarkAddtime;
    }
}