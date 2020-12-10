package com.example.a191020instagram;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a191020instagram.Fragment.IgtvFragment;

import java.util.ArrayList;
import java.util.List;

public class AddPhotoAdapter extends RecyclerView.Adapter<AddPhotoAdapter.AddPhotoViewHolder>{

//    private Context context;
//    private List<ImageView> imageViewList;
//
//    public AddPhotoAdapter(Context context, List<ImageView> imageViewList) {
//        this.context = context;
//        this.imageViewList = imageViewList;
//    }

    public ArrayList<Uri> uri;

    public AddPhotoAdapter(ArrayList<Uri> uri) {
        this.uri = uri;
    }

    @NonNull
    @Override
    public AddPhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        v = inflater.inflate(R.layout.add_photo_item,parent,false);

        if (viewType == 0){
            //button

        }

        return new AddPhotoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AddPhotoViewHolder holder, int position) {
        holder.image.setImageURI(uri.get(position));

        holder.parentLayout.setOnClickListener((view -> {

        }));
    }

    @Override
    public int getItemCount() {
        //return imageViewList.size();
        return uri.size();
    }


    @Override
    public int getItemViewType(int position) {
//        return super.getItemViewType(position);

        //check position type
        if (position == uri.size()-1){
            return 0;
        }else{
            return 1;
        }
    }

    public static class AddPhotoViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        RelativeLayout parentLayout;

        public AddPhotoViewHolder(@NonNull View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.add_photo_item);
        }
    }


}
