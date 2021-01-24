package com.kgc.study.bean;

import java.util.Date;

public class ActivityInfo {
    private Long id;

    private String acInfoSummary;

    private String acInfoSource;

    private String acInfoAuthor;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer acInfoClickNum;

    private Integer acInfoPraiseCount;

    private Integer acInfoCommentNum;

    private Integer acIstop;

    private Integer acTypeId;

    private Integer acThumbnail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getAcInfoClickNum() {
        return acInfoClickNum;
    }

    public void setAcInfoClickNum(Integer acInfoClickNum) {
        this.acInfoClickNum = acInfoClickNum;
    }

    public Integer getAcInfoPraiseCount() {
        return acInfoPraiseCount;
    }

    public void setAcInfoPraiseCount(Integer acInfoPraiseCount) {
        this.acInfoPraiseCount = acInfoPraiseCount;
    }

    public Integer getAcInfoCommentNum() {
        return acInfoCommentNum;
    }

    public void setAcInfoCommentNum(Integer acInfoCommentNum) {
        this.acInfoCommentNum = acInfoCommentNum;
    }

    public Integer getAcIstop() {
        return acIstop;
    }

    public void setAcIstop(Integer acIstop) {
        this.acIstop = acIstop;
    }

    public Integer getAcTypeId() {
        return acTypeId;
    }

    public void setAcTypeId(Integer acTypeId) {
        this.acTypeId = acTypeId;
    }

    public Integer getAcThumbnail() {
        return acThumbnail;
    }

    public void setAcThumbnail(Integer acThumbnail) {
        this.acThumbnail = acThumbnail;
    }
}