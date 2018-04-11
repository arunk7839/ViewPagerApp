package com.example.lenovo.viewpagerapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.lenovo.viewpagerapp.fragment.FragmentOne;
import com.example.lenovo.viewpagerapp.fragment.FragmentThree;
import com.example.lenovo.viewpagerapp.fragment.FragmentTwo;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {


        switch (position) {
            case 0:

                return new FragmentOne();
            case 1:

                return new FragmentTwo();
            case 2:

                return new FragmentThree();

        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
