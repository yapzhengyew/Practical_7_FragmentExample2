package com.example.a191020instagram.Fragment;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.a191020instagram.MainActivity;
import com.example.a191020instagram.MyphotosAdapter;
import com.example.a191020instagram.PostModel;
import com.example.a191020instagram.R;
import com.example.a191020instagram.StartPage;
import com.example.a191020instagram.StoryAdapter;
import com.example.a191020instagram.StoryModel;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class ProfileFragment extends Fragment {

    private RecyclerView recyclerViewHighlight;
    private StoryAdapter adapterHighlight;
    private RecyclerView.LayoutManager layoutManagerHighlight;

    private View v;
    private ViewPager viewPager;


    public ProfileFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_profile, container, false);

        //Highlight
        ArrayList<StoryModel> storyModelArrayList = new ArrayList<>();
        storyModelArrayList.add(new StoryModel(true,"https://i.redd.it/tpsnoz5bzo501.jpg","Trondheim"));
        storyModelArrayList.add(new StoryModel(true,"https://i.redd.it/qn7f9oqu7o501.jpg","Portugal"));
        storyModelArrayList.add(new StoryModel(true,"https://i.redd.it/j6myfqglup501.jpg","Rocky Mountain National Park"));


        recyclerViewHighlight = v.findViewById(R.id.recycler_view_profile_highlight);
        layoutManagerHighlight = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        adapterHighlight = new StoryAdapter(getContext(), storyModelArrayList);

        recyclerViewHighlight.setLayoutManager(layoutManagerHighlight);
        recyclerViewHighlight.setAdapter(adapterHighlight);



        return v;
    }


    public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

        private final List<Fragment> fragmentList = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {

            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        public void AddFragment(Fragment fragment){
            fragmentList.add(fragment);
        }


    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        Toolbar toolbar = v.findViewById(R.id.toolbar_profile_username);
        viewPager = v.findViewById(R.id.profile_view_pager);
        TabLayout tabLayout = v.findViewById(R.id.profile_tab_layout);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());

        //Add fragments
        sectionsPagerAdapter.AddFragment(new MyPhotosFragment());
        sectionsPagerAdapter.AddFragment(new TagPhotosFragment());
        sectionsPagerAdapter.AddFragment(new IgtvFragment());

        viewPager.setAdapter(sectionsPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        TabLayout.Tab tab0 = tabLayout.getTabAt(0);
        TabLayout.Tab tab1 = tabLayout.getTabAt(1);
        TabLayout.Tab tab2 = tabLayout.getTabAt(2);

        tab0.setIcon(R.drawable.profile_grid);
        tab1.setIcon(R.drawable.profile_tags);
        tab2.setIcon(R.drawable.profile_igtv);

        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        Uri uri = Uri.parse("https://www.sustainability-times.com/wp-content/uploads/thumbs/leaves-3420078_960_720-39pnqmosh2oq6ra9pzs54w.jpg");
        SimpleDraweeView draweeView = (SimpleDraweeView) view.findViewById(R.id.image_profile);
        draweeView.setImageURI(uri);
    }

    //menu

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);

        super.onCreate(savedInstanceState);


    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.profile_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.button_profile_options) {
            Toast.makeText(getActivity(), "Options...", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }


}