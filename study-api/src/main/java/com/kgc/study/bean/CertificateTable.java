package com.kgc.study.bean;

import java.util.Date;

public class CertificateTable {
    private Integer id;

    private Integer eduUserId;

    private Long cerGroupExamScore;

    private Long cerExamScore;

    private Long cerSumScore;

    private Date cerExaminationDate;

    private Date cerGetTime;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer logicDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEduUserId() {
        return eduUserId;
    }

    public void setEduUserId(Integer eduUserId) {
        this.eduUserId = eduUserId;
    }

    public Long getCerGroupExamScore() {
        return cerGroupExamScore;
    }

    public void setCerGroupExamScore(Long cerGroupExamScore) {
        this.cerGroupExamScore = cerGroupExamScore;
    }

    public Long getCerExamScore() {
        return cerExamScore;
    }

    public void setCerExamScore(Long cerExamScore) {
        this.cerExamScore = cerExamScore;
    }

    public Long getCerSumScore() {
        return cerSumScore;
    }

    public void setCerSumScore(Long cerSumScore) {
        this.cerSumScore = cerSumScore;
    }

    public Date getCerExaminationDate() {
        return cerExaminationDate;
    }

    public void setCerExaminationDate(Date cerExaminationDate) {
        this.cerExaminationDate = cerExaminationDate;
    }

    public Date getCerGetTime() {
        return cerGetTime;
    }

    public void setCerGetTime(Date cerGetTime) {
        this.cerGetTime = cerGetTime;
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

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}