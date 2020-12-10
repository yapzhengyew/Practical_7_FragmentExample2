package com.example.a161120community.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Example {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("message_code")
    @Expose
    private Integer messageCode;
    @SerializedName("data")
    @Expose
    private ArrayList<Datum> data = new ArrayList<>();

    @SerializedName("result")
    @Expose
    private Integer result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(Integer messageCode) {
        this.messageCode = messageCode;
    }

    public ArrayList<Datum> getData() {
        return data;
    }

    public void setData(ArrayList<Datum> data) {
        this.data = data;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

}
