package com.farukcankaya.rtlviewpagerindicatorsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.farukcankaya.rtlviewpager.RtlViewPager;
import com.farukcankaya.rtlviewpagerindicator.CircleIndicator;

public class CircleIndicatorActivity extends AppCompatActivity {

    private RtlViewPager rtlViewPager;
    private CircleIndicator rtlCircleIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_indicator);
        rtlViewPager = (RtlViewPager) findViewById(R.id.rtl_view_pager);
        rtlCircleIndicator = (CircleIndicator) findViewById(R.id.rtl_view_pager_indicator);

        rtlViewPager.setAdapter(new ColorPagerAdapter());
        rtlCircleIndicator.setViewPager(rtlViewPager);
    }
}