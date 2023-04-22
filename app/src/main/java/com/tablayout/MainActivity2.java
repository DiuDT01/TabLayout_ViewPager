package com.tablayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tablayout.adapter.AdapterViewPager;

public class MainActivity2 extends AppCompatActivity {
    ViewPager vPager;
    BottomNavigationView bottom;
    FloatingActionButton fab;
    AdapterViewPager adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        vPager = findViewById(R.id.vPager);
        bottom = findViewById(R.id.bottom);
        fab = findViewById(R.id.fab);
        adapter = new AdapterViewPager(getSupportFragmentManager(),3);
        vPager.setAdapter(adapter);
        vPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch(position){
                    case 0:bottom.getMenu().findItem(R.id.mTravel).setChecked(true);
                        break;
                    case 1:bottom.getMenu().findItem(R.id.mMovie).setChecked(true);
                        break;
                    case 2:bottom.getMenu().findItem(R.id.mFood).setChecked(true);
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.mTravel:
                        vPager.setCurrentItem(0);
                        break;
                    case R.id.mMovie:
                        vPager.setCurrentItem(1);
                        break;
                    case R.id.mFood:
                        vPager.setCurrentItem(2);
                        break;
                }
                return false;
            }
        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ban chon toi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}