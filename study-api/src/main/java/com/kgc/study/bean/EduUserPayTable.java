package com.kgc.study.bean;

import java.util.Date;

public class EduUserPayTable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String payUserName;

    private String payUserIdCard;

    private String payUserPhone;

    private Long eduOrderClassPrice;

    private Integer payStatus;

    private Integer payManner;

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

    public String getPayUserName() {
        return payUserName;
    }

    public void setPayUserName(String payUserName) {
        this.payUserName = payUserName == null ? null : payUserName.trim();
    }

    public String getPayUserIdCard() {
        return payUserIdCard;
    }

    public void setPayUserIdCard(String payUserIdCard) {
        this.payUserIdCard = payUserIdCard == null ? null : payUserIdCard.trim();
    }

    public String getPayUserPhone() {
        return payUserPhone;
    }

    public void setPayUserPhone(String payUserPhone) {
        this.payUserPhone = payUserPhone == null ? null : payUserPhone.trim();
    }

    public Long getEduOrderClassPrice() {
        return eduOrderClassPrice;
    }

    public void setEduOrderClassPrice(Long eduOrderClassPrice) {
        this.eduOrderClassPrice = eduOrderClassPrice;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPayManner() {
        return payManner;
    }

    public void setPayManner(Integer payManner) {
        this.payManner = payManner;
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}