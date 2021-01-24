package com.kgc.study.bean;

import java.util.Date;

public class TestInfo {
    private Long id;

    private Date testGmtCreate;

    private Date testGmtModified;

    private String testName;

    private Integer testQbId;

    private Date testTime;

    private Integer testScore;

    private Integer testType;

    private String testA;

    private String testB;

    private String testC;

    private String testD;

    private String testKeys;

    private String testHints;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTestGmtCreate() {
        return testGmtCreate;
    }

    public void setTestGmtCreate(Date testGmtCreate) {
        this.testGmtCreate = testGmtCreate;
    }

    public Date getTestGmtModified() {
        return testGmtModified;
    }

    public void setTestGmtModified(Date testGmtModified) {
        this.testGmtModified = testGmtModified;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName == null ? null : testName.trim();
    }

    public Integer getTestQbId() {
        return testQbId;
    }

    public void setTestQbId(Integer testQbId) {
        this.testQbId = testQbId;
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
}