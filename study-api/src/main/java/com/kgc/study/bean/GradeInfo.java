package com.kgc.study.bean;

import java.util.Date;

public class GradeInfo {
    private Long id;

    private Date gradeGmtCreate;

    private Date fradeGmtModified;

    private Integer gradeAddressId;

    private String gradeName;

    private String gradeType;

    private Integer gradePerson;

    private Date gradeDate;

    private Long gradePrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGradeGmtCreate() {
        return gradeGmtCreate;
    }

    public void setGradeGmtCreate(Date gradeGmtCreate) {
        this.gradeGmtCreate = gradeGmtCreate;
    }

    public Date getFradeGmtModified() {
        return fradeGmtModified;
    }

    public void setFradeGmtModified(Date fradeGmtModified) {
        this.fradeGmtModified = fradeGmtModified;
    }

    public Integer getGradeAddressId() {
        return gradeAddressId;
    }

    public void setGradeAddressId(Integer gradeAddressId) {
        this.gradeAddressId = gradeAddressId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public String getGradeType() {
        return gradeType;
    }

    public void setGradeType(String gradeType) {
        this.gradeType = gradeType == null ? null : gradeType.trim();
    }

    public Integer getGradePerson() {
        return gradePerson;
    }

    public void setGradePerson(Integer gradePerson) {
        this.gradePerson = gradePerson;
    }

    public Date getGradeDate() {
        return gradeDate;
    }

    public void setGradeDate(Date gradeDate) {
        this.gradeDate = gradeDate;
    }

    public Long getGradePrice() {
        return gradePrice;
    }

    public void setGradePrice(Long gradePrice) {
        this.gradePrice = gradePrice;
    }
}