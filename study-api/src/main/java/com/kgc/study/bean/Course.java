package com.kgc.study.bean;

import java.util.Date;

public class Course {
    private Long id;

    private String courseName;

    private String courseSubjec;

    private Date courseStartTime;

    private String courseIntroduction;

    private String courseContent;

    private Integer courseLessionNum;

    private String courseVideoUrl;

    private Date courseEndUpdateTime;

    private Integer pageViewcount;

    private Date courseEndTime;

    private Long currId;

    private Long teacherId;

    private Integer logicDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCourseSubjec() {
        return courseSubjec;
    }

    public void setCourseSubjec(String courseSubjec) {
        this.courseSubjec = courseSubjec == null ? null : courseSubjec.trim();
    }

    public Date getCourseStartTime() {
        return courseStartTime;
    }

    public void setCourseStartTime(Date courseStartTime) {
        this.courseStartTime = courseStartTime;
    }

    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction == null ? null : courseIntroduction.trim();
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent == null ? null : courseContent.trim();
    }

    public Integer getCourseLessionNum() {
        return courseLessionNum;
    }

    public void setCourseLessionNum(Integer courseLessionNum) {
        this.courseLessionNum = courseLessionNum;
    }

    public String getCourseVideoUrl() {
        return courseVideoUrl;
    }

    public void setCourseVideoUrl(String courseVideoUrl) {
        this.courseVideoUrl = courseVideoUrl == null ? null : courseVideoUrl.trim();
    }

    public Date getCourseEndUpdateTime() {
        return courseEndUpdateTime;
    }

    public void setCourseEndUpdateTime(Date courseEndUpdateTime) {
        this.courseEndUpdateTime = courseEndUpdateTime;
    }

    public Integer getPageViewcount() {
        return pageViewcount;
    }

    public void setPageViewcount(Integer pageViewcount) {
        this.pageViewcount = pageViewcount;
    }

    public Date getCourseEndTime() {
        return courseEndTime;
    }

    public void setCourseEndTime(Date courseEndTime) {
        this.courseEndTime = courseEndTime;
    }

    public Long getCurrId() {
        return currId;
    }

    public void setCurrId(Long currId) {
        this.currId = currId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}