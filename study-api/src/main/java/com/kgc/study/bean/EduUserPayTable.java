package com.kgc.study.bean;

import java.util.Date;

public class EduUserPayTable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String eduOrderName;

    private String eduOrderIdCard;

    private String eduOrderPhone;

    private Long eduOrderClassPrice;

    private Integer eduOrderType;

    private Integer eduOrderPayment;

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

    public Long getEduOrderClassPrice() {
        return eduOrderClassPrice;
    }

    public void setEduOrderClassPrice(Long eduOrderClassPrice) {
        this.eduOrderClassPrice = eduOrderClassPrice;
    }

    public Integer getEduOrderType() {
        return eduOrderType;
    }

    public void setEduOrderType(Integer eduOrderType) {
        this.eduOrderType = eduOrderType;
    }

    public Integer getEduOrderPayment() {
        return eduOrderPayment;
    }

    public void setEduOrderPayment(Integer eduOrderPayment) {
        this.eduOrderPayment = eduOrderPayment;
    }
}