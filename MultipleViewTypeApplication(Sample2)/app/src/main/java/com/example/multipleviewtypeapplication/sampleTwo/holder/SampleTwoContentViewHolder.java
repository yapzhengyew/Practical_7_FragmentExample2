package com.example.multipleviewtypeapplication.sampleTwo.holder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtypeapplication.R;
import com.example.multipleviewtypeapplication.listener.SampleTwoClickListener;
import com.example.multipleviewtypeapplication.model.SampleTwoObject;

public class SampleTwoContentViewHolder extends RecyclerView.ViewHolder {
    TextView value;

    public SampleTwoContentViewHolder(View itemView) {
        super(itemView);
        value = itemView.findViewById(R.id.value);
    }

    public void setData(final SampleTwoObject item, final SampleTwoClickListener listener) {
        value.setText(item.subObject.value);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.item(item, getAdapterPosition());
            }
        });
    }
}
