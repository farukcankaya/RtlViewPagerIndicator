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

import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by farukcankaya on 02/05/2017.
 */

public class ColorPagerAdapter extends PagerAdapter {
    // length of colors and titles should be same.
    private int[] colors = {Color.parseColor("#96CEB4"), Color.parseColor("#FFEEAD"),
            Color.parseColor("#FF6F69"), Color.parseColor("#FFCC5C"), Color.parseColor("#DDDDDD")};
    private String[] titles = {"lemon", "grape", "apricot", "pomegranate", "kiwi"};

    public ColorPagerAdapter() {

    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.item_color_pager,
                container, false);
        TextView numberTextView = (TextView) view.findViewById(R.id.number);
        TextView titleTextView = (TextView) view.findViewById(R.id.title);

        view.setBackgroundColor(colors[position]);
        numberTextView.setText(String.valueOf(position));
        titleTextView.setText(titles[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return colors.length;
    }
}