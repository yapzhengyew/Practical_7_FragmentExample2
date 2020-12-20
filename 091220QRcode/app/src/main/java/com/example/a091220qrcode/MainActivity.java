package com.example.a091220qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToScanActivity(View v) {
        Intent intent = new Intent(this, ScanActivity.class);
        startActivity(intent);
    }

    public void goToGenerateActivity(View v) {
        Intent intent = new Intent(this, GenerateActivity.class);
        startActivity(intent);
    }
}