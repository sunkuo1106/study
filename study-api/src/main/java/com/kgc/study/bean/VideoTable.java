package com.kgc.study.bean;

import java.util.Date;

public class VideoTable {
    private Long videoTableId;

    private String videoTableName;

    private String videoTableUrl;

    private Long chapterTableId;

    private Long teacherId;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer logicDelete;

    public Long getVideoTableId() {
        return videoTableId;
    }

    public void setVideoTableId(Long videoTableId) {
        this.videoTableId = videoTableId;
    }

    public String getVideoTableName() {
        return videoTableName;
    }

    public void setVideoTableName(String videoTableName) {
        this.videoTableName = videoTableName == null ? null : videoTableName.trim();
    }

    public String getVideoTableUrl() {
        return videoTableUrl;
    }

    public void setVideoTableUrl(String videoTableUrl) {
        this.videoTableUrl = videoTableUrl == null ? null : videoTableUrl.trim();
    }

    public Long getChapterTableId() {
        return chapterTableId;
    }

    public void setChapterTableId(Long chapterTableId) {
        this.chapterTableId = chapterTableId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
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