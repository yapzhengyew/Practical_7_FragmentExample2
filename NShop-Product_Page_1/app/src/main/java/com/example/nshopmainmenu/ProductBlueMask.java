package com.example.nshopmainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProductBlueMask extends AppCompatActivity {

    private TextView qty;
    private int qtyNum = 1;
    private String name = "Blue Mask";
    private double total;

    public void setQtyNum(int x){
        qtyNum = x;
    }

    public int getQtyNum() {
        return qtyNum;
    }

    public void setName(String x){
        name = x;
    }

    public String getName(){
        return name;
    }

    public void setTotal(double x) {
        total = x;
    }

    public double getTotal(){
        return total;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productbluemask_page);

        qty = (TextView) findViewById(R.id.qtyNum);
    }

    public void countUp(View view) {
        qtyNum++;
        qty.setText(String.format("%s", qtyNum));
    }

    public void countDown(View view) {
        if (qtyNum > 1) {
            qtyNum--;
            qty.setText(String.format("%s", qtyNum));
        }
        else {
            Toast toast = Toast.makeText(this, R.string.zero_order,Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void onReturnClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onAddToCartClick(View view) {
        total = qtyNum * 2.00;
        ConfirmOrder.prodQty = qtyNum;
        ConfirmOrder.prodName = name;
        ConfirmOrder.prodTotalPrice = total;
        ConfirmOrder.allTotal += total;
        Intent intent = new Intent(this, ConfirmOrder.class);
        startActivity(intent);
    }
}
