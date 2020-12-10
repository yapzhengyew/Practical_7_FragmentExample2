package com.example.a161120community.module.residence.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a161120community.R;
import com.example.a161120community.model.ResidenceModel;
import com.example.a161120community.module.residence.holder.OptionViewHolder;

import java.util.ArrayList;

public class ResidenceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    int TYPE_1 = 1;
    int TYPE_2 = 2;

    public ArrayList<ResidenceModel> arrayList;

    public ResidenceAdapter(ArrayList<ResidenceModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new OptionViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_option, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ResidenceModel item = arrayList.get(position);

        OptionViewHolder optionSmallViewHolder = (OptionViewHolder) holder;
        optionSmallViewHolder.setData(item);
    }

    @Override
    public int getItemViewType(int position) {
        ResidenceModel item = arrayList.get(position);

        if (item.getSpace() == 1) {
            return TYPE_1;
        } else {
            return TYPE_2;
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
