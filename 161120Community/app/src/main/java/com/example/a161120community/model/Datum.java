package com.example.a161120community.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Datum {
    @SerializedName("news_feed_id")
    @Expose
    private Integer newsFeedId;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("created_at")
    @Expose
    private Integer createdAt;
    @SerializedName("like_count")
    @Expose
    private Integer likeCount;
    @SerializedName("community")
    @Expose
    private String community;
    @SerializedName("profile_photo")
    @Expose
    private String profilePhoto;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("post_subject")
    @Expose
    private String postSubject;
    @SerializedName("file")
    @Expose
    private ArrayList<File> file = new ArrayList<>();
    @SerializedName("liked_users")
    @Expose
    private ArrayList<LikedUser> likedUsers = new ArrayList<>();

    public Integer getNewsFeedId() {
        return newsFeedId;
    }

    public void setNewsFeedId(Integer newsFeedId) {
        this.newsFeedId = newsFeedId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getPostSubject() {
        return postSubject;
    }

    public void setPostSubject(String postSubject) {
        this.postSubject = postSubject;
    }

    public ArrayList<File> getFile() {
        return file;
    }

    public void setFile(ArrayList<File> file) {
        this.file = file;
    }

    public ArrayList<LikedUser> getLikedUsers() {
        return likedUsers;
    }

    public void setLikedUsers(ArrayList<LikedUser> likedUsers) {
        this.likedUsers = likedUsers;
    }

}
