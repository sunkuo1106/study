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

    private String agencyAddressName;//机构地址

    private String eduOrderClassType;

    private Long eduOrderClassPrice;

    private Long eduOrderClassDiscountPrice;

    private Integer eduOrderType;

    private String eduOrderTypeName;//支付状态

    private String agencyId;

    private String agencyName;//机构名称

    private Integer logicDelete;
    @Override
    public String toString() {
        return "EduUserOrderItem{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", eduOrderName='" + eduOrderName + '\'' +
                ", eduOrderIdCard='" + eduOrderIdCard + '\'' +
                ", eduOrderPhone='" + eduOrderPhone + '\'' +
                ", agencyAddressId=" + agencyAddressId +
                ", agencyAddressName='" + agencyAddressName + '\'' +
                ", eduOrderClassType='" + eduOrderClassType + '\'' +
                ", eduOrderClassPrice=" + eduOrderClassPrice +
                ", eduOrderClassDiscountPrice=" + eduOrderClassDiscountPrice +
                ", eduOrderType=" + eduOrderType +
                ", eduOrderTypeName='" + eduOrderTypeName + '\'' +
                ", agencyId='" + agencyId + '\'' +
                ", agencyName='" + agencyName + '\'' +
                ", logicDelete=" + logicDelete +
                '}';
    }

    public String getEduOrderTypeName() {
        return eduOrderTypeName;
    }

    public void setEduOrderTypeName(String eduOrderTypeName) {
        this.eduOrderTypeName = eduOrderTypeName;
    }


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

    public Long getEduOrderClassDiscountPrice() {
        return eduOrderClassDiscountPrice;
    }

    public void setEduOrderClassDiscountPrice(Long eduOrderClassDiscountPrice) {
        this.eduOrderClassDiscountPrice = eduOrderClassDiscountPrice;
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