package com.kgc.study.bean;

import java.util.Date;

public class Course {
    private Long id;

    private String courseName;

    private String courseSubjec;

    private Date courseAddtime;

    private String courseTitle;

    private String courseContent;

    private Integer courseLessionNum;

    private String courseVideoUrl;

    private Date courseUpdateTime;

    private Integer pageViewcount;

    private Date courseEndTime;

    private Long currId;

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

    public Date getCourseAddtime() {
        return courseAddtime;
    }

    public void setCourseAddtime(Date courseAddtime) {
        this.courseAddtime = courseAddtime;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle == null ? null : courseTitle.trim();
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

    public Date getCourseUpdateTime() {
        return courseUpdateTime;
    }

    public void setCourseUpdateTime(Date courseUpdateTime) {
        this.courseUpdateTime = courseUpdateTime;
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
}