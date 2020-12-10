package com.example.a161120community.module.chat.holder;

import android.net.Uri;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a161120community.R;
import com.example.a161120community.model.Datum;
import com.facebook.drawee.view.SimpleDraweeView;

public class Images3MoreViewHolder extends RecyclerView.ViewHolder {

    SimpleDraweeView profile;
    TextView username;
    TextView place;
    SimpleDraweeView thumbnail1;
    SimpleDraweeView thumbnail2;
    SimpleDraweeView thumbnail3;
    SimpleDraweeView shadow;
    TextView moreImages;
    TextView content;
    SimpleDraweeView firstLike;
    SimpleDraweeView secondLike;
    TextView numberLikes;
    TextView totalLikes;
    TextView totalComments;

    RelativeLayout person_liked;

    public Images3MoreViewHolder(@NonNull View itemView) {
        super(itemView);
        profile = itemView.findViewById(R.id.profile);
        username = itemView.findViewById(R.id.username);
        place = itemView.findViewById(R.id.place_time);
        thumbnail1 = itemView.findViewById(R.id.content_first_thumbnail_3_more_images);
        thumbnail2 = itemView.findViewById(R.id.content_second_thumbnail_3_more_images);
        thumbnail3 = itemView.findViewById(R.id.content_third_thumbnail_3_more_images);
        shadow = itemView.findViewById(R.id.content_more_images_shadow);
        moreImages = itemView.findViewById(R.id.number_more_images);
        content = itemView.findViewById(R.id.content_text_3_more_images);
        firstLike = itemView.findViewById(R.id.first_like);
        secondLike = itemView.findViewById(R.id.second_like);
        numberLikes = itemView.findViewById(R.id.number_likes);
        totalLikes = itemView.findViewById(R.id.number_total_likes);
        totalComments = itemView.findViewById(R.id.number_comment);

        person_liked = itemView.findViewById(R.id.bar_people_liked);
    }

    public void setData(final Datum item) {
        Uri imageUri = Uri.parse("https://i.imgur.com/tGbaZCY.jpg");

//        profile.setImageURI(item.getProfilePhoto());
        profile.setImageURI(imageUri);
        username.setText(item.getUsername());
        place.setText(item.getCommunity());
//        thumbnail1.setImageURI(item.getFile().get(0).getSrc());
//        thumbnail2.setImageURI(item.getFile().get(1).getSrc());
//        thumbnail3.setImageURI(item.getFile().get(2).getSrc());
        thumbnail1.setImageURI(imageUri);
        thumbnail2.setImageURI(imageUri);
        thumbnail3.setImageURI(imageUri);
        content.setText(item.getPostSubject());
        numberLikes.setText("+" + item.getLikeCount());
        totalLikes.setText("" + item.getLikeCount());
        totalComments.setText("" + item.getCommentCount());

        if (item.getLikeCount() == 0) {
            person_liked.setVisibility(View.GONE);
        } else if (item.getLikeCount() == 1) {
            firstLike.setImageURI(item.getLikedUsers().get(0).getUserProfile());
            firstLike.setImageURI(imageUri);
            secondLike.setVisibility(View.GONE);
            person_liked.setVisibility(View.VISIBLE);
        } else {
//            firstLike.setImageURI(item.getLikedUsers().get(0).getUserProfile());
//            secondLike.setImageURI(item.getLikedUsers().get(1).getUserProfile());
            firstLike.setImageURI(imageUri);
            secondLike.setImageURI(imageUri);
            secondLike.setVisibility(View.VISIBLE);
            person_liked.setVisibility(View.VISIBLE);

        }

        if (item.getFile().size() == 3) {
            shadow.setVisibility(View.GONE);
            moreImages.setText(" ");
        } else {
            shadow.setVisibility(View.VISIBLE);
            moreImages.setText("+"+(item.getFile().size() - 3));
        }
    }
}
