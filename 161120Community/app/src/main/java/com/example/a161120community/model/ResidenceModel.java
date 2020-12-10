package com.example.a161120community.model;

import android.graphics.drawable.Drawable;

public class ResidenceModel {
    private int space;
    private String color;
    private String title;
    private String desc;
    private int icon;

    public ResidenceModel(int space, String color, String title, String desc, int icon) {
        this.space = space;
        this.color = color;
        this.title = title;
        this.desc = desc;
        this.icon = icon;
    }

    public ResidenceModel() {
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
