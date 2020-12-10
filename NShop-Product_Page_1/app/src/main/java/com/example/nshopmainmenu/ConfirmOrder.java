package com.example.nshopmainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class ConfirmOrder extends AppCompatActivity {

    private DatabaseReference reff;

    static String prodName;
    static int prodQty;
    static double prodTotalPrice;
    static double allTotal;
    static int numOrd;

    private TextView name;
    private TextView qty;
    private TextView total;
    private String numberOfOrder;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_order);

        name = (TextView) findViewById(R.id.nameOfProd);
        qty = (TextView) findViewById(R.id.numOfProd);
        total = (TextView) findViewById(R.id.totalPrice);

        name.setText(String.format("%s", prodName));
        qty.setText(String.format("%s", prodQty));
        total.setText(String.format("%s", prodTotalPrice));

    }

    public void onReturnClick(View view) {
        if (prodName.equals("Black Mask")) {
            Intent intent = new Intent(this, ProductBlackMask.class);
            startActivity(intent);
        }
        else if (prodName.equals("Blue Mask")) {
            Intent intent = new Intent(this, ProductBlackMask.class);
            startActivity(intent);
        }
        else if (prodName.equals("Purple Mask")) {
            Intent intent = new Intent(this, ProductBlackMask.class);
            startActivity(intent);
        }
    }



    public void onConfirmClick(View view){


        numOrd++;
        PaymentPage.orderID = PaymentPage.base + PaymentPage.count;
        numberOfOrder = String.valueOf(numOrd);

        String orderId = String.valueOf(PaymentPage.orderID);
        reff = FirebaseDatabase.getInstance().getReference();
        reff.child("Shopping Cart").child(orderId).child(numberOfOrder).child("Price").setValue(prodTotalPrice);
        reff.child("Shopping Cart").child(orderId).child(numberOfOrder).child("Product Name").setValue(prodName);
        reff.child("Shopping Cart").child(orderId).child(numberOfOrder).child("Quantity").setValue(prodQty);
        reff.child("Shopping Cart").child(orderId).child(numberOfOrder).child("Current Total").setValue(allTotal);
        Toast toast = Toast.makeText(this, R.string.added_order,Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}
