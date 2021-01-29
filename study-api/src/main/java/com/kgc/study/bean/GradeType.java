package com.kgc.study.bean;

import java.util.Date;

public class GradeType {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String gradeTyepName;

    private Long gradeTypePrice;

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

    public String getGradeTyepName() {
        return gradeTyepName;
    }

    public void setGradeTyepName(String gradeTyepName) {
        this.gradeTyepName = gradeTyepName == null ? null : gradeTyepName.trim();
    }

    public Long getGradeTypePrice() {
        return gradeTypePrice;
    }

    public void setGradeTypePrice(Long gradeTypePrice) {
        this.gradeTypePrice = gradeTypePrice;
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}