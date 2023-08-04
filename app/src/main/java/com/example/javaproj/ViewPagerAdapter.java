package com.example.javaproj;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private static final int NUM_TABS = 3; // Number of tabs

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PhotosFragment();
            case 1:
                return new PhotosFragment();
//                return new VideosFragment();
            case 2:
                return new PhotosFragment();
//                return new OtherFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Photos";
            case 1:
                return "Videos";
            case 2:
                return "Other";
            default:
                return null;
        }
    }
}
