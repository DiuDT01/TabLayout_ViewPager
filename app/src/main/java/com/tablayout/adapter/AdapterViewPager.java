package com.tablayout.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.tablayout.fragment.FragmentFood;
import com.tablayout.fragment.FragmentMovie;
import com.tablayout.fragment.FragmentTravel;

public class AdapterViewPager extends FragmentPagerAdapter {
    private int numPage;
    public AdapterViewPager(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numPage=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new FragmentTravel();
            case 1:return new FragmentMovie();
            case 2:return new FragmentFood();
        }
        return null;
    }

    @Override
    public int getCount() {
        return numPage;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 : return "Travel";
            case 1 : return "Movie";
            case 2 : return "Food";
        }
        return null;
    }
}
