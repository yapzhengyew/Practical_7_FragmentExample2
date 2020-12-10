package com.example.nshopmainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PaymentPage extends AppCompatActivity {

    static double[] allTotal2 = {};
    static int orderID;
    static int base = 100000;
    static int count = 0;
    static int numOfPayment;

    private TextView total, holder_name, bank_num;
    private com.google.firebase.database.DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_page);

        total = (TextView) findViewById (R.id.finalPrice);
        holder_name = (TextView) findViewById (R.id.holderName);
        bank_num = (TextView) findViewById (R.id.accNum);

        String atotal = String.valueOf(ConfirmOrder.allTotal); //show total price
        total.setText(atotal);

        String ocNum = String.valueOf(SignUp.cusNum);
        reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot){
                String name = dataSnapshot.child("Bank Acc Holder").getValue().toString();
                String num = dataSnapshot.child("Bank Acc Number").getValue().toString();
                holder_name.setText(name);
                bank_num.setText(num);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError){

            }
        });



    }

    public void onConfirmClick(View view) {
        String oID = String.valueOf(orderID);
        String ocNum = String.valueOf(SignUp.cusNum);
        count++;
        reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ocNum).child(oID);
        reff.child("Total Price").setValue(ConfirmOrder.allTotal);

        numOfPayment++;
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
        ConfirmOrder.numOrd = 0;
        ConfirmOrder.allTotal = 0;
        //ShoppingCart inst = new ShoppingCart();
        //inst.resetShoppingCart();
        Toast toast = Toast.makeText(this, R.string.payment_made,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onReturnClick(View view) {
        Intent intent = new Intent(this, ShoppingCart.class);
        startActivity(intent);
    }
}
