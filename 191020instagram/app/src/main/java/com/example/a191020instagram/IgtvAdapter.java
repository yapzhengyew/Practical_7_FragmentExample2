package com.example.a191020instagram;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class IgtvAdapter extends RecyclerView.Adapter<IgtvAdapter.IgtvViewholder> {

    private ArrayList<IgtvModel> igtvModelArrayList;

    public IgtvAdapter(ArrayList<IgtvModel> igtvModelArrayList){
        this.igtvModelArrayList = igtvModelArrayList;
    }

    @NonNull
    @Override
    public IgtvAdapter.IgtvViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.igtv_item,parent,false);
        IgtvViewholder igtvViewholder = new IgtvViewholder(v);
        return igtvViewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull IgtvAdapter.IgtvViewholder holder, int position) {

        IgtvModel currrenItem = igtvModelArrayList.get(position);

        //holder.igtvThumbnail.setImageURI(currrenItem.getIgtvThumbnail());
        holder.igtvTitle.setText(currrenItem.getIgtvTitle());
        holder.igtvViews.setText(currrenItem.getIgtvViews());

    }

    @Override
    public int getItemCount() {
        return igtvModelArrayList.size();
    }

    public static class IgtvViewholder extends RecyclerView.ViewHolder{

        public ImageView igtvThumbnail;
        public TextView igtvTitle, igtvViews;

        public IgtvViewholder(@NonNull View itemView) {
            super(itemView);

            igtvThumbnail = itemView.findViewById(R.id.igtv_thumbnail);
            igtvTitle = itemView.findViewById(R.id.igtv_title);
            igtvViews = itemView.findViewById(R.id.igtv_views);

        }
    }

}
