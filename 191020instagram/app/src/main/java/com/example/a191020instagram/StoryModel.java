package com.example.a191020instagram;

public class StoryModel {
    private boolean storyAvailable;
    private String imageStory;
    private String username;

    public StoryModel(boolean storyAvailable, String imageStory, String username) {
        this.storyAvailable = storyAvailable;
        this.imageStory = imageStory;
        this.username = username;
    }

    public StoryModel() {
    }

    public boolean isStoryAvailable() {
        return storyAvailable;
    }

    public void setStoryAvailable(boolean storyAvailable) {
        this.storyAvailable = storyAvailable;
    }

    public String getImageStory() {
        return imageStory;
    }

    public void setImageStory(String imageStory) {
        this.imageStory = imageStory;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
