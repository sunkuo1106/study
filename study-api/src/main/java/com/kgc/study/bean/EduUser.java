package com.kgc.study.bean;

import java.util.Date;

public class EduUser {
    private Integer id;

    private Date gmtCreate;

    private Date gmtModified;

    private String eduUserName;

    private String eduUserPhone;

    private String eduUserIdCard;

    private Byte eduUserGender;

    private String eduUserPicImg;

    private Date eduUserSchoolRoll;

    private Byte eduUserIsPass;

    private String eduUserEmail;

    private String eduUserIsAvalible;

    private Integer eduUserIsGoodStudent;

    private Byte eduUserEnrollmentMethod;

    private Integer mechanismId;

    private String eduUserIdentityFront;

    private String eduUserIdentityReverse;

    private String eduUserSchoolProve;

    private String eduUserWorkProve;

    private String eduUserSoldierProve;

    private String eduUserHighestEducation;

    private Integer eduUserClass;

    private Integer eduUserClassType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getEduUserName() {
        return eduUserName;
    }

    public void setEduUserName(String eduUserName) {
        this.eduUserName = eduUserName == null ? null : eduUserName.trim();
    }

    public String getEduUserPhone() {
        return eduUserPhone;
    }

    public void setEduUserPhone(String eduUserPhone) {
        this.eduUserPhone = eduUserPhone == null ? null : eduUserPhone.trim();
    }

    public String getEduUserIdCard() {
        return eduUserIdCard;
    }

    public void setEduUserIdCard(String eduUserIdCard) {
        this.eduUserIdCard = eduUserIdCard == null ? null : eduUserIdCard.trim();
    }

    public Byte getEduUserGender() {
        return eduUserGender;
    }

    public void setEduUserGender(Byte eduUserGender) {
        this.eduUserGender = eduUserGender;
    }

    public String getEduUserPicImg() {
        return eduUserPicImg;
    }

    public void setEduUserPicImg(String eduUserPicImg) {
        this.eduUserPicImg = eduUserPicImg == null ? null : eduUserPicImg.trim();
    }

    public Date getEduUserSchoolRoll() {
        return eduUserSchoolRoll;
    }

    public void setEduUserSchoolRoll(Date eduUserSchoolRoll) {
        this.eduUserSchoolRoll = eduUserSchoolRoll;
    }

    public Byte getEduUserIsPass() {
        return eduUserIsPass;
    }

    public void setEduUserIsPass(Byte eduUserIsPass) {
        this.eduUserIsPass = eduUserIsPass;
    }

    public String getEduUserEmail() {
        return eduUserEmail;
    }

    public void setEduUserEmail(String eduUserEmail) {
        this.eduUserEmail = eduUserEmail == null ? null : eduUserEmail.trim();
    }

    public String getEduUserIsAvalible() {
        return eduUserIsAvalible;
    }

    public void setEduUserIsAvalible(String eduUserIsAvalible) {
        this.eduUserIsAvalible = eduUserIsAvalible == null ? null : eduUserIsAvalible.trim();
    }

    public Integer getEduUserIsGoodStudent() {
        return eduUserIsGoodStudent;
    }

    public void setEduUserIsGoodStudent(Integer eduUserIsGoodStudent) {
        this.eduUserIsGoodStudent = eduUserIsGoodStudent;
    }

    public Byte getEduUserEnrollmentMethod() {
        return eduUserEnrollmentMethod;
    }

    public void setEduUserEnrollmentMethod(Byte eduUserEnrollmentMethod) {
        this.eduUserEnrollmentMethod = eduUserEnrollmentMethod;
    }

    public Integer getMechanismId() {
        return mechanismId;
    }

    public void setMechanismId(Integer mechanismId) {
        this.mechanismId = mechanismId;
    }

    public String getEduUserIdentityFront() {
        return eduUserIdentityFront;
    }

    public void setEduUserIdentityFront(String eduUserIdentityFront) {
        this.eduUserIdentityFront = eduUserIdentityFront == null ? null : eduUserIdentityFront.trim();
    }

    public String getEduUserIdentityReverse() {
        return eduUserIdentityReverse;
    }

    public void setEduUserIdentityReverse(String eduUserIdentityReverse) {
        this.eduUserIdentityReverse = eduUserIdentityReverse == null ? null : eduUserIdentityReverse.trim();
    }

    public String getEduUserSchoolProve() {
        return eduUserSchoolProve;
    }

    public void setEduUserSchoolProve(String eduUserSchoolProve) {
        this.eduUserSchoolProve = eduUserSchoolProve == null ? null : eduUserSchoolProve.trim();
    }

    public String getEduUserWorkProve() {
        return eduUserWorkProve;
    }

    public void setEduUserWorkProve(String eduUserWorkProve) {
        this.eduUserWorkProve = eduUserWorkProve == null ? null : eduUserWorkProve.trim();
    }

    public String getEduUserSoldierProve() {
        return eduUserSoldierProve;
    }

    public void setEduUserSoldierProve(String eduUserSoldierProve) {
        this.eduUserSoldierProve = eduUserSoldierProve == null ? null : eduUserSoldierProve.trim();
    }

    public String getEduUserHighestEducation() {
        return eduUserHighestEducation;
    }

    public void setEduUserHighestEducation(String eduUserHighestEducation) {
        this.eduUserHighestEducation = eduUserHighestEducation == null ? null : eduUserHighestEducation.trim();
    }

    public Integer getEduUserClass() {
        return eduUserClass;
    }

    public void setEduUserClass(Integer eduUserClass) {
        this.eduUserClass = eduUserClass;
    }

    public Integer getEduUserClassType() {
        return eduUserClassType;
    }

    public void setEduUserClassType(Integer eduUserClassType) {
        this.eduUserClassType = eduUserClassType;
    }
}