package com.example.a191020instagram.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a191020instagram.IgtvAdapter;
import com.example.a191020instagram.IgtvModel;
import com.example.a191020instagram.PostAdapter;
import com.example.a191020instagram.R;

import java.util.ArrayList;

public class IgtvFragment extends Fragment {

    private RecyclerView recyclerViewIgtv;
    private IgtvAdapter adapterIgtv;
    private RecyclerView.LayoutManager layoutManagerIgtv;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_igtv, container, false);

        //igtv
        ArrayList<IgtvModel> igtvModelArrayList = new ArrayList<>();
        igtvModelArrayList.add(new IgtvModel("","Title 1","100 views"));
        igtvModelArrayList.add(new IgtvModel("","Title 2","300 views"));
        igtvModelArrayList.add(new IgtvModel("","Title 3","500 views"));

        recyclerViewIgtv = v.findViewById(R.id.recycler_view_igtv_post);
        recyclerViewIgtv.setHasFixedSize(true);
        layoutManagerIgtv = new GridLayoutManager(getContext(),2);
        adapterIgtv = new IgtvAdapter(igtvModelArrayList);

        recyclerViewIgtv.setLayoutManager(layoutManagerIgtv);
        recyclerViewIgtv.setAdapter(adapterIgtv);

        return v;
    }
}
