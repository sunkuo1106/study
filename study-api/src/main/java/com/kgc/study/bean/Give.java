package com.kgc.study.bean;

import java.util.Date;

public class Give {
    private Long giveId;

    private Date giveGmtCreate;

    private Date giveGmtModified;

    private Integer eduUserId;

    private Integer courseId;

    private Integer type;

    private Date addTime;

    public Long getGiveId() {
        return giveId;
    }

    public void setGiveId(Long giveId) {
        this.giveId = giveId;
    }

    public Date getGiveGmtCreate() {
        return giveGmtCreate;
    }

    public void setGiveGmtCreate(Date giveGmtCreate) {
        this.giveGmtCreate = giveGmtCreate;
    }

    public Date getGiveGmtModified() {
        return giveGmtModified;
    }

    public void setGiveGmtModified(Date giveGmtModified) {
        this.giveGmtModified = giveGmtModified;
    }

    public Integer getEduUserId() {
        return eduUserId;
    }

    public void setEduUserId(Integer eduUserId) {
        this.eduUserId = eduUserId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}