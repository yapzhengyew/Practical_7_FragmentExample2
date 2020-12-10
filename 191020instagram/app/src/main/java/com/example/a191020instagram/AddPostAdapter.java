package com.example.a191020instagram;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AddPostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    int TYPE_ADD = 0;
    int TYPE_CONTENT = 1;

    ArrayList<NewPostObject> arrayList = new ArrayList<>();
    ClickListener listener;

    public AddPostAdapter(ArrayList<NewPostObject> list, ClickListener listener) {
        this.arrayList = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Base on View Type set the ui

        if (viewType == TYPE_ADD) {
            return new AddViewHolder(LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_post_add, viewGroup, false));
        } else {
            return new ContentViewHolder(LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_post_media, viewGroup, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        NewPostObject item = arrayList.get(position);

        // Base on View Type set data
        if (getItemViewType(position) == TYPE_ADD) {
            AddViewHolder addViewHolder = (AddViewHolder) holder;
            addViewHolder.setData(item, listener);
        } else if (getItemViewType(position) == TYPE_CONTENT) {
            ContentViewHolder contentViewHolder = (ContentViewHolder) holder;
            contentViewHolder.setData(item, listener);
        }
    }


    @Override
    public int getItemViewType(int position) {
        // Checking at here to define which ViewType
        NewPostObject item = arrayList.get(position);
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
