package com.example.haruskuat.mybooks;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private TabLayout tabLayout;
private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Harry Potter dan Batu Bertuah"));
        tabLayout.addTab(tabLayout.newTab().setText("Harry Potter dan Kamar Rahasia"));
        tabLayout.addTab(tabLayout.newTab().setText("Harry Potter dan Tawanan Azkaban"));
        tabLayout.addTab(tabLayout.newTab().setText("Harry Potter dan Piala Api"));
        tabLayout.addTab(tabLayout.newTab().setText("Harry Potter dan Orde Phoenix"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
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
