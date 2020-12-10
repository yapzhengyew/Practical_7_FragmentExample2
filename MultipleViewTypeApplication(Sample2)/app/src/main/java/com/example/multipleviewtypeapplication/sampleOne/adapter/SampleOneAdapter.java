package com.example.multipleviewtypeapplication.sampleOne.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtypeapplication.listener.SampleOneClickListener;
import com.example.multipleviewtypeapplication.model.SampleOneObject;
import com.example.multipleviewtypeapplication.R;
import com.example.multipleviewtypeapplication.sampleOne.holder.SampleOneAddViewHolder;
import com.example.multipleviewtypeapplication.sampleOne.holder.SampleOneContentViewHolder;

import java.util.ArrayList;

public class SampleOneAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    int TYPE_ADD = 0;
    int TYPE_CONTENT = 1;

    ArrayList<SampleOneObject> arrayList = new ArrayList<>();
    SampleOneClickListener listener;

    public SampleOneAdapter(ArrayList<SampleOneObject> list, SampleOneClickListener listener) {
        this.arrayList = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Base on View Type set the ui

        if (viewType == TYPE_ADD) {
            return new SampleOneAddViewHolder(LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_sample_one_add, viewGroup, false));
        } else {
            return new SampleOneContentViewHolder(LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_sample_one_media, viewGroup, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SampleOneObject item = arrayList.get(position);

        // Base on View Type set data
        if (getItemViewType(position) == TYPE_ADD) {
            SampleOneAddViewHolder addViewHolder = (SampleOneAddViewHolder) holder;
            addViewHolder.setData(item, listener);
        } else if (getItemViewType(position) == TYPE_CONTENT) {
            SampleOneContentViewHolder contentViewHolder = (SampleOneContentViewHolder) holder;
            contentViewHolder.setData(item, listener);
        }
    }


    @Override
    public int getItemViewType(int position) {
        // Checking at here to define which ViewType
        SampleOneObject item = arrayList.get(position);
        if (item.isAdd) {
            return TYPE_ADD;
        } else {
            return TYPE_CONTENT;
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}