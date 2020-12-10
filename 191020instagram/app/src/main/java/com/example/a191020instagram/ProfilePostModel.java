package com.example.a191020instagram;

public class ProfilePostModel {
    private int postID;
    private String thumbnail;

    public ProfilePostModel() {
    }

    public ProfilePostModel(int postID, String thumbnail) {
        this.postID = postID;
        this.thumbnail = thumbnail;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}
