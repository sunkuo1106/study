package com.kgc.study.bean;

import java.util.Date;

public class Answer {
    private Long answerId;

    private Date answerGmtCreate;

    private Date answerGmtModified;

    private Integer courseId;

    private String answerTitle;

    private Integer answerType;

    private Integer answerStatus;

    private Integer answerHuiCount;

    private Integer answerDianCount;

    private Date answerAddTime;

    private String answerContent;

    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public Date getAnswerGmtCreate() {
        return answerGmtCreate;
    }

    public void setAnswerGmtCreate(Date answerGmtCreate) {
        this.answerGmtCreate = answerGmtCreate;
    }

    public Date getAnswerGmtModified() {
        return answerGmtModified;
    }

    public void setAnswerGmtModified(Date answerGmtModified) {
        this.answerGmtModified = answerGmtModified;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getAnswerTitle() {
        return answerTitle;
    }

    public void setAnswerTitle(String answerTitle) {
        this.answerTitle = answerTitle == null ? null : answerTitle.trim();
    }

    public Integer getAnswerType() {
        return answerType;
    }

    public void setAnswerType(Integer answerType) {
        this.answerType = answerType;
    }

    public Integer getAnswerStatus() {
        return answerStatus;
    }

    public void setAnswerStatus(Integer answerStatus) {
        this.answerStatus = answerStatus;
    }

    public Integer getAnswerHuiCount() {
        return answerHuiCount;
    }

    public void setAnswerHuiCount(Integer answerHuiCount) {
        this.answerHuiCount = answerHuiCount;
    }

    public Integer getAnswerDianCount() {
        return answerDianCount;
    }

    public void setAnswerDianCount(Integer answerDianCount) {
        this.answerDianCount = answerDianCount;
    }

    public Date getAnswerAddTime() {
        return answerAddTime;
    }

    public void setAnswerAddTime(Date answerAddTime) {
        this.answerAddTime = answerAddTime;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent == null ? null : answerContent.trim();
    }
}