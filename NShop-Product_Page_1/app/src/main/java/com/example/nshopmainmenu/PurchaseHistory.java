package com.example.nshopmainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PurchaseHistory extends AppCompatActivity {

    com.google.firebase.database.DatabaseReference reff;

    TextView address1, total1, orderID1;
    TextView address2, total2, orderID2;
    TextView address3, total3, orderID3;
    TextView address4, total4, orderID4;
    TextView address5, total5, orderID5;
    TextView address6, total6, orderID6;
    TextView address7, total7, orderID7;
    TextView address8, total8, orderID8;
    TextView address9, total9, orderID9;
    TextView address10, total10, orderID10;
    TextView address11, total11, orderID11;
    TextView address12, total12, orderID12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.purchase_history);

        for (int a = 1; a <= PaymentPage.numOfPayment; a++) {
            if (a == 1) {
                String id = String.valueOf(PaymentPage.orderID);
                address1 = (TextView) findViewById(R.id.address1);
                total1 = (TextView) findViewById(R.id.price1);
                orderID1 = (TextView) findViewById(R.id.orderID1);
                orderID1.setText(id);

                String ocNum = String.valueOf(SignUp.cusNum);

                reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oAddress = dataSnapshot.child("Address").getValue().toString();
                        address1.setText(oAddress);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                String oID = String.valueOf(PaymentPage.orderID);
                String ordNum = String.valueOf(SignUp.cusNum);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child("1").child("100000");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oTotal = dataSnapshot.child("Total Price").getValue().toString();
                        total1.setText(oTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            } else if (a == 2) {
                String id = String.valueOf(PaymentPage.orderID);
                address2 = (TextView) findViewById(R.id.address2);
                total2 = (TextView) findViewById(R.id.price2);
                orderID2 = (TextView) findViewById(R.id.orderID2);
                orderID2.setText(id);

                String ocNum = String.valueOf(SignUp.cusNum);

                reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oAddress = dataSnapshot.child("Address").getValue().toString();
                        address2.setText(oAddress);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                String oID = String.valueOf(PaymentPage.orderID);
                String ordNum = String.valueOf(SignUp.cusNum);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child("1").child("100001");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oTotal = dataSnapshot.child("Total Price").getValue().toString();
                        total2.setText(oTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }else if (a == 3) {
                String id = String.valueOf(PaymentPage.orderID);
                address3 = (TextView) findViewById(R.id.address3);
                total3 = (TextView) findViewById(R.id.price3);
                orderID3 = (TextView) findViewById(R.id.orderID3);
                orderID3.setText(id);

                String ocNum = String.valueOf(SignUp.cusNum);

                reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oAddress = dataSnapshot.child("Address").getValue().toString();
                        address3.setText(oAddress);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                String oID = String.valueOf(PaymentPage.orderID);
                String ordNum = String.valueOf(SignUp.cusNum);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child("1").child("100002");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oTotal = dataSnapshot.child("Total Price").getValue().toString();
                        total3.setText(oTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }else if (a == 4) {
                String id = String.valueOf(PaymentPage.orderID);
                address4 = (TextView) findViewById(R.id.address4);
                total4 = (TextView) findViewById(R.id.price4);
                orderID4 = (TextView) findViewById(R.id.orderID4);
                orderID4.setText(id);

                String ocNum = String.valueOf(SignUp.cusNum);

                reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oAddress = dataSnapshot.child("Address").getValue().toString();
                        address4.setText(oAddress);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                String oID = String.valueOf(PaymentPage.orderID);
                String ordNum = String.valueOf(SignUp.cusNum);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child("1").child("100003");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oTotal = dataSnapshot.child("Total Price").getValue().toString();
                        total4.setText(oTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }else if (a == 5) {
                String id = String.valueOf(PaymentPage.orderID);
                address5 = (TextView) findViewById(R.id.address5);
                orderID5 = (TextView) findViewById(R.id.orderID5);
                total5 = (TextView) findViewById(R.id.price5);
                orderID5.setText(id);

                String ocNum = String.valueOf(SignUp.cusNum);

                reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oAddress = dataSnapshot.child("Address").getValue().toString();
                        address5.setText(oAddress);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                String oID = String.valueOf(PaymentPage.orderID);
                String ordNum = String.valueOf(SignUp.cusNum);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child("1").child("100004");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oTotal = dataSnapshot.child("Total Price").getValue().toString();
                        total5.setText(oTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }else if (a == 6) {
                String id = String.valueOf(PaymentPage.orderID);
                address6 = (TextView) findViewById(R.id.address6);
                orderID6 = (TextView) findViewById(R.id.orderID6);
                total6 = (TextView) findViewById(R.id.price6);
                orderID6.setText(id);

                String ocNum = String.valueOf(SignUp.cusNum);

                reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oAddress = dataSnapshot.child("Address").getValue().toString();
                        address6.setText(oAddress);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                String oID = String.valueOf(PaymentPage.orderID);
                String ordNum = String.valueOf(SignUp.cusNum);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child("1").child("100005");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oTotal = dataSnapshot.child("Total Price").getValue().toString();
                        total6.setText(oTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }else if (a == 7) {
                String id = String.valueOf(PaymentPage.orderID);
                address7 = (TextView) findViewById(R.id.address7);
                orderID7 = (TextView) findViewById(R.id.orderID7);
                total7 = (TextView) findViewById(R.id.price7);
                orderID7.setText(id);

                String ocNum = String.valueOf(SignUp.cusNum);

                reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oAddress = dataSnapshot.child("Address").getValue().toString();
                        address7.setText(oAddress);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                String oID = String.valueOf(PaymentPage.orderID);
                String ordNum = String.valueOf(SignUp.cusNum);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child("1").child("100006");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oTotal = dataSnapshot.child("Total Price").getValue().toString();
                        total7.setText(oTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }else if (a == 8) {
                String id = String.valueOf(PaymentPage.orderID);
                address8 = (TextView) findViewById(R.id.address8);
                orderID8 = (TextView) findViewById(R.id.orderID8);
                total8 = (TextView) findViewById(R.id.price8);
                orderID8.setText(id);

                String ocNum = String.valueOf(SignUp.cusNum);

                reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oAddress = dataSnapshot.child("Address").getValue().toString();
                        address8.setText(oAddress);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                String oID = String.valueOf(PaymentPage.orderID);
                String ordNum = String.valueOf(SignUp.cusNum);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child("1").child("100007");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oTotal = dataSnapshot.child("Total Price").getValue().toString();
                        total8.setText(oTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }else if (a == 9) {
                String id = String.valueOf(PaymentPage.orderID);
                address9 = (TextView) findViewById(R.id.address9);
                orderID9 = (TextView) findViewById(R.id.orderID9);
                total9 = (TextView) findViewById(R.id.price9);
                orderID9.setText(id);

                String ocNum = String.valueOf(SignUp.cusNum);

                reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oAddress = dataSnapshot.child("Address").getValue().toString();
                        address9.setText(oAddress);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                String oID = String.valueOf(PaymentPage.orderID);
                String ordNum = String.valueOf(SignUp.cusNum);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child("1").child("100008");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oTotal = dataSnapshot.child("Total Price").getValue().toString();
                        total9.setText(oTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }else if (a == 10) {
                String id = String.valueOf(PaymentPage.orderID);
                address10 = (TextView) findViewById(R.id.address10);
                orderID10 = (TextView) findViewById(R.id.orderID10);
                total10 = (TextView) findViewById(R.id.price10);
                orderID10.setText(id);

                String ocNum = String.valueOf(SignUp.cusNum);

                reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oAddress = dataSnapshot.child("Address").getValue().toString();
                        address10.setText(oAddress);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                String oID = String.valueOf(PaymentPage.orderID);
                String ordNum = String.valueOf(SignUp.cusNum);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child("1").child("100009");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oTotal = dataSnapshot.child("Total Price").getValue().toString();
                        total10.setText(oTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }else if (a == 11) {
                String id = String.valueOf(PaymentPage.orderID);
                address11 = (TextView) findViewById(R.id.address11);
                orderID11 = (TextView) findViewById(R.id.orderID11);
                total11 = (TextView) findViewById(R.id.price11);
                orderID11.setText(id);

                String ocNum = String.valueOf(SignUp.cusNum);

                reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oAddress = dataSnapshot.child("Address").getValue().toString();
                        address11.setText(oAddress);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                String oID = String.valueOf(PaymentPage.orderID);
                String ordNum = String.valueOf(SignUp.cusNum);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child("1").child("100010");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oTotal = dataSnapshot.child("Total Price").getValue().toString();
                        total11.setText(oTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }else if (a == 12) {
                String id = String.valueOf(PaymentPage.orderID);
                address12 = (TextView) findViewById(R.id.address12);
                orderID12 = (TextView) findViewById(R.id.orderID12);
                total12 = (TextView) findViewById(R.id.price12);
                orderID12.setText(id);

                String ocNum = String.valueOf(SignUp.cusNum);

                reff = FirebaseDatabase.getInstance().getReference().child("Users").child(ocNum);
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oAddress = dataSnapshot.child("Address").getValue().toString();
                        address12.setText(oAddress);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                String oID = String.valueOf(PaymentPage.orderID);
                String ordNum = String.valueOf(SignUp.cusNum);
                reff = FirebaseDatabase.getInstance().getReference().child("Shopping Cart").child("1").child("100011");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String oTotal = dataSnapshot.child("Total Price").getValue().toString();
                        total12.setText(oTotal);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        }
    }

    public void onReturnClick(View view) {
        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }

    public void onHomeClick(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}
