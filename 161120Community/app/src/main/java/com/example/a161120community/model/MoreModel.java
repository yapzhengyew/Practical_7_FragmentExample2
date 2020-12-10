package com.example.a161120community.model;

public class MoreModel {

    private MoreType moreType;
    private int icon;
    private String title;
    boolean isShowLine;

    public MoreModel(MoreType moreType, int icon, String title, boolean isShowLine) {
        this.moreType = moreType;
        this.icon = icon;
        this.title = title;
        this.isShowLine = isShowLine;
    }

    public MoreModel() {
    }

    public MoreType getMoreType() {
        return moreType;
    }

    public void setMoreType(MoreType moreType) {
        this.moreType = moreType;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isShowLine() {
        return isShowLine;
    }

    public void setShowLine(boolean showLine) {
        isShowLine = showLine;
    }

}
