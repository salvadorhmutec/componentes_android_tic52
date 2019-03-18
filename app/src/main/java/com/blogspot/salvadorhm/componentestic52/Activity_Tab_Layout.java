package com.blogspot.salvadorhm.componentestic52;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_Tab_Layout extends AppCompatActivity {

    private TabLayout tabLayout;
    private int[]tabIcons={R.drawable.ic_account_circle_black_48dp,R.drawable.ic_group_black_48dp,R.drawable.ic_photo_black_48dp,R.drawable.ic_public_black_48dp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__tab__layout);
        ViewPager viewPager=(ViewPager)findViewById(R.id.viewPager);
        loadViewPager(viewPager);
        tabLayout=(TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabIcons();
        iconColor(tabLayout.getTabAt(tabLayout.getSelectedTabPosition()),"#3b5998");
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                iconColor(tab,"#3b5998");
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                iconColor(tab,"#E0E0E0");
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void iconColor(TabLayout.Tab tab, String color){
        tab.getIcon().setColorFilter(Color.parseColor(color), PorterDuff.Mode.SRC_IN);

    }

    private void loadViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(newInstance("Home"));
        adapter.addFragment(newInstance("Friends"));
        adapter.addFragment(newInstance("Images"));
        adapter.addFragment(newInstance("Notifications"));
        viewPager.setAdapter(adapter);
    }
    private void tabIcons(){
        for (int i=0;i<4;i++){
            tabLayout.getTabAt(i).setIcon(tabIcons[i]);
        }
    }

    private OneFragment newInstance(String title){
        Bundle bundle = new Bundle();
        bundle.putString("title", title);

        OneFragment fragment = new OneFragment();
        fragment.setArguments(bundle);

        return fragment;

    }
    
}
