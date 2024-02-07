package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostService {
    public Post[] listAllPosts(){
        Post firstPost = new Post("Пост 1", 12, new Date());
        Post secondPost = new Post("Пост 2", 23, new Date());
        Post thirdPost = new Post("Пост 3",52, new Date());
        Post[] arr = new Post[] {firstPost, secondPost, thirdPost};

        return arr;
    }
}
