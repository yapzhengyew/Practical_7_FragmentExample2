package com.example.multipleviewtypeapplication;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

class AddViewHolder extends RecyclerView.ViewHolder {

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
