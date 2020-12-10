package com.example.a161120community.module.more.fragment;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a161120community.R;
import com.example.a161120community.model.MoreModel;
import com.example.a161120community.model.MoreType;
import com.example.a161120community.model.ResidenceModel;
import com.example.a161120community.module.more.adapter.MoreAdapter;
import com.example.a161120community.module.residence.adapter.ResidenceAdapter;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;

public class MoreFragment extends Fragment {

    View v;

    ArrayList<MoreModel> moreModelArrayList;
    RecyclerView recyclerViewMore;
    MoreAdapter moreAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_more, container, false);

        //more item
        moreModelArrayList = new ArrayList<>();
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_HEADER, 0, "", true));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_ROW, R.drawable.icon_update_profile, "Update Profile", true));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_ROW, R.drawable.icon_change_password, "Change Password", false));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_BLANK, 0, "", false));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_ROW, R.drawable.icon_notification, "Notification", true));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_ROW, R.drawable.icon_vac_history, "VAC History", true));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_ROW, R.drawable.icon_blacklists, "Blacklists", true));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_ROW, R.drawable.icon_setting, "Settings", false));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_BLANK, 0, "", false));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_ROW, R.drawable.icon_support, "Support", true));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_ROW, R.drawable.icon_view_features, "View Features", true));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_ROW, R.drawable.icon_terms_and_conditions, "Terms and Conditions", true));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_ROW, R.drawable.icon_privacy_policy, "Privacy Policy", true));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_ROW, R.drawable.icon_about_us, "About Us", true));
        moreModelArrayList.add(new MoreModel(MoreType.TYPE_ROW, R.drawable.icon_logout, "Logout", false));

        recyclerViewMore = (RecyclerView) v.findViewById(R.id.recycler_view_more);
        moreAdapter = new MoreAdapter(moreModelArrayList);
        recyclerViewMore.setAdapter(moreAdapter);
        recyclerViewMore.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }
}