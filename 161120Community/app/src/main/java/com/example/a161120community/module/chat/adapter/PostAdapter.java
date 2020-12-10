package com.example.a161120community.module.chat.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a161120community.R;
import com.example.a161120community.model.Datum;
import com.example.a161120community.module.chat.holder.Image1ViewHolder;
import com.example.a161120community.module.chat.holder.Images2ViewHolder;
import com.example.a161120community.module.chat.holder.Images3MoreViewHolder;
import com.example.a161120community.module.chat.holder.OnlyTextViewHolder;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    int TYPE_ONLY_TEXT = 0;
    int TYPE_1_IMAGE = 1;
    int TYPE_2_IMAGES = 2;
    int TYPE_3_MORE_IMAGES = 3;

    ArrayList<Datum> arrayList = new ArrayList<>();

    public PostAdapter(ArrayList<Datum> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == TYPE_ONLY_TEXT) {
            return new OnlyTextViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_post_only_text, parent, false));
        } else if (viewType == TYPE_1_IMAGE) {
            return new Image1ViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_post_1image, parent, false));
        } else if (viewType == TYPE_2_IMAGES) {
            return new Images2ViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_post_2images, parent, false));
        } else {
            return new Images3MoreViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_post_3moreimages, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Datum item = arrayList.get(position);

        if (getItemViewType(position) == TYPE_ONLY_TEXT) {
            OnlyTextViewHolder onlyTextViewHolder = (OnlyTextViewHolder) holder;
            onlyTextViewHolder.setData(item);
        } else if (getItemViewType(position) == TYPE_1_IMAGE) {
            Image1ViewHolder image1ViewHolder = (Image1ViewHolder) holder;
            image1ViewHolder.setData(item);
        } else if (getItemViewType(position) == TYPE_2_IMAGES) {
            Images2ViewHolder images2ViewHolder = (Images2ViewHolder) holder;
            images2ViewHolder.setData(item);
        } else if (getItemViewType(position) == TYPE_3_MORE_IMAGES) {
            Images3MoreViewHolder images3MoreViewHolder = (Images3MoreViewHolder) holder;
            images3MoreViewHolder.setData(item);
        }
    }

    @Override
    public int getItemViewType(int position) {

        Datum item = arrayList.get(position);

        if (item.getFile().size() == 0) {
            return TYPE_ONLY_TEXT;
        } else if (item.getFile().size() == 1) {
            return TYPE_1_IMAGE;
        } else if (item.getFile().size() == 2) {
            return TYPE_2_IMAGES;
        } else {
            return TYPE_3_MORE_IMAGES;
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
