package com.example.multipleviewtypeapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImageTranscoderType;
import com.facebook.imagepipeline.core.MemoryChunkType;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    PostAdapter adapter;
    ArrayList<NewPostObject> arrayList = new ArrayList<>();
    int max = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fresco.initialize(
                this,
                ImagePipelineConfig.newBuilder(this)
                        .setMemoryChunkType(MemoryChunkType.BUFFER_MEMORY)
                        .setImageTranscoderType(ImageTranscoderType.JAVA_TRANSCODER)
                        .experiment().setNativeCodeDisabled(true)
                        .build());

        recyclerView = findViewById(R.id.recyclerView);

        // Initial Add Icon
        insertAddButton();

        adapter = new PostAdapter(arrayList, new ClickListener() {
            @Override
            public void item(NewPostObject item, int position) {
                if (item.isAdd) {
                    Toast.makeText(MainActivity.this, "Add Click", Toast.LENGTH_SHORT).show();
                    add();
                } else {
                    Toast.makeText(MainActivity.this, "Content Click", Toast.LENGTH_SHORT).show();
                }
            }
        });
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);
    }


    void add() {
        // Filter previous list - Exclude add button
        ArrayList<NewPostObject> listWithoutAdd = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            NewPostObject item = arrayList.get(i);
            if (!item.isAdd) {
                listWithoutAdd.add(item);
            }
        }

        // Clear the list
        arrayList.clear();
        // Insert all previous
        arrayList.addAll(listWithoutAdd);
        // Insert new object
        arrayList.add(new NewPostObject(false, ""));
        // Check if insert Add button
        insertAddButton();

        adapter.notifyDataSetChanged();
    }

    void insertAddButton() {
        // If arrayList size no more than max then insert Add button
        if (arrayList.size() < max) {
            arrayList.add(new NewPostObject(true, null));
        }
    }
}