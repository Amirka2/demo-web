package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post() {
    }

    public Post(Long id, String text, Date creationDate) {
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
