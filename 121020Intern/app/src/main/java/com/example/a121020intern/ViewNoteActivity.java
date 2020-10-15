package com.example.a121020intern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class ViewNoteActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_note);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        DatabaseHelperClass databaseHelperClass = new DatabaseHelperClass(this);
        List<NoteModelClass> noteModelClasses = databaseHelperClass.getNoteList();

        if (noteModelClasses.size() > 0){
            NoteAdapterClass noteAdapterClass = new NoteAdapterClass(noteModelClasses,ViewNoteActivity.this);


        }else {
            Toast.makeText(this,"There is no note in the database", Toast.LENGTH_SHORT).show();
        }
    }
}