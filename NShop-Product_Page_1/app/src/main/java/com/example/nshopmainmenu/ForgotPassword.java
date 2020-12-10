package com.example.nshopmainmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword extends AppCompatActivity {

    EditText userEmail;
    Button btnForgot;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);

        userEmail = findViewById(R.id.forgot_password_email);
        btnForgot = findViewById(R.id.forgot_password_next_button);

        firebaseAuth = FirebaseAuth.getInstance();

        btnForgot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                firebaseAuth.sendPasswordResetEmail(userEmail.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>(){
                    @Override
                    public void onComplete(@NonNull Task<Void> task){
                        if(task.isSuccessful()){
                            Intent nextForgot = new Intent(ForgotPassword.this,VerificationEmail.class);
                            startActivity(nextForgot);
                        }else{
                            Toast.makeText(ForgotPassword.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });
    }
}
