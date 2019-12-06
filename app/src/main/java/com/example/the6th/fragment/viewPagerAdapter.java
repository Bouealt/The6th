package com.example.the6th.fragment;

import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class viewPagerAdapter extends FragmentStatePagerAdapter {
    public viewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "MIKU";
            case 1: return "薇尔莉特";
            case 2: return "爱酱";
            case 3: return "三玖";
        }
        return position + 1 + "";
    }
    @NonNull
    public CharSequence getPage(int position){
        return position + 1 + "";
    }
    @Override
    public Fragment getItem(int i) {
        if( 0 == i){
            Fragment firstFragment = new FirstFragment();
            return firstFragment;
        }
        if(1 == i){
            Fragment secondFragment = new SecondFragment();
            return secondFragment;
        }
        if(2 == i){
            Fragment thirdFragment = new ThirFragment();
            return thirdFragment;
        }
        if(3 == i){
            Fragment forthFragment = new ForthFragment();
            return forthFragment;
        }
        return null;
    }
    @Override
    public int getCount() {
        return 4;
    }
}
