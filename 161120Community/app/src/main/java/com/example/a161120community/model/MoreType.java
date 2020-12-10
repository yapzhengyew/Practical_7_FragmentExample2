package com.example.a161120community.model;


public enum MoreType {

    TYPE_HEADER(1),
    TYPE_ROW(2),
    TYPE_BLANK(3);

    private int intValue;

    private MoreType(int value) {
        intValue = value;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}