package com.example.a121020intern;

public class NoteModelClass {

    Integer id;
    String title;
    String note;

    public NoteModelClass(String title, String note) {
        this.title = title;
        this.note = note;
    }

    public NoteModelClass(Integer id, String title, String note) {
        this.id = id;
        this.title = title;
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
