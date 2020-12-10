package com.example.a191020instagram;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder>{


    private Context context;
    private ArrayList<StoryModel> storyModelArrayList;

    public StoryAdapter(Context context, ArrayList<StoryModel> storyModelArrayList) {
        this.context = context;
        this.storyModelArrayList = storyModelArrayList;
    }

    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_item,parent,false);
        StoryViewHolder storyViewHolder = new StoryViewHolder(view);
        return storyViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
        StoryModel currentItem = storyModelArrayList.get(position);


        Glide.with(context)
                .asBitmap()
                .load(currentItem.getImageStory())
                .into(holder.userimage);

        holder.username.setText(currentItem.getUsername());

    }


    @Override
    public int getItemCount() {
        return storyModelArrayList.size();

    }

    public class StoryViewHolder extends RecyclerView.ViewHolder{
        //Boolean storyAvailable;
        CircleImageView storyAvailable;
        CircleImageView userimage;
        TextView username;

        public StoryViewHolder(@NonNull View itemView) {
            super(itemView);
            storyAvailable = itemView.findViewById(R.id.story_available);
            userimage = itemView.findViewById(R.id.main_story_profile_image);
            username = itemView.findViewById(R.id.main_story_username);
        }
    }
}
