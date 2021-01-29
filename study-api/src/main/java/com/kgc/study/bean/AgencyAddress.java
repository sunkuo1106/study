package com.kgc.study.bean;

import java.util.Date;

public class AgencyAddress {
    private Long id;

    private String agencyAddressName;

    private Long agencyId;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer logicDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgencyAddressName() {
        return agencyAddressName;
    }

    public void setAgencyAddressName(String agencyAddressName) {
        this.agencyAddressName = agencyAddressName == null ? null : agencyAddressName.trim();
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
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