package com.example.a091220qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button scan,generate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scan = findViewById(R.id.button_scan);
        generate = findViewById(R.id.button_generate);
    }
}