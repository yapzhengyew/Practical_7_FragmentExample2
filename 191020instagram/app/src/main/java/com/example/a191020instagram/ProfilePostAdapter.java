package com.example.a191020instagram;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a191020instagram.Fragment.ProfileFragment;

import java.util.List;

public class ProfilePostAdapter extends RecyclerView.Adapter<ProfilePostAdapter.ProfilePostViewHolder> {

    private Context context;
    private List<ProfilePostModel> profilePostModelList;

    public ProfilePostAdapter(Context context, List<ProfilePostModel> profilePostModelList) {
        this.context = context;
        this.profilePostModelList = profilePostModelList;
    }

    @NonNull
    @Override
    public ProfilePostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        LayoutInflater inflater = LayoutInflater.from(context);
        v = inflater.inflate(R.layout.profile_post_item, parent ,false);

        return new ProfilePostViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ProfilePostViewHolder holder, int position) {

        //holder.thumbnail.setText(profilePostModelList.get(position).getThumbnail());

        holder.cardViewMyPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,MyphotosActivity.class);

                //pass data
                intent.putExtra("Post ID",profilePostModelList.get(position).getPostID());
                intent.putExtra("Thumbnail",profilePostModelList.get(position).getThumbnail());
//                intent.putExtra("Post ID",profilePostModelList.get(position).getPostID());
//                intent.putExtra("Post ID",profilePostModelList.get(position).getPostID());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return profilePostModelList.size();
    }

    public static class ProfilePostViewHolder extends RecyclerView.ViewHolder{

        CardView cardViewMyPost;
        ImageView thumbnail;
        public ProfilePostViewHolder(@NonNull View itemView) {

            super(itemView);

            thumbnail = (ImageView) itemView.findViewById(R.id.profile_my_post_thumbnail);
            cardViewMyPost = (CardView) itemView.findViewById(R.id.card_view_profile_my_post);
        }
    }
}
