package com.kgc.study.bean;

import java.util.Date;

public class PolicyInfo {
    private Long id;

    private String policyInfoTitle;

    private String policyInfoSummary;

    private String policyInfoKeyWord;

    private String policyInfoSource;

    private String policyInfoAuthor;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer policyInfoIstop;

    private String policyInfoThumbnail;

    private Integer logicDelete;

    private String policyInfoText;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyInfoTitle() {
        return policyInfoTitle;
    }

    public void setPolicyInfoTitle(String policyInfoTitle) {
        this.policyInfoTitle = policyInfoTitle == null ? null : policyInfoTitle.trim();
    }

    public String getPolicyInfoSummary() {
        return policyInfoSummary;
    }

    public void setPolicyInfoSummary(String policyInfoSummary) {
        this.policyInfoSummary = policyInfoSummary == null ? null : policyInfoSummary.trim();
    }

    public String getPolicyInfoKeyWord() {
        return policyInfoKeyWord;
    }

    public void setPolicyInfoKeyWord(String policyInfoKeyWord) {
        this.policyInfoKeyWord = policyInfoKeyWord == null ? null : policyInfoKeyWord.trim();
    }

    public String getPolicyInfoSource() {
        return policyInfoSource;
    }

    public void setPolicyInfoSource(String policyInfoSource) {
        this.policyInfoSource = policyInfoSource == null ? null : policyInfoSource.trim();
    }

    public String getPolicyInfoAuthor() {
        return policyInfoAuthor;
    }

    public void setPolicyInfoAuthor(String policyInfoAuthor) {
        this.policyInfoAuthor = policyInfoAuthor == null ? null : policyInfoAuthor.trim();
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

    public Integer getPolicyInfoIstop() {
        return policyInfoIstop;
    }

    public void setPolicyInfoIstop(Integer policyInfoIstop) {
        this.policyInfoIstop = policyInfoIstop;
    }

    public String getPolicyInfoThumbnail() {
        return policyInfoThumbnail;
    }

    public void setPolicyInfoThumbnail(String policyInfoThumbnail) {
        this.policyInfoThumbnail = policyInfoThumbnail == null ? null : policyInfoThumbnail.trim();
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }

    public String getPolicyInfoText() {
        return policyInfoText;
    }

    public void setPolicyInfoText(String policyInfoText) {
        this.policyInfoText = policyInfoText == null ? null : policyInfoText.trim();
    }
}