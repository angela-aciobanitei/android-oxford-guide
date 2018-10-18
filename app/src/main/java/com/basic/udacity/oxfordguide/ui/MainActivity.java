package com.basic.udacity.oxfordguide.ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.basic.udacity.oxfordguide.R;
import com.basic.udacity.oxfordguide.adapters.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ViewPager is a layout manager that allows the user to flip left and right
        // through pages of data. You must supply an implementation of a PagerAdapter
        // to generate the pages that the view shows.
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        // Hook up the custom PagerAdapter to the ViewPager
        viewPager.setAdapter(new ViewPagerAdapter(this, getSupportFragmentManager()));

        // Hook up the TabLayout to the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
