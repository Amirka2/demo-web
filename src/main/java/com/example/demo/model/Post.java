package com.example.demo.model;

import java.util.Date;
import java.util.Random;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private long id;

    public Post(long id, String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
