package com.kgc.study.bean;

import java.util.Date;

public class CourseSubject {
    private Long courseId;

    private Date courseSubjectGmtCreate;

    private Date courseSubjectGmtModified;

    private Integer subjectId;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
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

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }
}