package com.example.a161120community.module.residence.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a161120community.R;
import com.example.a161120community.model.ResidenceModel;
import com.example.a161120community.module.residence.adapter.ResidenceAdapter;

import java.util.ArrayList;

public class ResidenceFragment extends Fragment {

    View v;

    ArrayList<ResidenceModel> residenceModelArrayList;
    RecyclerView recyclerViewResidence;
    ResidenceAdapter residenceAdapter;
    GridLayoutManager gridLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_residence, container, false);

        //options data
        residenceModelArrayList = new ArrayList<>();
        residenceModelArrayList.add(new ResidenceModel(1, "#1BA9B2", "General Contact", "get genaral contact information", R.drawable.icon_general_contact));
        residenceModelArrayList.add(new ResidenceModel(2, "#FFA31F", "EMERGENCY CALL", "directly call to guardhouse", R.drawable.icon_emergency_call));
        residenceModelArrayList.add(new ResidenceModel(1, "#1BA9B2", "Announce-ment", "get latest announcement", R.drawable.icon_announcement));
        residenceModelArrayList.add(new ResidenceModel(1, "#1BA9B2", "Enquiry", "make enquiry to residential authorities", R.drawable.icon_enquiry));
        residenceModelArrayList.add(new ResidenceModel(1, "#1BA9B2", "Facility Booking", "book availabe facilities", R.drawable.icon_facility_booking));
        residenceModelArrayList.add(new ResidenceModel(1, "#1BA9B2", "Visitor", "send visitor a VAC to\n" + "pass the guardhouse\n" + "easily", R.drawable.icon_visitor));
        residenceModelArrayList.add(new ResidenceModel(1, "#1BA9B2", "Classified", "Marketplace within your housing community", R.drawable.icon_classified));
        residenceModelArrayList.add(new ResidenceModel(1, "#1BA9B2", "Bill Payment", "easily pay with omnipay", R.drawable.icon_bill_payment));
        residenceModelArrayList.add(new ResidenceModel(2, "#1BA9B2", "Trusted Neighbour", "Assign neighbours you trust in your community", R.drawable.icon_trusted_neighbour));
        residenceModelArrayList.add(new ResidenceModel(1, "#1BA9B2", "Services", "Discover various services available\n" + "near you.", R.drawable.icon_services));
        residenceModelArrayList.add(new ResidenceModel(2, "#0D4450", "Air Conditioner\n" + "Management", "For student use only", R.drawable.icon_air_conditioner));
        residenceModelArrayList.add(new ResidenceModel(1, "#1BA9B2", " ", " ", R.color.albumTransparent));

        recyclerViewResidence = (RecyclerView) v.findViewById(R.id.recycler_view_residence_options);
        residenceAdapter = new ResidenceAdapter(residenceModelArrayList);

        gridLayoutManager = new GridLayoutManager(getContext(),3);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return residenceAdapter.getItemViewType(position);
            }
        });

        recyclerViewResidence.setLayoutManager(gridLayoutManager);
        recyclerViewResidence.setAdapter(residenceAdapter);

        return v;
    }
}