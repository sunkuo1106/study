package com.kgc.study.bean;

import java.util.Date;

public class ClasstoinformInfo {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer agencyAddressId;

    private String ctfGradeId;

    private String ctfContext;

    private String ctfPic;

    private Integer ctfGmtFounderId;

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

    public Integer getAgencyAddressId() {
        return agencyAddressId;
    }

    public void setAgencyAddressId(Integer agencyAddressId) {
        this.agencyAddressId = agencyAddressId;
    }

    public String getCtfGradeId() {
        return ctfGradeId;
    }

    public void setCtfGradeId(String ctfGradeId) {
        this.ctfGradeId = ctfGradeId == null ? null : ctfGradeId.trim();
    }

    public String getCtfContext() {
        return ctfContext;
    }

    public void setCtfContext(String ctfContext) {
        this.ctfContext = ctfContext == null ? null : ctfContext.trim();
    }

    public String getCtfPic() {
        return ctfPic;
    }

    public void setCtfPic(String ctfPic) {
        this.ctfPic = ctfPic == null ? null : ctfPic.trim();
    }

    public Integer getCtfGmtFounderId() {
        return ctfGmtFounderId;
    }

    public void setCtfGmtFounderId(Integer ctfGmtFounderId) {
        this.ctfGmtFounderId = ctfGmtFounderId;
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}