package com.example.multipleviewtypeapplication.sampleOne.activity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtypeapplication.R;
import com.example.multipleviewtypeapplication.listener.SampleOneClickListener;
import com.example.multipleviewtypeapplication.model.SampleOneObject;
import com.example.multipleviewtypeapplication.sampleOne.adapter.SampleOneAdapter;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImageTranscoderType;
import com.facebook.imagepipeline.core.MemoryChunkType;

import java.util.ArrayList;

public class SampleOneActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SampleOneAdapter adapter;
    ArrayList<SampleOneObject> arrayList = new ArrayList<>();
    int max = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_one);

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

        adapter = new SampleOneAdapter(arrayList, new SampleOneClickListener() {
            @Override
            public void item(SampleOneObject item, int position) {
                if (item.isAdd) {
                    Toast.makeText(SampleOneActivity.this, "Add Click", Toast.LENGTH_SHORT).show();
                    add();
                } else {
                    Toast.makeText(SampleOneActivity.this, "Content Click", Toast.LENGTH_SHORT).show();
                }
            }
        });
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);
    }


    void add() {
        // Filter previous list - Exclude add button
        ArrayList<SampleOneObject> listWithoutAdd = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            SampleOneObject item = arrayList.get(i);
            if (!item.isAdd) {
                listWithoutAdd.add(item);
            }
        }

        // Clear the list
        arrayList.clear();
        // Insert all previous
        arrayList.addAll(listWithoutAdd);
        // Insert new object
        arrayList.add(new SampleOneObject(false, ""));
        // Check if insert Add button
        insertAddButton();

        adapter.notifyDataSetChanged();
    }

    void insertAddButton() {
        // If arrayList size no more than max then insert Add button
        if (arrayList.size() < max) {
            arrayList.add(new SampleOneObject(true, null));
        }
    }
}