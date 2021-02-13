package com.kgc.study.bean;

import java.util.Date;

public class PastExamPaper {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String pepImage;

    private Date pepExamDate;

    private String pepTestInfoId;

    private Integer logicDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPepImage() {
        return pepImage;
    }

    public void setPepImage(String pepImage) {
        this.pepImage = pepImage == null ? null : pepImage.trim();
    }

    public Date getPepExamDate() {
        return pepExamDate;
    }

    public void setPepExamDate(Date pepExamDate) {
        this.pepExamDate = pepExamDate;
    }

    public String getPepTestInfoId() {
        return pepTestInfoId;
    }

    public void setPepTestInfoId(String pepTestInfoId) {
        this.pepTestInfoId = pepTestInfoId == null ? null : pepTestInfoId.trim();
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}