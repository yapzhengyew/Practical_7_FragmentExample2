package com.example.multipleviewtypeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.multipleviewtypeapplication.sampleOne.activity.SampleOneActivity;
import com.example.multipleviewtypeapplication.sampleTwo.activity.SampleTwoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.sampleOne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SampleOneActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.sampleTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SampleTwoActivity.class);
                startActivity(intent);
            }
        });
    }
}