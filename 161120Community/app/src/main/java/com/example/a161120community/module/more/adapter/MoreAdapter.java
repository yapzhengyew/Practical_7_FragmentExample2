package com.example.a161120community.module.more.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a161120community.R;
import com.example.a161120community.model.MoreModel;
import com.example.a161120community.module.more.holder.BlankViewHolder;
import com.example.a161120community.module.more.holder.MoreHeaderViewHolder;
import com.example.a161120community.module.more.holder.MoreViewHolder;

import java.util.ArrayList;

public class MoreAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    int TYPE_HEADER = 1;
    int TYPE_ROW = 2;
    int TYPE_BLANK = 3;

    public ArrayList<MoreModel> arrayList;

    public MoreAdapter(ArrayList<MoreModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == TYPE_HEADER) {
            return new MoreHeaderViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_more_header, parent, false));
        } else if (viewType == TYPE_ROW) {
            return new MoreViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_more, parent, false));
        } else {
            return new BlankViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_blank, parent, false));
        }


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MoreModel item = arrayList.get(position);

        if (getItemViewType(position) == TYPE_HEADER) {
            MoreHeaderViewHolder moreHeaderViewHolder = (MoreHeaderViewHolder) holder;
            moreHeaderViewHolder.setData(item);
        } else if (getItemViewType(position) == TYPE_ROW) {
            MoreViewHolder moreViewHolder = (MoreViewHolder) holder;
            moreViewHolder.setData(item);
        } else if (getItemViewType(position) == TYPE_BLANK) {
            BlankViewHolder blankViewHolder = (BlankViewHolder) holder;
        }

    }

    @Override
    public int getItemViewType(int position) {

        MoreModel item = arrayList.get(position);

        if (item.getMoreType().getIntValue() == 1) {
            return TYPE_HEADER;
        } else if (item.getMoreType().getIntValue() == 2) {
            return TYPE_ROW;
        } else {
            return TYPE_BLANK;
        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
