package com.example.a121020intern;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoteAdapterClass extends RecyclerView.Adapter<NoteAdapterClass.ViewHolder> {

    List<NoteModelClass> note;
    Context context;
    DatabaseHelperClass databaseHelperClass;

    public NoteAdapterClass(List<NoteModelClass> note, Context context) {
        this.note = note;
        this.context = context;
        databaseHelperClass = new DatabaseHelperClass(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.note_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        EditText editText_Title;
        EditText editText_Note;
        Button button_edit;
        Button button_delete;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
        }

    }
}
