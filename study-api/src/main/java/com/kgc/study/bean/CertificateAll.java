package com.kgc.study.bean;

import java.util.Date;

public class CertificateAll {
    private Integer id;

    private String cerName;

    private Date cerExamTime;

    private Integer cerExamType;

    private Integer cerExamScore;

    private Date adminGmtCreate;

    private Date adminGmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCerName() {
        return cerName;
    }

    public void setCerName(String cerName) {
        this.cerName = cerName == null ? null : cerName.trim();
    }

    public Date getCerExamTime() {
        return cerExamTime;
    }

    public void setCerExamTime(Date cerExamTime) {
        this.cerExamTime = cerExamTime;
    }

    public Integer getCerExamType() {
        return cerExamType;
    }

    public void setCerExamType(Integer cerExamType) {
        this.cerExamType = cerExamType;
    }

    public Integer getCerExamScore() {
        return cerExamScore;
    }

    public void setCerExamScore(Integer cerExamScore) {
        this.cerExamScore = cerExamScore;
    }

    public Date getAdminGmtCreate() {
        return adminGmtCreate;
    }

    public void setAdminGmtCreate(Date adminGmtCreate) {
        this.adminGmtCreate = adminGmtCreate;
    }

    public Date getAdminGmtModified() {
        return adminGmtModified;
    }

    public void setAdminGmtModified(Date adminGmtModified) {
        this.adminGmtModified = adminGmtModified;
    }
}