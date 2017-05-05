/*
 * Copyright (c) 2017.  Faruk Cankaya
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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