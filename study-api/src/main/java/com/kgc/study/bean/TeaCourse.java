package com.kgc.study.bean;

import java.util.Date;

public class TeaCourse {
    private Long courseId;

    private Date teaCourseGmtCreate;

    private Date teaCourserGmtModified;

    private Integer teacherId;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Date getTeaCourseGmtCreate() {
        return teaCourseGmtCreate;
    }

    public void setTeaCourseGmtCreate(Date teaCourseGmtCreate) {
        this.teaCourseGmtCreate = teaCourseGmtCreate;
    }

    public Date getTeaCourserGmtModified() {
        return teaCourserGmtModified;
    }

    public void setTeaCourserGmtModified(Date teaCourserGmtModified) {
        this.teaCourserGmtModified = teaCourserGmtModified;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}