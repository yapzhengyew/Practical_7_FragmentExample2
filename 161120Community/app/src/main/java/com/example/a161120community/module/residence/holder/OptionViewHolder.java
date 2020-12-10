package com.example.a161120community.module.residence.holder;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a161120community.R;
import com.example.a161120community.model.ResidenceModel;

public class OptionViewHolder extends RecyclerView.ViewHolder {
    RelativeLayout background;
    TextView title;
    TextView desc;
    ImageView icon;

    public OptionViewHolder(@NonNull View itemView) {
        super(itemView);
        background = itemView.findViewById(R.id.background);
        title = itemView.findViewById(R.id.title);
        desc = itemView.findViewById(R.id.desc);
        icon = itemView.findViewById(R.id.icon);
    }

    public void setData(final ResidenceModel item){
        background.setBackgroundColor(Color.parseColor(item.getColor()));
        title.setText(item.getTitle());
        desc.setText(item.getDesc());
        icon.setImageResource(item.getIcon());
    }
}
