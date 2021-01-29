package com.kgc.study.bean;

import java.util.Date;

public class EduUserOrderItem {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String eduOrderName;

    private String eduOrderIdCard;

    private String eduOrderPhone;

    private Integer agencyAddressId;

    private String agencyAddressName;

    private String eduOrderClassType;

    private Long eduOrderClassPrice;

    private Integer eduOrderType;

    private String agencyId;

    private String agencyName;

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

    public Integer getAgencyAddressId() {
        return agencyAddressId;
    }

    public void setAgencyAddressId(Integer agencyAddressId) {
        this.agencyAddressId = agencyAddressId;
    }

    public String getAgencyAddressName() {
        return agencyAddressName;
    }

    public void setAgencyAddressName(String agencyAddressName) {
        this.agencyAddressName = agencyAddressName == null ? null : agencyAddressName.trim();
    }

    public String getEduOrderClassType() {
        return eduOrderClassType;
    }

    public void setEduOrderClassType(String eduOrderClassType) {
        this.eduOrderClassType = eduOrderClassType == null ? null : eduOrderClassType.trim();
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

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId == null ? null : agencyId.trim();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName == null ? null : agencyName.trim();
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}