package com.example.a121020intern;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView floor;
    ImageView imageView;
    TextView title;
    TextView label;
    TextView exhibition;
    TextView dateTime;
    TextView openToday;
    TextView lat;
    TextView lng;
    TextView name;

    Button button_view;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floor = findViewById(R.id.floor);
        imageView = findViewById(R.id.thumbnail);
        title = findViewById(R.id.theArtMuseum);
        label = findViewById(R.id.mastersOldAndNew);
        exhibition = findViewById(R.id.exhibition);
        dateTime = findViewById(R.id.date);
        openToday = findViewById(R.id.time);
        lat = findViewById(R.id.location_lat);
        lng = findViewById(R.id.location_lng);
        name = findViewById(R.id.location);

        RetrofitInterface retrofitInterface = RetrofitInstance.getRetrofitInstance().create(RetrofitInterface.class);
        Call<Example> listCall = retrofitInterface.getAllData();

        listCall.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example data = response.body();

                //SET ADPATER RECYLCER VEIW

                floor.setText(data.getData().getFloor());

                //adapter = new

                //image
                String path = data.getData().getImageUrl();
                Picasso.with(MainActivity.this).load(path).placeholder(R.drawable.image).into(imageView);

                title.setText(data.getData().getTitle());
                label.setText(data.getData().getLabel());
                exhibition.setText(data.getData().getExhibition());
                dateTime.setText(data.getData().getDateTime());
                openToday.setText(data.getData().getOpenToday());
                lat.setText(Double.toString(data.getData().getLocation().getLat()));
                lng.setText(Double.toString(data.getData().getLocation().getLng()));
                name.setText(data.getData().getLocation().getName());

            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });

//        button_view = findViewById(R.id.planButton);
//        button_view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, ViewNoteActivity.class);
//                startActivity(intent);
//            }
//        });

    }

}