package com.kgc.study.bean;

import java.util.Date;

public class Teacher {
    private Long teacherId;

    private Date teacherGmtCreate;

    private Date teacherGmtModified;

    private String tchName;

    private String tchEducation;

    private Integer tchIsStar;

    private String tchPicPath;

    private Date tchStatus;

    private String tchSubject;

    private String tchCareer;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Date getTeacherGmtCreate() {
        return teacherGmtCreate;
    }

    public void setTeacherGmtCreate(Date teacherGmtCreate) {
        this.teacherGmtCreate = teacherGmtCreate;
    }

    public Date getTeacherGmtModified() {
        return teacherGmtModified;
    }

    public void setTeacherGmtModified(Date teacherGmtModified) {
        this.teacherGmtModified = teacherGmtModified;
    }

    public String getTchName() {
        return tchName;
    }

    public void setTchName(String tchName) {
        this.tchName = tchName == null ? null : tchName.trim();
    }

    public String getTchEducation() {
        return tchEducation;
    }

    public void setTchEducation(String tchEducation) {
        this.tchEducation = tchEducation == null ? null : tchEducation.trim();
    }

    public Integer getTchIsStar() {
        return tchIsStar;
    }

    public void setTchIsStar(Integer tchIsStar) {
        this.tchIsStar = tchIsStar;
    }

    public String getTchPicPath() {
        return tchPicPath;
    }

    public void setTchPicPath(String tchPicPath) {
        this.tchPicPath = tchPicPath == null ? null : tchPicPath.trim();
    }

    public Date getTchStatus() {
        return tchStatus;
    }

    public void setTchStatus(Date tchStatus) {
        this.tchStatus = tchStatus;
    }

    public String getTchSubject() {
        return tchSubject;
    }

    public void setTchSubject(String tchSubject) {
        this.tchSubject = tchSubject == null ? null : tchSubject.trim();
    }

    public String getTchCareer() {
        return tchCareer;
    }

    public void setTchCareer(String tchCareer) {
        this.tchCareer = tchCareer == null ? null : tchCareer.trim();
    }
}