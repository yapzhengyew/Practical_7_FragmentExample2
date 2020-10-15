package com.example.a121020intern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddNote extends AppCompatActivity {

    EditText editText_title, editText_note;
    Button button_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        editText_title = findViewById(R.id.edit_text_title);
        editText_note = findViewById(R.id.edit_text_note);

        button_add = findViewById(R.id.button_add);

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringTitle = editText_title.getText().toString();
                String stringNote = editText_note.getText().toString();

                if (stringTitle.length() <= 0 || stringNote.length() <= 0){
                    Toast.makeText(AddNote.this,"Enter All Data",Toast.LENGTH_SHORT).show();
                }else {
                    DatabaseHelperClass databaseHelperClass = new DatabaseHelperClass(AddNote.this);
                    NoteModelClass noteModelClass = new NoteModelClass(stringTitle,stringNote);
                    databaseHelperClass.addNote(noteModelClass);
                    Toast.makeText(AddNote.this,"Add Note Successfully",Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }
            }
        });
    }
}