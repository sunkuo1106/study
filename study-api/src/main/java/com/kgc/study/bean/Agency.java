package com.kgc.study.bean;

import java.util.Date;

public class Agency {
    private Long id;

    private String agencyName;

    private String agencyAddress;

    private String agencyPhone;

    private String principalName;

    private String principalPhone;

    private Date adminGmtCreate;

    private Date adminGmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName == null ? null : agencyName.trim();
    }

    public String getAgencyAddress() {
        return agencyAddress;
    }

    public void setAgencyAddress(String agencyAddress) {
        this.agencyAddress = agencyAddress == null ? null : agencyAddress.trim();
    }

    public String getAgencyPhone() {
        return agencyPhone;
    }

    public void setAgencyPhone(String agencyPhone) {
        this.agencyPhone = agencyPhone == null ? null : agencyPhone.trim();
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName == null ? null : principalName.trim();
    }

    public String getPrincipalPhone() {
        return principalPhone;
    }

    public void setPrincipalPhone(String principalPhone) {
        this.principalPhone = principalPhone == null ? null : principalPhone.trim();
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