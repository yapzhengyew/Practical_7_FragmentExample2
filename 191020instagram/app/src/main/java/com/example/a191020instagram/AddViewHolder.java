package com.example.a191020instagram;

import android.net.Uri;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.io.File;


public class AddViewHolder extends RecyclerView.ViewHolder {

    public AddViewHolder(View itemView) {
        super(itemView);
    }

    void setData(final NewPostObject item, final ClickListener listener) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.item(item, getAdapterPosition());
            }
        });
    }
}
