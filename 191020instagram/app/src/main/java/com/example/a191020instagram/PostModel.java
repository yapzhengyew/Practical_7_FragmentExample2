package com.example.a191020instagram;

public class PostModel {
    private int postid;
    private String imageProfile;
    private String postImage;
    private String description;
    private String publisher;

    public PostModel(int postid, String imageProfile, String postImage, String description, String publisher) {
        this.postid = postid;
        this.imageProfile = imageProfile;
        this.postImage = postImage;
        this.description = description;
        this.publisher = publisher;
    }

    public PostModel() {
    }

    public String getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(String imageProfile) {
        this.imageProfile = imageProfile;
    }

    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
