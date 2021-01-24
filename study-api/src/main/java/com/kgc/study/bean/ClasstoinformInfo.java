package com.kgc.study.bean;

import java.util.Date;

public class ClasstoinformInfo {
    private Long id;

    private Date ctfGmtCreate;

    private Date ctfGmtModified;

    private Integer ctfAddressId;

    private String ctfGradeId;

    private String ctfContext;

    private String ctfPic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCtfGmtCreate() {
        return ctfGmtCreate;
    }

    public void setCtfGmtCreate(Date ctfGmtCreate) {
        this.ctfGmtCreate = ctfGmtCreate;
    }

    public Date getCtfGmtModified() {
        return ctfGmtModified;
    }

    public void setCtfGmtModified(Date ctfGmtModified) {
        this.ctfGmtModified = ctfGmtModified;
    }

    public Integer getCtfAddressId() {
        return ctfAddressId;
    }

    public void setCtfAddressId(Integer ctfAddressId) {
        this.ctfAddressId = ctfAddressId;
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
}