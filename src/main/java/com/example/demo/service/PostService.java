package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public Post[] listAllPosts(){
        Post firstPost = new Post("Пост 1", 12);
        Post secondPost = new Post("Пост 2", 23);
        Post thirdPost = new Post("Пост 3",52);
        Post[] arr = new Post[] {firstPost, secondPost, thirdPost};

        return arr;
    }
}
