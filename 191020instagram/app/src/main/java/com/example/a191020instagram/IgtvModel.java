package com.example.a191020instagram;

public class IgtvModel {
    private String igtvThumbnail;
    private String igtvTitle;
    private String igtvViews;

    public IgtvModel(String igtvThumbnail, String igtvTitle, String igtvViews) {
        this.igtvThumbnail = igtvThumbnail;
        this.igtvTitle = igtvTitle;
        this.igtvViews = igtvViews;
    }

    public IgtvModel() {
    }

    public String getIgtvThumbnail() {
        return igtvThumbnail;
    }

    public void setIgtvThumbnail(String igtvThumbnail) {
        this.igtvThumbnail = igtvThumbnail;
    }

    public String getIgtvTitle() {
        return igtvTitle;
    }

    public void setIgtvTitle(String igtvTitle) {
        this.igtvTitle = igtvTitle;
    }

    public String getIgtvViews() {
        return igtvViews;
    }

    public void setIgtvViews(String igtvViews) {
        this.igtvViews = igtvViews;
    }
}
