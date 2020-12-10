package com.example.nshopmainmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void showMsg(View view){
        Toast toast = Toast.makeText(this, R.string.main_menu_message,Toast.LENGTH_SHORT);

        toast.show();
    }

    public void onBlackMaskClick(View view) {
        Intent intent = new Intent(this, ProductBlackMask.class);
        startActivity(intent);
    }

    public void onBlueMaskClick(View view){
        Intent intent = new Intent(this, ProductBlueMask.class);
        startActivity(intent);
    }

    public void onPurpleMaskClick(View view){
        Intent intent = new Intent(this, ProductPurpleMask.class);
        startActivity(intent);
    }

    public void onProfileClick(View view) {
        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }

    public void onShoppingCartClick(View view) {
        Intent intent = new Intent(this, ShoppingCart.class);
        startActivity(intent);
    }

    public void onCheckoutClick(View view) {
        Intent intent = new Intent(this, PaymentPage.class);
        startActivity(intent);
    }
}