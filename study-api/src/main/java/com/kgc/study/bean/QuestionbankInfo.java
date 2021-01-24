package com.kgc.study.bean;

import java.util.Date;

public class QuestionbankInfo {
    private Long id;

    private Date qbGmtCreate;

    private Date qbGmtModified;

    private String qbName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getQbGmtCreate() {
        return qbGmtCreate;
    }

    public void setQbGmtCreate(Date qbGmtCreate) {
        this.qbGmtCreate = qbGmtCreate;
    }

    public Date getQbGmtModified() {
        return qbGmtModified;
    }

    public void setQbGmtModified(Date qbGmtModified) {
        this.qbGmtModified = qbGmtModified;
    }

    public String getQbName() {
        return qbName;
    }

    public void setQbName(String qbName) {
        this.qbName = qbName == null ? null : qbName.trim();
    }
}