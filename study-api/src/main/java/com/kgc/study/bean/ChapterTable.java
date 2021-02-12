package com.kgc.study.bean;

import java.util.Date;

public class ChapterTable {
    private Long chapterTableId;

    private String chapterName;

    private Long courseId;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer logicDelete;

    public Long getChapterTableId() {
        return chapterTableId;
    }

    public void setChapterTableId(Long chapterTableId) {
        this.chapterTableId = chapterTableId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
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