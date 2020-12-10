package com.example.a161120community.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LikedUser {
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_profile")
    @Expose
    private String userProfile;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }
}
