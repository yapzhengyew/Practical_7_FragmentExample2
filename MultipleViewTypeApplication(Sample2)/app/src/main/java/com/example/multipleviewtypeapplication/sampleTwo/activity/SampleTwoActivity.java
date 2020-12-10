package com.example.multipleviewtypeapplication.sampleTwo.activity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtypeapplication.R;
import com.example.multipleviewtypeapplication.listener.SampleTwoClickListener;
import com.example.multipleviewtypeapplication.model.SampleTwoObject;
import com.example.multipleviewtypeapplication.model.SampleTwoSubObject;
import com.example.multipleviewtypeapplication.sampleTwo.adapter.SampleTwoAdapter;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImageTranscoderType;
import com.facebook.imagepipeline.core.MemoryChunkType;

import java.util.ArrayList;
import java.util.Random;

public class SampleTwoActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SampleTwoAdapter adapter;
    ArrayList<SampleTwoObject> arrayList = new ArrayList<>();
    int max = 20;

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

        adapter = new SampleTwoAdapter(arrayList, new SampleTwoClickListener() {
            @Override
            public void item(SampleTwoObject item, int position) {
                if (item.isAdd) {
                    Toast.makeText(SampleTwoActivity.this, "Add Click", Toast.LENGTH_SHORT).show();
                    add();
                } else {
                    Toast.makeText(SampleTwoActivity.this, "Content Click", Toast.LENGTH_SHORT).show();
                }
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    void add() {
        // Filter previous list - Exclude add button
        ArrayList<SampleTwoObject> listWithoutAdd = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            SampleTwoObject item = arrayList.get(i);
            if (!item.isAdd) {
                listWithoutAdd.add(item);
            }
        }

        // Clear the list
        arrayList.clear();
        // Insert all previous
        arrayList.addAll(listWithoutAdd);
        // Insert new object
        SampleTwoSubObject sub = new SampleTwoSubObject("name", "Value - " + new Random().nextInt(99));
        arrayList.add(new SampleTwoObject(sub));
        // Check if insert Add button
        insertAddButton();

        adapter.notifyDataSetChanged();
    }

    void insertAddButton() {
        // If arrayList size no more than max then insert Add button
        if (arrayList.size() < max) {
            arrayList.add(0, new SampleTwoObject(true));
        }
    }
}