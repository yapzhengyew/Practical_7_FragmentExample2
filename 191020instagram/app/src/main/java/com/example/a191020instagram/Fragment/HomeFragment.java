package com.example.a191020instagram.Fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a191020instagram.PostAdapter;
import com.example.a191020instagram.PostModel;
import com.example.a191020instagram.R;
import com.example.a191020instagram.StoryAdapter;
import com.example.a191020instagram.StoryModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerViewPost;
    private PostAdapter adapterPost;
    private RecyclerView.LayoutManager layoutManagerPost;

    private RecyclerView recyclerViewStory;
    private StoryAdapter adapterStory;
    private RecyclerView.LayoutManager layoutManagerStory;

    View v;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        v = inflater.inflate(R.layout.fragment_home, container, false);

        //main post
        ArrayList<PostModel> postModelArrayList = new ArrayList<>();
        postModelArrayList.add(new PostModel(1, "https://i.redd.it/tpsnoz5bzo501.jpg", "https://i.redd.it/qn7f9oqu7o501.jpg", "Trondheim", "People 1"));
        postModelArrayList.add(new PostModel(2, "https://i.redd.it/j6myfqglup501.jpg", "https://i.redd.it/0h2gm1ix6p501.jpg", "Mahahual", "People 2"));
        postModelArrayList.add(new PostModel(3, "https://i.redd.it/k98uzl68eh501.jpg", "https://i.redd.it/glin0nwndo501.jpg", "Frozen Lake", "People 3"));

        recyclerViewPost = v.findViewById(R.id.recycler_view_main_posts);
        recyclerViewPost.setHasFixedSize(true);
        layoutManagerPost = new LinearLayoutManager(getContext());
        adapterPost = new PostAdapter(postModelArrayList);

        recyclerViewPost.setLayoutManager(layoutManagerPost);
        recyclerViewPost.setAdapter(adapterPost);

        //story
        ArrayList<StoryModel> storyModelArrayList = new ArrayList<>();
        storyModelArrayList.add(new StoryModel(true,"https://i.redd.it/tpsnoz5bzo501.jpg","Trondheim"));
        storyModelArrayList.add(new StoryModel(true,"https://i.redd.it/qn7f9oqu7o501.jpg","Portugal"));
        storyModelArrayList.add(new StoryModel(true,"https://i.redd.it/j6myfqglup501.jpg","Rocky Mountain National Park"));
        storyModelArrayList.add(new StoryModel(true,"https://i.redd.it/0h2gm1ix6p501.jpg","Mahahual"));
        storyModelArrayList.add(new StoryModel(true,"https://i.redd.it/k98uzl68eh501.jpg","Frozen Lake"));
        storyModelArrayList.add(new StoryModel(true,"https://i.redd.it/glin0nwndo501.jpg","White Sands Desert"));
        storyModelArrayList.add(new StoryModel(true,"https://i.redd.it/obx4zydshg601.jpg","Austrailia"));
        storyModelArrayList.add(new StoryModel(true,"https://i.imgur.com/ZcLLrkY.jpg","Washington"));


        recyclerViewStory = v.findViewById(R.id.recycler_view_main_story);
        layoutManagerStory = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        adapterStory = new StoryAdapter(getContext(), storyModelArrayList);

        recyclerViewStory.setLayoutManager(layoutManagerStory);
        recyclerViewStory.setAdapter(adapterStory);

        return v;
    }



}