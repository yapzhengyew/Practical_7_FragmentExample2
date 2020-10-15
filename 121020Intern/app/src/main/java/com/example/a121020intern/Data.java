package com.example.a121020intern;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("floor")
    @Expose
    private String floor;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("exhibition")
    @Expose
    private String exhibition;
    @SerializedName("dateTime")
    @Expose
    private String dateTime;
    @SerializedName("openToday")
    @Expose
    private String openToday;
    @SerializedName("location")
    @Expose
    private Location location;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getExhibition() {
        return exhibition;
    }

    public void setExhibition(String exhibition) {
        this.exhibition = exhibition;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getOpenToday() {
        return openToday;
    }

    public void setOpenToday(String openToday) {
        this.openToday = openToday;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
