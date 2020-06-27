package com.spring.basic.model;

import java.sql.Date;

/**
 * Study
 */
public class Study {
    private Integer id;
    private String title;
    private String content;
    private Date regDate;

    public Study() {
    }

    public Study(Integer id, String title, String content, Date regDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.regDate = regDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegDate() {
        return this.regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Study id(Integer id) {
        this.id = id;
        return this;
    }

    public Study title(String title) {
        this.title = title;
        return this;
    }

    public Study content(String content) {
        this.content = content;
        return this;
    }

    public Study regDate(Date regDate) {
        this.regDate = regDate;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", content='" + getContent() + "'" +
            ", regDate='" + getRegDate() + "'" +
            "}";
    }

}