package com.example.the6th.tablayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.the6th.R;
import com.example.the6th.fragment.viewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.*;



public class tabLayOutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_lay_out);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }
        TabLayout tabLayout = findViewById(R.id.tb_layout);
        ViewPager viewPager = findViewById(R.id.fr_vp_tab);
        viewPager.setAdapter(new viewPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }
    @Override
    protected void onResume() {
        super.onResume();
        ViewPager viewPager = findViewById(R.id.fr_vp_tab);
        int position = viewPager.getCurrentItem();
        switch (position) {
            case 0: {
                Toast.makeText(this, "当前是MIKU页面", Toast.LENGTH_SHORT).show();
                break;
            }
            case 1: {
                Toast.makeText(this, "当前是薇尔莉特页面", Toast.LENGTH_SHORT).show();
                break;
            }
            case 2: {
                Toast.makeText(this, "当前是爱酱页面", Toast.LENGTH_SHORT).show();
                break;
            }
            case 3: {
                Toast.makeText(this, "当前是三玖页面", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}



