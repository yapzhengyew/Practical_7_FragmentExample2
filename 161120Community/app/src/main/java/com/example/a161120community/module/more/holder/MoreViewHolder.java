package com.example.a161120community.module.more.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a161120community.R;
import com.example.a161120community.model.MoreModel;

public class MoreViewHolder extends RecyclerView.ViewHolder {

    ImageView icon;
    TextView title;
    View shortline;

    public MoreViewHolder(@NonNull View itemView) {
        super(itemView);
        icon = itemView.findViewById(R.id.icon_item_more);
        title = itemView.findViewById(R.id.item_more_name);
        shortline = itemView.findViewById(R.id.short_line);
    }

    public void setData(final MoreModel item) {
        icon.setImageResource(item.getIcon());
        title.setText(item.getTitle());

        if (!item.isShowLine()) {
            shortline.setVisibility(View.GONE);
        } else {
            shortline.setVisibility(View.VISIBLE);
        }

    }
}
