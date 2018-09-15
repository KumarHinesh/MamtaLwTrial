package mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.dashboardFragment.Crf4And5aTaskFragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.dashboardFragment.Crf5bTaskFragmnet;


public class PageAdapter extends FragmentStatePagerAdapter {

    int noOfTab;

    public PageAdapter(FragmentManager fm, int noOfTab) {
        super(fm);
        this.noOfTab = noOfTab;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position){

            case 0:
                fragment = new Crf4And5aTaskFragment();
                break;

            case 1:
                fragment = new Crf5bTaskFragmnet();
                break;

        }

        return fragment;
    }


    @Override
    public int getCount() {
        return noOfTab;
    }
}
