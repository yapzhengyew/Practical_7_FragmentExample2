package com.example.multipleviewtypeapplication.sampleOne.holder;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtypeapplication.listener.SampleOneClickListener;
import com.example.multipleviewtypeapplication.model.SampleOneObject;

public class SampleOneAddViewHolder extends RecyclerView.ViewHolder {

    public SampleOneAddViewHolder(View itemView) {
        super(itemView);
    }

    public void setData(final SampleOneObject item, final SampleOneClickListener listener) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.item(item, getAdapterPosition());
            }
        });
    }
}
