package com.example.a191020instagram;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyphotosActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PostAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myphotos_activity);

        Toolbar toolbar = findViewById(R.id.myphoto_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<PostModel> postModelArrayList = new ArrayList<>();
        postModelArrayList.add(new PostModel(1, "https://i.redd.it/tpsnoz5bzo501.jpg", "https://i.redd.it/qn7f9oqu7o501.jpg", "Trondheim", "People 1"));
        postModelArrayList.add(new PostModel(2, "https://i.redd.it/j6myfqglup501.jpg", "https://i.redd.it/0h2gm1ix6p501.jpg", "Mahahual", "People 2"));
        postModelArrayList.add(new PostModel(3, "https://i.redd.it/k98uzl68eh501.jpg", "https://i.redd.it/glin0nwndo501.jpg", "Frozen Lake", "People 3"));

        recyclerView = findViewById(R.id.recycler_view_inside_my_photos);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        adapter = new PostAdapter(postModelArrayList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}


