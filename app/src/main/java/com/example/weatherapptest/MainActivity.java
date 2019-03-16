package com.example.weatherapptest;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.weatherapptest.Adapters.ViewPagerAdapter;
import com.example.weatherapptest.Fragments.FragmentFiveDays;
import com.example.weatherapptest.Fragments.TodayFragment;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewPager_id);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new TodayFragment(),"Today");
        viewPagerAdapter.addFragment(new FragmentFiveDays(),"Five Days");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }

}
