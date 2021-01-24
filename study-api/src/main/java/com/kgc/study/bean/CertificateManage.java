package com.kgc.study.bean;

import java.util.Date;

public class CertificateManage {
    private Integer id;

    private Integer cerAllId;

    private Integer cerStudentId;

    private Long cerGroupExamScore;

    private Long cerExamScore;

    private Long cerSumScore;

    private Date cerExaminationDate;

    private Date cerGetTime;

    private Date adminGmtCreate;

    private Date adminGmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCerAllId() {
        return cerAllId;
    }

    public void setCerAllId(Integer cerAllId) {
        this.cerAllId = cerAllId;
    }

    public Integer getCerStudentId() {
        return cerStudentId;
    }

    public void setCerStudentId(Integer cerStudentId) {
        this.cerStudentId = cerStudentId;
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

    public Date getAdminGmtCreate() {
        return adminGmtCreate;
    }

    public void setAdminGmtCreate(Date adminGmtCreate) {
        this.adminGmtCreate = adminGmtCreate;
    }

    public Date getAdminGmtModified() {
        return adminGmtModified;
    }

    public void setAdminGmtModified(Date adminGmtModified) {
        this.adminGmtModified = adminGmtModified;
    }
}