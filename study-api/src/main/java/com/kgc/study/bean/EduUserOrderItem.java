package com.kgc.study.bean;

import java.util.Date;

public class EduUserOrderItem {
    private Integer id;

    private Date gmtCreate;

    private Date gmtModified;

    private String eduOrderName;

    private String eduOrderIdCard;

    private String eduOrderPhone;

    private String eduOrderClass;

    private String eduOrderClassType;

    private String eduOrderClassPrice;

    private Integer eduOrderType;

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

    public String getEduOrderName() {
        return eduOrderName;
    }

    public void setEduOrderName(String eduOrderName) {
        this.eduOrderName = eduOrderName == null ? null : eduOrderName.trim();
    }

    public String getEduOrderIdCard() {
        return eduOrderIdCard;
    }

    public void setEduOrderIdCard(String eduOrderIdCard) {
        this.eduOrderIdCard = eduOrderIdCard == null ? null : eduOrderIdCard.trim();
    }

    public String getEduOrderPhone() {
        return eduOrderPhone;
    }

    public void setEduOrderPhone(String eduOrderPhone) {
        this.eduOrderPhone = eduOrderPhone == null ? null : eduOrderPhone.trim();
    }

    public String getEduOrderClass() {
        return eduOrderClass;
    }

    public void setEduOrderClass(String eduOrderClass) {
        this.eduOrderClass = eduOrderClass == null ? null : eduOrderClass.trim();
    }

    public String getEduOrderClassType() {
        return eduOrderClassType;
    }

    public void setEduOrderClassType(String eduOrderClassType) {
        this.eduOrderClassType = eduOrderClassType == null ? null : eduOrderClassType.trim();
    }

    public String getEduOrderClassPrice() {
        return eduOrderClassPrice;
    }

    public void setEduOrderClassPrice(String eduOrderClassPrice) {
        this.eduOrderClassPrice = eduOrderClassPrice == null ? null : eduOrderClassPrice.trim();
    }

    public Integer getEduOrderType() {
        return eduOrderType;
    }

    public void setEduOrderType(Integer eduOrderType) {
        this.eduOrderType = eduOrderType;
    }
}