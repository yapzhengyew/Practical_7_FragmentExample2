package com.example.a161120community.module.more.holder;

import android.net.Uri;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a161120community.R;
import com.example.a161120community.model.MoreModel;
import com.facebook.drawee.view.SimpleDraweeView;

public class MoreHeaderViewHolder extends RecyclerView.ViewHolder {
    SimpleDraweeView profile_pic;

    public MoreHeaderViewHolder(@NonNull View itemView) {
        super(itemView);
        profile_pic = itemView.findViewById(R.id.profile_pic_header);
    }

    public void setData(final MoreModel item) {

        Uri imageUri = Uri.parse("https://i.imgur.com/tGbaZCY.jpg");
        profile_pic.setImageURI(imageUri);
    }
}

