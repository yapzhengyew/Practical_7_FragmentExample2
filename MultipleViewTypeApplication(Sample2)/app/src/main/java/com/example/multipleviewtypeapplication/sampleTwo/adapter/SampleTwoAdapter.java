package com.example.multipleviewtypeapplication.sampleTwo.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtypeapplication.R;
import com.example.multipleviewtypeapplication.listener.SampleTwoClickListener;
import com.example.multipleviewtypeapplication.model.SampleTwoObject;
import com.example.multipleviewtypeapplication.sampleTwo.holder.SampleTwoAddViewHolder;
import com.example.multipleviewtypeapplication.sampleTwo.holder.SampleTwoContentViewHolder;

import java.util.ArrayList;

public class SampleTwoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    int TYPE_ADD = 0;
    int TYPE_CONTENT = 1;

    ArrayList<SampleTwoObject> arrayList = new ArrayList<>();
    SampleTwoClickListener listener;

    public SampleTwoAdapter(ArrayList<SampleTwoObject> list, SampleTwoClickListener listener) {
        this.arrayList = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Base on View Type set the ui

        if (viewType == TYPE_ADD) {
            return new SampleTwoAddViewHolder(LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_sample_two_add, viewGroup, false));
        } else {
            return new SampleTwoContentViewHolder(LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_sample_two_media, viewGroup, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SampleTwoObject item = arrayList.get(position);

        // Base on View Type set data
        if (getItemViewType(position) == TYPE_ADD) {
            SampleTwoAddViewHolder addViewHolder = (SampleTwoAddViewHolder) holder;
            addViewHolder.setData(item, listener);
        } else if (getItemViewType(position) == TYPE_CONTENT) {
            SampleTwoContentViewHolder contentViewHolder = (SampleTwoContentViewHolder) holder;
            contentViewHolder.setData(item, listener);
        }
    }

    @Override
    public int getItemViewType(int position) {
        // Checking at here to define which ViewType
        SampleTwoObject item = arrayList.get(position);
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