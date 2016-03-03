package com.linda.design_support_library_demo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by zhoulinda on 16/3/2.
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    private String[] titles;
    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        titles = context.getResources().getStringArray(R.array.tab_name);
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Fragment getItem(int position) {

        return ListFragment.getInstance(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
