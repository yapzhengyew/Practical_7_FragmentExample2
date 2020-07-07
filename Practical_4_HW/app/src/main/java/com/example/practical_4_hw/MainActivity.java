package com.example.practical_4_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String message = "Toppings: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMessage(View view) {
        selectToppings((CheckBox) findViewById(R.id.check_chocolate_syrup), getString(R.string.chocolate_syrup_text));
        selectToppings((CheckBox) findViewById(R.id.check_sprinkles), getString(R.string.sprinkles_text));
        selectToppings((CheckBox) findViewById(R.id.check_crushed_nuts), getString(R.string.crushed_nuts_text));
        selectToppings((CheckBox) findViewById(R.id.check_cherries), getString(R.string.cherries_text));
        selectToppings((CheckBox) findViewById(R.id.check_oreo_cookie_crumbles), getString(R.string.oreo_cookie_crumbles));
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void selectToppings(CheckBox checkBox, String topping){
        if (checkBox.isChecked()){
            if (!message.contains(topping)){
                message = message + " " + topping;
            }
        }
        else{
            if (message.contains(topping)){
                message = message.replace(" " + topping, "");
            }
        }
    }

}