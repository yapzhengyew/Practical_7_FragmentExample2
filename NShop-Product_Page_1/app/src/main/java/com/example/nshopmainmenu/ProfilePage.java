package com.example.nshopmainmenu;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class ProfilePage extends AppCompatActivity {

    TextView user_name, user_email;
    com.google.firebase.database.DatabaseReference reff;

    Button btnLogout;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);

        user_name = (TextView) findViewById (R.id.username);
        user_email = (TextView) findViewById (R.id.email);

        String ocNum = String.valueOf(SignUp.cusNum);

        reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot){
                String name = dataSnapshot.child("Username").getValue().toString();
                String email = dataSnapshot.child("Email").getValue().toString();
                String imgGen = dataSnapshot.child("Gender").getValue().toString();
                user_name.setText(name);
                user_email.setText(email);
                if (imgGen.equals("M")) {
                    ImageView imgGender = (ImageView) findViewById(R.id.gender);
                    imgGender.setImageResource(R.drawable.male);
                }
                else if (imgGen.equals("F")) {
                    ImageView imgGender = (ImageView) findViewById(R.id.gender);
                    imgGender.setImageResource(R.drawable.female);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError){

            }
        });


        if (ProfileEditor.imageSetChecker == 1) {
            ImageView userProfilePic = (ImageView) findViewById(R.id.profileImg);
            userProfilePic.setImageBitmap(ProfileEditor.savedUserProfile);
        }
        else if (ProfileEditor.imageSetChecker == 0){
            ImageView userProfilePic = (ImageView) findViewById(R.id.profileImg);
            userProfilePic.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.profile));
        }

        /*TextView textUsername = (TextView) findViewById(R.id.username);
        textUsername.setText(ProfileEditor.savedUsername);

        TextView textEmail = (TextView) findViewById(R.id.email);
        textEmail.setText(ProfileEditor.savedEmail);

        if(ProfileEditor.savedGender == "Male"){
            ImageView imgGender = (ImageView) findViewById(R.id.gender);
            imgGender.setImageResource(R.drawable.male);
        }
        else if(ProfileEditor.savedGender == "Female"){
            ImageView imgGender = (ImageView) findViewById(R.id.gender);
            imgGender.setImageResource(R.drawable.female);
        }*/

        btnLogout = findViewById(R.id.buttonLogout);

        btnLogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ConfirmOrder.numOrd = 0;
                PaymentPage.numOfPayment = 0;
                PaymentPage.orderID = 100000;

                FirebaseAuth.getInstance().signOut();
                Intent toMain = new Intent(ProfilePage.this,MainActivity.class);
                startActivity(toMain);
            }
        });


    }


    public void onReturnClick(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

    public void onAboutUsClick(View view) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    public void onContactUsClick(View view) {
        Intent intent = new Intent(this, ContactUs.class);
        startActivity(intent);
    }

    public void onEditClick(View view) {
        Intent intent = new Intent(this, ProfileEditor.class);
        startActivity(intent);
    }

    public void onPurchaseHistoryClick(View view) {
        Intent intent = new Intent(this, PurchaseHistory.class);
        startActivity(intent);
    }

    public void showMsg(View view){
        Toast toast = Toast.makeText(this, R.string.profile_page_message,Toast.LENGTH_SHORT);

        toast.show();
    }
}



















































