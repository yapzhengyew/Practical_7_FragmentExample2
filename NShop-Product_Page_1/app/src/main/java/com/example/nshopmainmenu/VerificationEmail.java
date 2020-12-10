package com.example.nshopmainmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class VerificationEmail extends AppCompatActivity {

    Button btnVerification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_verify);

        btnVerification = findViewById(R.id.verification_email);

        btnVerification.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent doneVeri = new Intent(VerificationEmail.this,MainActivity.class);
                startActivity(doneVeri);
            }
        });
    }


}