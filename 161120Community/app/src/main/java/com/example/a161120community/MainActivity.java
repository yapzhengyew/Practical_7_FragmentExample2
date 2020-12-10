package com.example.a161120community;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.a161120community.module.chat.fragment.ChatFragment;
import com.example.a161120community.module.more.fragment.MoreFragment;
import com.example.a161120community.module.residence.fragment.ResidenceFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Fragment selectedFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //simple drawee
//        Fresco.initialize(
//                this,
//                ImagePipelineConfig.newBuilder(this)
//                        .setMemoryChunkType(MemoryChunkType.BUFFER_MEMORY)
//                        .setImageTranscoderType(ImageTranscoderType.JAVA_TRANSCODER)
//                        .experiment().setNativeCodeDisabled(true)
//                        .build());

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_main, new ChatFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            menuItem -> {

                switch (menuItem.getItemId()){
                    case R.id.nav_chat:
                        selectedFragment = new ChatFragment();
                        break;
                    case R.id.nav_residence:
                        selectedFragment = new ResidenceFragment();
                        break;
                    case R.id.nav_more:
                        selectedFragment = new MoreFragment();
                        break;
                }

                if (selectedFragment != null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_main, selectedFragment).commit();
                }
                return true;
            };
}