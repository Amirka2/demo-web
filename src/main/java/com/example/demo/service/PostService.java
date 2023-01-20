package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.*;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<Post>();
        Date now = new Date(java.lang.System.currentTimeMillis());
        for (int i = 0; i < 3; i++) {
            posts.add(new Post(String.format("%d", i), now));
        }

        return posts;
    }
}
