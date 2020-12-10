package com.example.multipleviewtypeapplication.sampleOne.holder;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtypeapplication.listener.SampleOneClickListener;
import com.example.multipleviewtypeapplication.model.SampleOneObject;
import com.example.multipleviewtypeapplication.R;
import com.facebook.drawee.view.SimpleDraweeView;

public class SampleOneContentViewHolder extends RecyclerView.ViewHolder {
    SimpleDraweeView simpleDraweeView;

    public SampleOneContentViewHolder(View itemView) {
        super(itemView);
        simpleDraweeView = itemView.findViewById(R.id.media);
    }

    public void setData(final SampleOneObject item, final SampleOneClickListener listener) {
        simpleDraweeView.setImageURI("");

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.item(item, getAdapterPosition());
            }
        });
    }
}
