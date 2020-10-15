package com.example.a121020intern;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHelperClass extends SQLiteOpenHelper {

    //Database version
    private static final int DATABASE_VERSION = 1;
    //Database name
    private static final String DATABASE_NAME = "note_daatabase";
    //Database table name
    private static final String TABLE_NAME = "NOTE";
    //Table columns
    public static final String ID = "id";
    public static final String TITLE = "title";
    public static final String NOTE = "note";

    private SQLiteDatabase sqLiteDatabase;

    //creating table query
    private static final String CREATE_TABLE = "create table "+TABLE_NAME
            +"("+ID +"INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TITLE + "TEXT NOT NULL,"
            + NOTE + "TEXT NOT NULL);";

    //constructor
    public DatabaseHelperClass (Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    //add note data
    public void addNote(NoteModelClass noteModelClass){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelperClass.TITLE,noteModelClass.getTitle());
        contentValues.put(DatabaseHelperClass.NOTE,noteModelClass.getNote());
        sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.insert(DatabaseHelperClass.TABLE_NAME,null,contentValues);
    }

    public List<NoteModelClass> getNoteList(){
        String sql = "select * from "+TABLE_NAME;
        sqLiteDatabase = this.getReadableDatabase();
        List<NoteModelClass> storeNote = new ArrayList<>();
        Cursor cursor = sqLiteDatabase.rawQuery(sql,null);
        if (cursor.moveToFirst()){
            do {
                int id = Integer.parseInt(cursor.getString(0));
                String title = cursor.getString(1);
                String note = cursor.getString(2);
                storeNote.add(new NoteModelClass(id,title,note));
            }while (cursor.moveToNext());
        }
        cursor.close();
        return storeNote;
    }


}
