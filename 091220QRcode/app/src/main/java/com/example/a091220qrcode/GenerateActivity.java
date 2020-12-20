package com.example.a091220qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.zxing.WriterException;

import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class GenerateActivity extends AppCompatActivity {

    EditText titleValue, contentValue, quantityValue;
    Boolean isShow;
    RelativeLayout btnTrue, btnFalse;
    ImageView trueValue, falseValue;

    Button btnGenerate;
    ImageView qrImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate);

        titleValue = findViewById(R.id.value_title_generate);
        contentValue = findViewById(R.id.value_content);
        quantityValue = findViewById(R.id.editText_quantity);
        btnTrue = findViewById(R.id.button_true);
        btnFalse = findViewById(R.id.button_false);
        trueValue = findViewById(R.id.value_true);
        falseValue = findViewById(R.id.value_false);

        btnGenerate = findViewById(R.id.button_generate);
        qrImage = findViewById(R.id.qrcode_placeholder);


        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QRcodeModel item = new QRcodeModel();
                item.setTitle(titleValue.getText().toString());
                item.setContent(contentValue.getText().toString());
                item.setQuantity(Integer.parseInt(quantityValue.getText().toString()));
                item.setIsShow(isShow);

                String data = item.toString();

//                if(data.isEmpty()){
//                    Toast.makeText(getApplicationContext(), "Value Required.", Toast.LENGTH_SHORT).show();
//                }else {
//                    QRGEncoder qrgEncoder = new QRGEncoder(data,null, QRGContents.Type.TEXT,500);
//                    try {
//                        Bitmap qrBits = qrgEncoder.encodeAsBitmap();
//                        qrImage.setImageBitmap(qrBits);
//                    } catch (WriterException e) {
//                        e.printStackTrace();
//                    }
//                }

                // Initializing the QR Encoder with your value to be encoded, type you required and Dimension
                QRGEncoder qrgEncoder = new QRGEncoder(data, null, QRGContents.Type.TEXT,500);
                // Getting QR-Code as Bitmap
                Bitmap bitmap = qrgEncoder.getBitmap();
                // Setting Bitmap to ImageView
                qrImage.setImageBitmap(bitmap);
            }
        });

        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isShow = true;
                trueValue.setVisibility(View.VISIBLE);
                falseValue.setVisibility(View.GONE);
            }
        });

        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isShow = false;
                trueValue.setVisibility(View.GONE);
                falseValue.setVisibility(View.VISIBLE);
            }
        });
    }

}