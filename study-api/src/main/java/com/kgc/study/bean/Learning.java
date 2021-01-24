package com.kgc.study.bean;

import java.util.Date;

public class Learning {
    private Long id;

    private Integer courseId;

    private Integer learCount;

    private String courseName;

    private Date learUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getLearCount() {
        return learCount;
    }

    public void setLearCount(Integer learCount) {
        this.learCount = learCount;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Date getLearUpdateTime() {
        return learUpdateTime;
    }

    public void setLearUpdateTime(Date learUpdateTime) {
        this.learUpdateTime = learUpdateTime;
    }
}