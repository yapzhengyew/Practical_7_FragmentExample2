package com.example.multipleviewtypeapplication.model;

public class SampleTwoObject {
    public Boolean isAdd;
    public SampleTwoSubObject subObject;

    public SampleTwoObject(Boolean isAdd) {
        this.isAdd = isAdd;
        this.subObject = null;
    }

    public SampleTwoObject(SampleTwoSubObject sub) {
        this.isAdd = false;
        this.subObject = sub;
    }
}