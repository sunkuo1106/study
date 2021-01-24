package com.kgc.study.bean;

import java.util.Date;

public class ExamInfo {
    private Long id;

    private Date examGmtCreate;

    private Date examGmtModified;

    private Integer examUserId;

    private Integer examGradeId;

    private Integer examQbId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getExamGmtCreate() {
        return examGmtCreate;
    }

    public void setExamGmtCreate(Date examGmtCreate) {
        this.examGmtCreate = examGmtCreate;
    }

    public Date getExamGmtModified() {
        return examGmtModified;
    }

    public void setExamGmtModified(Date examGmtModified) {
        this.examGmtModified = examGmtModified;
    }

    public Integer getExamUserId() {
        return examUserId;
    }

    public void setExamUserId(Integer examUserId) {
        this.examUserId = examUserId;
    }

    public Integer getExamGradeId() {
        return examGradeId;
    }

    public void setExamGradeId(Integer examGradeId) {
        this.examGradeId = examGradeId;
    }

    public Integer getExamQbId() {
        return examQbId;
    }

    public void setExamQbId(Integer examQbId) {
        this.examQbId = examQbId;
    }
}