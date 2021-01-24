package com.kgc.study.bean;

public class ActivityInfoWithBLOBs extends ActivityInfo {
    private String acInfoTitle;

    private String acContentName;

    public String getAcInfoTitle() {
        return acInfoTitle;
    }

    public void setAcInfoTitle(String acInfoTitle) {
        this.acInfoTitle = acInfoTitle == null ? null : acInfoTitle.trim();
    }

    public String getAcContentName() {
        return acContentName;
    }

    public void setAcContentName(String acContentName) {
        this.acContentName = acContentName == null ? null : acContentName.trim();
    }
}