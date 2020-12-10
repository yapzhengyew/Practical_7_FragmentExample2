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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class SignUp extends AppCompatActivity {


    EditText emailId, password, confirmedPassword;
    Button btnSignUp;
    FirebaseAuth mFirebaseAuth;
    private String email;
    static int cusNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        mFirebaseAuth = FirebaseAuth.getInstance();
        emailId = findViewById(R.id.email_text);
        password = findViewById(R.id.password_text);
        confirmedPassword = findViewById(R.id.confirmed_password_text);
        btnSignUp = findViewById(R.id.sign_up_next_button);
        btnSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                email = emailId.getText().toString();
                String pwd = password.getText().toString();
                if (email.isEmpty()){
                    emailId.setError("Please enter email id");
                    emailId.requestFocus();
                }
                else if (pwd.isEmpty()){
                    password.setError("Please enter your password");
                    password.requestFocus();
                }
                else if (email.isEmpty() && pwd.isEmpty()){
                    Toast.makeText(SignUp.this, "Fields are empty!",Toast.LENGTH_SHORT).show();
                }
                else if (!(email.isEmpty() && pwd.isEmpty())){
                    mFirebaseAuth.createUserWithEmailAndPassword(email, pwd).addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(SignUp.this, "Sign Up Unsuccessful, Please try again",Toast.LENGTH_SHORT).show();
                            }
                            else {
                                startActivity(new Intent(SignUp.this, UserInformation.class));
                                cusNum++;
                            }
                        }
                    });
                }
                else if (password != confirmedPassword){
                    Toast.makeText(SignUp.this, "Password is not match with Confirmed Password!",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(SignUp.this, "Error Occurred!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
