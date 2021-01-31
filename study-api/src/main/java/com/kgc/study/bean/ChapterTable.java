package com.kgc.study.bean;

import java.util.Date;

public class ChapterTable {
    private Integer chapterTableId;

    private String courseName;

    private Long courseId;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer logicDelete;

    public Integer getChapterTableId() {
        return chapterTableId;
    }

    public void setChapterTableId(Integer chapterTableId) {
        this.chapterTableId = chapterTableId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
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

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}