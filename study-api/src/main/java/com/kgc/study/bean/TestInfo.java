package com.kgc.study.bean;

import java.util.Date;

public class TestInfo {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String testName;

    private Integer testScore;

    private Integer testType;

    private String testA;

    private String testB;

    private String testC;

    private String testD;

    private String testKeys;

    private String testHints;

    private String testCourseTitle;

    private Integer logicDelete;

    private String keys;

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
    @Override
    public String toString() {
        return "TestInfo{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", testName='" + testName + '\'' +
                ", testScore=" + testScore +
                ", testType=" + testType +
                ", testA='" + testA + '\'' +
                ", testB='" + testB + '\'' +
                ", testC='" + testC + '\'' +
                ", testD='" + testD + '\'' +
                ", testKeys='" + testKeys + '\'' +
                ", testHints='" + testHints + '\'' +
                ", testCourseTitle='" + testCourseTitle + '\'' +
                ", logicDelete=" + logicDelete +
                '}';
    }

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

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName == null ? null : testName.trim();
    }

    public Integer getTestScore() {
        return testScore;
    }

    public void setTestScore(Integer testScore) {
        this.testScore = testScore;
    }

    public Integer getTestType() {
        return testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
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