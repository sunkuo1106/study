package com.kgc.study.bean;

import java.util.Date;

public class TestInfo {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Date testTime;

    private Integer testScore;

    private Integer testTyepe;

    private String testA;

    private String testB;

    private String testC;

    private String testD;

    private String testKeys;

    private String testHints;

    private String testCourseTitle;

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

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }

    public Integer getTestScore() {
        return testScore;
    }

    public void setTestScore(Integer testScore) {
        this.testScore = testScore;
    }

    public Integer getTestTyepe() {
        return testTyepe;
    }

    public void setTestTyepe(Integer testTyepe) {
        this.testTyepe = testTyepe;
    }

    public String getTestA() {
        return testA;
    }

    public void setTestA(String testA) {
        this.testA = testA == null ? null : testA.trim();
    }

    public String getTestB() {
        return testB;
    }

    public void setTestB(String testB) {
        this.testB = testB == null ? null : testB.trim();
    }

    public String getTestC() {
        return testC;
    }

    public void setTestC(String testC) {
        this.testC = testC == null ? null : testC.trim();
    }

    public String getTestD() {
        return testD;
    }

    public void setTestD(String testD) {
        this.testD = testD == null ? null : testD.trim();
    }

    public String getTestKeys() {
        return testKeys;
    }

    public void setTestKeys(String testKeys) {
        this.testKeys = testKeys == null ? null : testKeys.trim();
    }

    public String getTestHints() {
        return testHints;
    }

    public void setTestHints(String testHints) {
        this.testHints = testHints == null ? null : testHints.trim();
    }

    public String getTestCourseTitle() {
        return testCourseTitle;
    }

    public void setTestCourseTitle(String testCourseTitle) {
        this.testCourseTitle = testCourseTitle == null ? null : testCourseTitle.trim();
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}