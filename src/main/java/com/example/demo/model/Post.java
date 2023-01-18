package com.example.demo.model;

import java.util.Random;

public class Post {
    private String text;
    private Integer likes;

    public Post(String text) {
        this.text = text;
        this.likes = (new Random().nextInt(1000));
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }
}
