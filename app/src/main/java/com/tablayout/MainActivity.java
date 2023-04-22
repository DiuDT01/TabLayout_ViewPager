package com.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.tablayout.adapter.AdapterViewPager;
import com.tablayout.model.HorizontalFlipTransformation;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager vPager;
    AdapterViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab = findViewById(R.id.tab);
        vPager = findViewById(R.id.vPager);
        pager = new AdapterViewPager(getSupportFragmentManager(),3);
        vPager.setPageTransformer(true,new HorizontalFlipTransformation());
        vPager.setAdapter(pager);
        tab.setupWithViewPager(vPager);
        tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab t) {
                switch (t.getPosition()) {
                    case 0:
                        tab.setTabTextColors(Color.BLACK, getResources().getColor(R.color.colorBlue));
                        break;
                    case 1:
                        tab.setTabTextColors(Color.BLACK, getResources().getColor(R.color.colorGreen));
                        break;
                    case 2:
                        tab.setTabTextColors(Color.BLACK, getResources().getColor(R.color.colorPink));
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}