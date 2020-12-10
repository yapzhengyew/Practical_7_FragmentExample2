package com.example.a191020instagram;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;

public class ContentViewHolder extends RecyclerView.ViewHolder {
    SimpleDraweeView simpleDraweeView;

    public ContentViewHolder(View itemView) {
        super(itemView);
        simpleDraweeView = itemView.findViewById(R.id.media);
    }

    void setData(final NewPostObject item, final ClickListener listener) {
        simpleDraweeView.setImageURI(item.getAlbum());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.item(item, getAdapterPosition());
            }
        });
    }
}
