package com.example.demo.model;


import java.util.Date;

public class Post {
    private Long id;
    String text;
    Integer likes;
    private Date creationDate;

    public Post(String text){
        this.text = text;
    }

    public Post(String text, Date creationDate){
        this.text = text;
        this.creationDate = creationDate;
    }

    public Post(String text, Integer likes, Date creationDate){
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }

    public Post(Long id, String text, Integer likes, Date creationDate){
        this.id = id;
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public void setLikes(Integer likes){
        this.likes = likes;
    }
}
