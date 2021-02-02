package com.kgc.study.bean;

import java.util.Date;

public class NewsInfo {
    private Long id;

    private String newsInfoTitle;

    private String newsInfoSource;

    private String newsInfoAuthor;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer newsInfoClickCount;

    private Integer newsIstop;

    private Integer logicDelete;

    private String newsInfoText;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNewsInfoTitle() {
        return newsInfoTitle;
    }

    public void setNewsInfoTitle(String newsInfoTitle) {
        this.newsInfoTitle = newsInfoTitle == null ? null : newsInfoTitle.trim();
    }

    public String getNewsInfoSource() {
        return newsInfoSource;
    }

    public void setNewsInfoSource(String newsInfoSource) {
        this.newsInfoSource = newsInfoSource == null ? null : newsInfoSource.trim();
    }

    public String getNewsInfoAuthor() {
        return newsInfoAuthor;
    }

    public void setNewsInfoAuthor(String newsInfoAuthor) {
        this.newsInfoAuthor = newsInfoAuthor == null ? null : newsInfoAuthor.trim();
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

    public Integer getNewsInfoClickCount() {
        return newsInfoClickCount;
    }

    public void setNewsInfoClickCount(Integer newsInfoClickCount) {
        this.newsInfoClickCount = newsInfoClickCount;
    }

    public Integer getNewsIstop() {
        return newsIstop;
    }

    public void setNewsIstop(Integer newsIstop) {
        this.newsIstop = newsIstop;
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }

    public String getNewsInfoText() {
        return newsInfoText;
    }

    public void setNewsInfoText(String newsInfoText) {
        this.newsInfoText = newsInfoText == null ? null : newsInfoText.trim();
    }
}