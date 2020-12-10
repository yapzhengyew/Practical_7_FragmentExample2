package com.example.multipleviewtypeapplication.sampleTwo.holder;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtypeapplication.listener.SampleTwoClickListener;
import com.example.multipleviewtypeapplication.model.SampleTwoObject;

public class SampleTwoAddViewHolder extends RecyclerView.ViewHolder {

    public SampleTwoAddViewHolder(View itemView) {
        super(itemView);
    }

    public void setData(final SampleTwoObject item, final SampleTwoClickListener listener) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.item(item, getAdapterPosition());
            }
        });
    }
}
