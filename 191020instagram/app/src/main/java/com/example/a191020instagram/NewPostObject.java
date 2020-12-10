package com.example.a191020instagram;

import android.net.Uri;

public class NewPostObject {
    Boolean isAdd;
    // Change to Album Object
    Uri album;

    public NewPostObject(Boolean isAdd, Uri album) {
        this.isAdd = isAdd;
        this.album = album;
    }

    public Boolean getAdd() {
        return isAdd;
    }

    public void setAdd(Boolean add) {
        isAdd = add;
    }

    public Uri getAlbum() {
        return album;
    }

    public void setAlbum(Uri album) {
        this.album = album;
    }
}
