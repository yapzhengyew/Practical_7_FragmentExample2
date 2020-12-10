package com.example.a161120community.module.chat.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a161120community.api.RetrofitInstance;
import com.example.a161120community.api.RetrofitInterface;
import com.example.a161120community.model.Datum;
import com.example.a161120community.model.Example;
import com.example.a161120community.module.chat.adapter.PostAdapter;
import com.example.a161120community.R;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImageTranscoderType;
import com.facebook.imagepipeline.core.MemoryChunkType;
import com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig;

import java.util.ArrayList;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChatFragment extends Fragment {

    View v;

    private RecyclerView recyclerViewPost;
    private PostAdapter adapterPost;
    private RecyclerView.LayoutManager layoutManagerPost;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_chat, container, false);

//        Fresco.initialize(
//                getContext(),
//                ImagePipelineConfig.newBuilder(getContext())
//                        .setMemoryChunkType(MemoryChunkType.BUFFER_MEMORY)
//                        .setImageTranscoderType(ImageTranscoderType.JAVA_TRANSCODER)
//                        .experiment().setNativeCodeDisabled(true)
//                        .build());

//        Fresco.initialize(getContext());

        ImagePipelineConfig config = ImagePipelineConfig.newBuilder(getContext())
                .setProgressiveJpegConfig(new SimpleProgressiveJpegConfig())
                .setResizeAndRotateEnabledForNetwork(true)
                .setDownsampleEnabled(true)
                .build();
        Fresco.initialize(getContext(),config);

        RetrofitInterface retrofitInterface = RetrofitInstance.getRetrofitInstance().create(RetrofitInterface.class);
        Call<Example> listCall = retrofitInterface.getAllData();

        recyclerViewPost = v.findViewById(R.id.recycler_view_fragment_chat);

        listCall.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example data = response.body();

                ArrayList<Datum> datumArrayList = new ArrayList<>();
                datumArrayList = data.getData();

                layoutManagerPost = new LinearLayoutManager(getContext());
                adapterPost = new PostAdapter(datumArrayList);

                recyclerViewPost.setLayoutManager(layoutManagerPost);
                recyclerViewPost.setAdapter(adapterPost);
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });


        return v;
    }
}