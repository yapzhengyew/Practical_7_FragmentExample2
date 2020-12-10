package com.example.nshopmainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
    }

    public void onReturnClick(View view) {
        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }
}
