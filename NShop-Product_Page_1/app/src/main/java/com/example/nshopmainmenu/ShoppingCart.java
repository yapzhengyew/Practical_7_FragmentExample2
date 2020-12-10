package com.example.nshopmainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class ShoppingCart extends AppCompatActivity {

    TextView product_name1, price1, qty1, total;
    TextView product_name2, price2, qty2;
    TextView product_name3, price3, qty3;
    TextView product_name4, price4, qty4;
    TextView product_name5, price5, qty5;
    TextView product_name6, price6, qty6;
    TextView product_name7, price7, qty7;
    TextView product_name8, price8, qty8;
    TextView product_name9, price9, qty9;
    TextView product_name10, price10, qty10;
    TextView product_name11, price11, qty11;
    TextView product_name12, price12, qty12;



    com.google.firebase.database.DatabaseReference reff;
    private int a = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_cart);




        for (int a = 1; a <= ConfirmOrder.numOrd; a++) {
            if (a == 1) {
                String x = String.valueOf(a);

                product_name1 = (TextView) findViewById(R.id.productName1);
                price1 = (TextView) findViewById(R.id.productPrice1);
                qty1 = (TextView) findViewById(R.id.productQty1);
                total = (TextView) findViewById(R.id.price);
                String ordNum = String.valueOf(PaymentPage.orderID);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ordNum).child(x);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        String pName = dataSnapshot.child("Product Name").getValue().toString();
                        String pPrice = dataSnapshot.child("Price").getValue().toString();
                        String pQty = dataSnapshot.child("Quantity").getValue().toString();
                        product_name1.setText(pName);
                        price1.setText(pPrice);
                        qty1.setText(pQty);

                        String pTotal = dataSnapshot.child("Current Total").getValue().toString();
                        total.setText(pTotal);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            } else if (a == 2) {
                String x = String.valueOf(a);
                String ordNum = String.valueOf(PaymentPage.orderID);
                product_name2 = (TextView) findViewById(R.id.productName2);
                price2 = (TextView) findViewById(R.id.productPrice2);
                qty2 = (TextView) findViewById(R.id.productQty2);
                total = (TextView) findViewById(R.id.price);


                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ordNum).child(x);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String pName = dataSnapshot.child("Product Name").getValue().toString();
                        String pPrice = dataSnapshot.child("Price").getValue().toString();
                        String pQty = dataSnapshot.child("Quantity").getValue().toString();
                        product_name2.setText(pName);
                        price2.setText(pPrice);
                        qty2.setText(pQty);

                        String pTotal = dataSnapshot.child("Current Total").getValue().toString();
                        total.setText(pTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            } else if (a == 3) {
                String x = String.valueOf(a);
                String ordNum = String.valueOf(PaymentPage.orderID);
                product_name3 = (TextView) findViewById(R.id.productName3);
                price3 = (TextView) findViewById(R.id.productPrice3);
                qty3 = (TextView) findViewById(R.id.productQty3);
                total = (TextView) findViewById(R.id.price);


                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ordNum).child(x);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String pName = dataSnapshot.child("Product Name").getValue().toString();
                        String pPrice = dataSnapshot.child("Price").getValue().toString();
                        String pQty = dataSnapshot.child("Quantity").getValue().toString();
                        product_name3.setText(pName);
                        price3.setText(pPrice);
                        qty3.setText(pQty);

                        String pTotal = dataSnapshot.child("Current Total").getValue().toString();
                        total.setText(pTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            } else if (a == 4) {
                String x = String.valueOf(a);
                String ordNum = String.valueOf(PaymentPage.orderID);
                product_name4 = (TextView) findViewById(R.id.productName4);
                price4 = (TextView) findViewById(R.id.productPrice4);
                qty4 = (TextView) findViewById(R.id.productQty4);
                total = (TextView) findViewById(R.id.price);


                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ordNum).child(x);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String pName = dataSnapshot.child("Product Name").getValue().toString();
                        String pPrice = dataSnapshot.child("Price").getValue().toString();
                        String pQty = dataSnapshot.child("Quantity").getValue().toString();
                        product_name4.setText(pName);
                        price4.setText(pPrice);
                        qty4.setText(pQty);

                        String pTotal = dataSnapshot.child("Current Total").getValue().toString();
                        total.setText(pTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            } else if (a == 5) {
                String x = String.valueOf(a);
                String ordNum = String.valueOf(PaymentPage.orderID);
                product_name5 = (TextView) findViewById(R.id.productName5);
                price5 = (TextView) findViewById(R.id.productPrice5);
                qty5 = (TextView) findViewById(R.id.productQty5);
                total = (TextView) findViewById(R.id.price);


                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ordNum).child(x);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String pName = dataSnapshot.child("Product Name").getValue().toString();
                        String pPrice = dataSnapshot.child("Price").getValue().toString();
                        String pQty = dataSnapshot.child("Quantity").getValue().toString();
                        product_name5.setText(pName);
                        price5.setText(pPrice);
                        qty5.setText(pQty);

                        String pTotal = dataSnapshot.child("Current Total").getValue().toString();
                        total.setText(pTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            } else if (a == 6) {
                String x = String.valueOf(a);
                String ordNum = String.valueOf(PaymentPage.orderID);
                product_name6 = (TextView) findViewById(R.id.productName6);
                price6 = (TextView) findViewById(R.id.productPrice6);
                qty6 = (TextView) findViewById(R.id.productQty6);
                total = (TextView) findViewById(R.id.price);


                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ordNum).child(x);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String pName = dataSnapshot.child("Product Name").getValue().toString();
                        String pPrice = dataSnapshot.child("Price").getValue().toString();
                        String pQty = dataSnapshot.child("Quantity").getValue().toString();
                        product_name6.setText(pName);
                        price6.setText(pPrice);
                        qty6.setText(pQty);

                        String pTotal = dataSnapshot.child("Current Total").getValue().toString();
                        total.setText(pTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            } else if (a == 7) {
                String x = String.valueOf(a);
                String ordNum = String.valueOf(PaymentPage.orderID);
                product_name7 = (TextView) findViewById(R.id.productName7);
                price7 = (TextView) findViewById(R.id.productPrice7);
                qty7 = (TextView) findViewById(R.id.productQty7);
                total = (TextView) findViewById(R.id.price);


                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ordNum).child(x);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String pName = dataSnapshot.child("Product Name").getValue().toString();
                        String pPrice = dataSnapshot.child("Price").getValue().toString();
                        String pQty = dataSnapshot.child("Quantity").getValue().toString();
                        product_name7.setText(pName);
                        price7.setText(pPrice);
                        qty7.setText(pQty);

                        String pTotal = dataSnapshot.child("Current Total").getValue().toString();
                        total.setText(pTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            } else if (a == 8) {
                String x = String.valueOf(a);
                String ordNum = String.valueOf(PaymentPage.orderID);
                product_name8 = (TextView) findViewById(R.id.productName8);
                price8 = (TextView) findViewById(R.id.productPrice8);
                qty8 = (TextView) findViewById(R.id.productQty8);
                total = (TextView) findViewById(R.id.price);


                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ordNum).child(x);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String pName = dataSnapshot.child("Product Name").getValue().toString();
                        String pPrice = dataSnapshot.child("Price").getValue().toString();
                        String pQty = dataSnapshot.child("Quantity").getValue().toString();
                        product_name8.setText(pName);
                        price8.setText(pPrice);
                        qty8.setText(pQty);

                        String pTotal = dataSnapshot.child("Current Total").getValue().toString();
                        total.setText(pTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            } else if (a == 9) {
                String x = String.valueOf(a);
                String ordNum = String.valueOf(PaymentPage.orderID);
                product_name9 = (TextView) findViewById(R.id.productName9);
                price9 = (TextView) findViewById(R.id.productPrice9);
                qty9 = (TextView) findViewById(R.id.productQty9);
                total = (TextView) findViewById(R.id.price);


                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ordNum).child(x);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String pName = dataSnapshot.child("Product Name").getValue().toString();
                        String pPrice = dataSnapshot.child("Price").getValue().toString();
                        String pQty = dataSnapshot.child("Quantity").getValue().toString();
                        product_name9.setText(pName);
                        price9.setText(pPrice);
                        qty9.setText(pQty);

                        String pTotal = dataSnapshot.child("Current Total").getValue().toString();
                        total.setText(pTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            } else if (a == 10) {
                String x = String.valueOf(a);
                String ordNum = String.valueOf(PaymentPage.orderID);
                product_name10 = (TextView) findViewById(R.id.productName10);
                price10 = (TextView) findViewById(R.id.productPrice10);
                qty10 = (TextView) findViewById(R.id.productQty10);
                total = (TextView) findViewById(R.id.price);


                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ordNum).child(x);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String pName = dataSnapshot.child("Product Name").getValue().toString();
                        String pPrice = dataSnapshot.child("Price").getValue().toString();
                        String pQty = dataSnapshot.child("Quantity").getValue().toString();
                        product_name10.setText(pName);
                        price10.setText(pPrice);
                        qty10.setText(pQty);

                        String pTotal = dataSnapshot.child("Current Total").getValue().toString();
                        total.setText(pTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            } else if (a == 11) {
                String x = String.valueOf(a);
                String ordNum = String.valueOf(PaymentPage.orderID);
                product_name11 = (TextView) findViewById(R.id.productName11);
                price11 = (TextView) findViewById(R.id.productPrice11);
                qty11 = (TextView) findViewById(R.id.productQty11);
                total = (TextView) findViewById(R.id.price);


                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ordNum).child(x);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String pName = dataSnapshot.child("Product Name").getValue().toString();
                        String pPrice = dataSnapshot.child("Price").getValue().toString();
                        String pQty = dataSnapshot.child("Quantity").getValue().toString();
                        product_name11.setText(pName);
                        price11.setText(pPrice);
                        qty11.setText(pQty);

                        String pTotal = dataSnapshot.child("Current Total").getValue().toString();
                        total.setText(pTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            } else if (a == 12) {
                String x = String.valueOf(a);
                String ordNum = String.valueOf(PaymentPage.orderID);
                product_name12 = (TextView) findViewById(R.id.productName12);
                price12 = (TextView) findViewById(R.id.productPrice12);
                qty12 = (TextView) findViewById(R.id.productQty12);
                total = (TextView) findViewById(R.id.price);


                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child(ordNum).child(x);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String pName = dataSnapshot.child("Product Name").getValue().toString();
                        String pPrice = dataSnapshot.child("Price").getValue().toString();
                        String pQty = dataSnapshot.child("Quantity").getValue().toString();
                        product_name12.setText(pName);
                        price12.setText(pPrice);
                        qty12.setText(pQty);

                        String pTotal = dataSnapshot.child("Current Total").getValue().toString();
                        total.setText(pTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        }

    }

    public void resetShoppingCart(){
        product_name1 = (TextView) findViewById(R.id.productName1);
        price1 = (TextView) findViewById(R.id.productPrice1);
        qty1 = (TextView) findViewById(R.id.productQty1);
        total = (TextView) findViewById(R.id.price);
        product_name1.setText("-");
        price1.setText("-");
        qty1.setText("-");

        product_name2 = (TextView) findViewById(R.id.productName2);
        price2 = (TextView) findViewById(R.id.productPrice2);
        qty2 = (TextView) findViewById(R.id.productQty2);
        product_name2.setText("-");
        price2.setText("-");
        qty2.setText("-");

        product_name3 = (TextView) findViewById(R.id.productName3);
        price3 = (TextView) findViewById(R.id.productPrice3);
        qty3 = (TextView) findViewById(R.id.productQty3);
        product_name3.setText("-");
        price3.setText("-");
        qty3.setText("-");

        product_name4 = (TextView) findViewById(R.id.productName4);
        price4 = (TextView) findViewById(R.id.productPrice4);
        qty4 = (TextView) findViewById(R.id.productQty4);
        product_name4.setText("-");
        price4.setText("-");
        qty4.setText("-");

        product_name5 = (TextView) findViewById(R.id.productName5);
        price5 = (TextView) findViewById(R.id.productPrice5);
        qty5 = (TextView) findViewById(R.id.productQty5);
        product_name5.setText("-");
        price5.setText("-");
        qty5.setText("-");

        product_name6 = (TextView) findViewById(R.id.productName6);
        price6 = (TextView) findViewById(R.id.productPrice6);
        qty6 = (TextView) findViewById(R.id.productQty6);
        product_name6.setText("-");
        price6.setText("-");
        qty6.setText("-");

        product_name7 = (TextView) findViewById(R.id.productName7);
        price7 = (TextView) findViewById(R.id.productPrice7);
        qty7 = (TextView) findViewById(R.id.productQty7);
        product_name7.setText("-");
        price7.setText("-");
        qty7.setText("-");

        product_name8 = (TextView) findViewById(R.id.productName8);
        price8 = (TextView) findViewById(R.id.productPrice8);
        qty8 = (TextView) findViewById(R.id.productQty8);
        product_name8.setText("-");
        price8.setText("-");
        qty8.setText("-");

        product_name9 = (TextView) findViewById(R.id.productName9);
        price9 = (TextView) findViewById(R.id.productPrice9);
        qty9 = (TextView) findViewById(R.id.productQty9);
        product_name9.setText("-");
        price9.setText("-");
        qty9.setText("-");

        product_name10 = (TextView) findViewById(R.id.productName10);
        price10 = (TextView) findViewById(R.id.productPrice10);
        qty10 = (TextView) findViewById(R.id.productQty10);
        product_name10.setText("-");
        price10.setText("-");
        qty10.setText("-");

        product_name11 = (TextView) findViewById(R.id.productName11);
        price11 = (TextView) findViewById(R.id.productPrice11);
        qty11 = (TextView) findViewById(R.id.productQty11);
        product_name11.setText("-");
        price11.setText("-");
        qty11.setText("-");

        product_name12 = (TextView) findViewById(R.id.productName12);
        price12 = (TextView) findViewById(R.id.productPrice12);
        qty12 = (TextView) findViewById(R.id.productQty12);
        product_name12.setText("-");
        price12.setText("-");
        qty12.setText("-");
    }




    public void onReturnClick(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

    public void onProfileClick(View view) {
        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }

    public void onCheckoutClick(View view) {
        Intent intent = new Intent(this, PaymentPage.class);
        startActivity(intent);
    }
}
