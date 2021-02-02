package com.kgc.study.bean;

import java.util.Date;

public class GradeInfo {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer agencyAddressId;

    private String gradeName;

    private Integer gradeTypeId;

    private Integer gradePerson;

    private Date gradeStartTime;

    private Integer gradeGmtFounderId;

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

    public Integer getAgencyAddressId() {
        return agencyAddressId;
    }

    public void setAgencyAddressId(Integer agencyAddressId) {
        this.agencyAddressId = agencyAddressId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public Integer getGradeTypeId() {
        return gradeTypeId;
    }

    public void setGradeTypeId(Integer gradeTypeId) {
        this.gradeTypeId = gradeTypeId;
    }

    public Integer getGradePerson() {
        return gradePerson;
    }

    public void setGradePerson(Integer gradePerson) {
        this.gradePerson = gradePerson;
    }

    public Date getGradeStartTime() {
        return gradeStartTime;
    }

    public void setGradeStartTime(Date gradeStartTime) {
        this.gradeStartTime = gradeStartTime;
    }

    public Integer getGradeGmtFounderId() {
        return gradeGmtFounderId;
    }

    public void setGradeGmtFounderId(Integer gradeGmtFounderId) {
        this.gradeGmtFounderId = gradeGmtFounderId;
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}