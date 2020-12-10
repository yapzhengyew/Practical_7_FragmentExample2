package com.example.nshopmainmenu;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.FileNotFoundException;
import java.io.IOException;


public class UserInformation extends AppCompatActivity {

    TextView user_name, user_email, user_postal, user_address, user_bankNum, user_bankHolder;
    RadioGroup radio_pick;
    RadioButton picked1, picked2;
    private DatabaseReference reff;
    private int x;
    static int cusNum;


    public static final int GET_FROM_GALLERY = 3;


    static int imageSetChecker = 0;
    static Bitmap savedUserProfile = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_information);

        user_name = (EditText) findViewById (R.id.username);
        user_email = (EditText) findViewById (R.id.email);
        user_postal = (EditText) findViewById (R.id.postal);
        user_address = (EditText) findViewById (R.id.addressLabel1);
        radio_pick = (RadioGroup) findViewById(R.id.radio);
        user_bankNum = (EditText) findViewById(R.id.bankNum);
        user_bankHolder = (EditText) findViewById(R.id.bankHolder);




    }

    public void onSaveClick(View view) {
        String ocNum = String.valueOf(SignUp.cusNum);
        reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);

        String name = user_name.getText().toString();
        String email = user_email.getText().toString();
        String postal = user_postal.getText().toString();
        String address = user_address.getText().toString();
        String bNum = user_bankNum.getText().toString();
        String bName = user_bankHolder.getText().toString();


        reff.child("Username").setValue(name);
        reff.child("Email").setValue(email);
        reff.child("Postal").setValue(postal);
        reff.child("Address").setValue(address);
        reff.child("Bank Acc Number").setValue(bNum);
        reff.child("Bank Acc Holder").setValue(bName);

        radio_pick = (RadioGroup) findViewById(R.id.radio);
        picked1 = (RadioButton) findViewById(R.id.Male);
        picked2 = (RadioButton) findViewById(R.id.Female);

        if(radio_pick.getCheckedRadioButtonId() != -1) {
            if (picked1.isChecked()) {
                reff.child("Gender").setValue("M");
            }
            else if (picked2.isChecked()) {
                reff.child("Gender").setValue("F");
            }
        }





        showMsg(view);
        onDoneClick(view);
    }

    public void showMsg(View view){
        Toast toast = Toast.makeText(this, R.string.saved,Toast.LENGTH_SHORT);

        toast.show();
    }

    public void onDoneClick(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

    public void onUploadClick(View view) {
        startActivityForResult(new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI), GET_FROM_GALLERY);
    }

    public void changePic() {
        ImageView userProfilePic = (ImageView) findViewById(R.id.image);
        userProfilePic.setImageBitmap(UserInformation.savedUserProfile);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //Detects request codes
        if(requestCode==GET_FROM_GALLERY && resultCode == Activity.RESULT_OK) {
            Uri selectedImage = data.getData();
            Bitmap bitmap = null;
            try {
                bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), selectedImage);
                savedUserProfile = bitmap;
                changePic();
                Toast toast = Toast.makeText(this, (R.string.profile_pic_update),Toast.LENGTH_SHORT);
                toast.show();
                imageSetChecker = 1;
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
/*a*/