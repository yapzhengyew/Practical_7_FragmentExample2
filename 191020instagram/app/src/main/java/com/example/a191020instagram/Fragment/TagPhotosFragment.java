package com.example.a191020instagram.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a191020instagram.PostAdapter;
import com.example.a191020instagram.PostModel;
import com.example.a191020instagram.ProfilePostAdapter;
import com.example.a191020instagram.ProfilePostModel;
import com.example.a191020instagram.R;

import java.util.ArrayList;
import java.util.List;

public class TagPhotosFragment extends Fragment {

    View v;

    ArrayList<ProfilePostModel> profilePostModelList;
    RecyclerView recyclerViewMyPost;
    ProfilePostAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_tag_photos, container, false);
        Log.d("Fragment","Tagsfragment");

        profilePostModelList = new ArrayList<>();
        profilePostModelList.add(new ProfilePostModel(1,"https://i.redd.it/tpsnoz5bzo501.jpg"));
        profilePostModelList.add(new ProfilePostModel(2,"https://i.redd.it/qn7f9oqu7o501.jpg"));
        profilePostModelList.add(new ProfilePostModel(3,"https://i.redd.it/j6myfqglup501.jpg"));
        profilePostModelList.add(new ProfilePostModel(4,"https://i.redd.it/0h2gm1ix6p501.jpg"));
        profilePostModelList.add(new ProfilePostModel(5,"https://i.redd.it/k98uzl68eh501.jpg"));
        profilePostModelList.add(new ProfilePostModel(6,"https://i.redd.it/glin0nwndo501.jpg"));
        profilePostModelList.add(new ProfilePostModel(7,"https://i.redd.it/obx4zydshg601.jpg"));
        profilePostModelList.add(new ProfilePostModel(8,"https://i.imgur.com/ZcLLrkY.jpg"));
        profilePostModelList.add(new ProfilePostModel(9,"https://i.redd.it/tpsnoz5bzo501.jpg"));
        profilePostModelList.add(new ProfilePostModel(10,"https://i.redd.it/j6myfqglup501.jpg"));
        profilePostModelList.add(new ProfilePostModel(11,"https://i.redd.it/j6myfqglup501.jpg"));
        profilePostModelList.add(new ProfilePostModel(12,"https://i.redd.it/0h2gm1ix6p501.jpg"));
        profilePostModelList.add(new ProfilePostModel(13,"https://i.redd.it/k98uzl68eh501.jpg"));
        profilePostModelList.add(new ProfilePostModel(14,"https://i.redd.it/glin0nwndo501.jpg"));
        profilePostModelList.add(new ProfilePostModel(15,"https://i.redd.it/obx4zydshg601.jpg"));
        profilePostModelList.add(new ProfilePostModel(16,"https://i.imgur.com/ZcLLrkY.jpg"));
        profilePostModelList.add(new ProfilePostModel(17,"https://i.redd.it/tpsnoz5bzo501.jpg"));
        profilePostModelList.add(new ProfilePostModel(18,"https://i.redd.it/j6myfqglup501.jpg"));

        recyclerViewMyPost = (RecyclerView) v.findViewById(R.id.recycler_view_tag_photos);
        adapter = new ProfilePostAdapter(getContext(),profilePostModelList);
        recyclerViewMyPost.setLayoutManager(new GridLayoutManager(getContext(),3));
        recyclerViewMyPost.setAdapter(adapter);

        return v;
    }
}
