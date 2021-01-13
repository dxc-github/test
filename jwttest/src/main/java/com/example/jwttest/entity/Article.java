package com.example.jwttest.entity;

import java.util.Date;
import java.util.List;

public class Article {
    private Integer activeId;
    private String title;
    private Integer viewCount;
    private Integer classifyId;
    private String contextSynopsis;
    private String context;
    private Date createTime;
    private Date updateTime;
    private List<Label> labels;

    public Article() {
    }

    public Article(Integer id, String title, Integer viewCount, Integer classifyId, String contextSynopsis, String context, Date createTime, Date updateTime) {
        this.activeId = id;
        this.title = title;
        this.viewCount = viewCount;
        this.classifyId = classifyId;
        this.contextSynopsis = contextSynopsis;
        this.context = context;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getActiveId() {
        return activeId;
    }

    public void setActiveId(Integer activeId) {
        this.activeId = activeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getContextSynopsis() {
        return contextSynopsis;
    }

    public void setContextSynopsis(String contextSynopsis) {
        this.contextSynopsis = contextSynopsis;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + activeId +
                ", title='" + title + '\'' +
                ", viewCount=" + viewCount +
                ", classifyId=" + classifyId +
                ", contextSynopsis='" + contextSynopsis + '\'' +
                ", context='" + context + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", labels=" + labels +
                '}';
    }
}
