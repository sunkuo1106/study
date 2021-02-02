package com.kgc.study.bean;

import java.util.Date;

public class ActivityInfo {
    private Long id;

    private String acInfoTitle;

    private String acInfoSummary;

    private String acInfoSource;

    private String acInfoAuthor;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer acIstop;

    private String acThumbnail;

    private Integer logicDelete;

    private String acContentName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcInfoTitle() {
        return acInfoTitle;
    }

    public void setAcInfoTitle(String acInfoTitle) {
        this.acInfoTitle = acInfoTitle == null ? null : acInfoTitle.trim();
    }

    public String getAcInfoSummary() {
        return acInfoSummary;
    }

    public void setAcInfoSummary(String acInfoSummary) {
        this.acInfoSummary = acInfoSummary == null ? null : acInfoSummary.trim();
    }

    public String getAcInfoSource() {
        return acInfoSource;
    }

    public void setAcInfoSource(String acInfoSource) {
        this.acInfoSource = acInfoSource == null ? null : acInfoSource.trim();
    }

    public String getAcInfoAuthor() {
        return acInfoAuthor;
    }

    public void setAcInfoAuthor(String acInfoAuthor) {
        this.acInfoAuthor = acInfoAuthor == null ? null : acInfoAuthor.trim();
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

    public Integer getAcIstop() {
        return acIstop;
    }

    public void setAcIstop(Integer acIstop) {
        this.acIstop = acIstop;
    }

    public String getAcThumbnail() {
        return acThumbnail;
    }

    public void setAcThumbnail(String acThumbnail) {
        this.acThumbnail = acThumbnail == null ? null : acThumbnail.trim();
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }

    public String getAcContentName() {
        return acContentName;
    }

    public void setAcContentName(String acContentName) {
        this.acContentName = acContentName == null ? null : acContentName.trim();
    }
}