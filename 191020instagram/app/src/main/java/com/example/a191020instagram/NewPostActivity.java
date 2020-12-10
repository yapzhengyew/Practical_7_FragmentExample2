package com.example.a191020instagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImageTranscoderType;
import com.facebook.imagepipeline.core.MemoryChunkType;
import com.yanzhenjie.album.Action;
import com.yanzhenjie.album.Album;
import com.yanzhenjie.album.AlbumConfig;
import com.yanzhenjie.album.AlbumFile;

import java.io.File;
import java.util.ArrayList;

public class NewPostActivity extends AppCompatActivity {

    private static final int PERMISSION_CODE = 1001;

    RecyclerView recyclerView;
    AddPostAdapter adapter;
    ArrayList<NewPostObject> arrayList = new ArrayList<>();
    int max = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);

//        Fresco.initialize(
//                this,
//                ImagePipelineConfig.newBuilder(this)
//                        .setMemoryChunkType(MemoryChunkType.BUFFER_MEMORY)
//                        .setImageTranscoderType(ImageTranscoderType.JAVA_TRANSCODER)
//                        .experiment().setNativeCodeDisabled(true)
//                        .build());

        recyclerView = findViewById(R.id.recycler_view_add_photo);

        // Initial Add Icon
        insertAddButton();

        adapter = new AddPostAdapter(arrayList, new ClickListener() {
            @Override
            public void item(NewPostObject item, int position) {
                if (item.isAdd) {
                    Toast.makeText(NewPostActivity.this, "Add Click", Toast.LENGTH_SHORT).show();

//                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                        if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
//                            String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE};
//                            requestPermissions(permissions, PERMISSION_CODE);
//                        } else {
//                            pickImageFromGallery();
//                        }
//                    } else {
//                        pickImageFromGallery();
//                    }

                    add();
                } else {
                    Toast.makeText(NewPostActivity.this, "Content Click", Toast.LENGTH_SHORT).show();
                }
            }
        });
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);

        Toolbar toolbar = findViewById(R.id.post_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Album.initialize(AlbumConfig.newBuilder(this)
                .setAlbumLoader(new MediaLoader())
                .build());
    }


    void add() {
        // Filter previous list - Exclude add button
        ArrayList<NewPostObject> listWithoutAdd = new ArrayList<>();
        ArrayList<AlbumFile> mAlbumFiles = new ArrayList<>();

        Album.image(this)
                .multipleChoice()
                .camera(true)
                .columnCount(3)
                .selectCount(5)
                .checkedList(mAlbumFiles)
                .onResult(new Action<ArrayList<AlbumFile>>() {
                    @Override
                    public void onAction(@NonNull ArrayList<AlbumFile> result) {
                        mAlbumFiles.clear();
                        mAlbumFiles.addAll(result);

                        // Clear the list
                        arrayList.clear();

                        for (int i = 0; i < mAlbumFiles.size(); i++) {
                            AlbumFile albumFile = result.get(i);
                            String path = albumFile.getPath();
                            Uri temp = Uri.fromFile(new File(path));
                            arrayList.add(new NewPostObject(false, temp));
                            adapter.notifyDataSetChanged();
                        }

                        insertAddButton();
                    }
                })
                .onCancel(new Action<String>() {
                    @Override
                    public void onAction(@NonNull String result) {
                    }
                })
                .start();

//        for (int i = 0; i < arrayList.size(); i++) {
//            NewPostObject item = arrayList.get(i);
//            if (!item.isAdd) {
//                listWithoutAdd.add(item);
//            }
//        }
//
//
//        // Insert all previous
//        arrayList.addAll(listWithoutAdd);
//        // Insert new object
//        arrayList.add(new NewPostObject(false, ""));
//        // Check if insert Add button
//        insertAddButton();

        adapter.notifyDataSetChanged();
    }

    void insertAddButton() {
        // If arrayList size no more than max then insert Add button
        if (arrayList.size() < max) {
            arrayList.add(new NewPostObject(true, null));
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.post_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.button_post) {
            Toast.makeText(NewPostActivity.this, "Posting Image...", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}