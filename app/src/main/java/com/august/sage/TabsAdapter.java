package com.august.sage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabsAdapter extends FragmentStatePagerAdapter {
    int NoTabs;
    public TabsAdapter(FragmentManager fm, int Tabs){
        super(fm);
        this.NoTabs = Tabs;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return "";
    }
    @Override
    public int getCount(){
        return NoTabs;
    }
    @Override
    public Fragment getItem(int pos){
        switch(pos){
            case 0:
                home_fragment home = new home_fragment();
                return home;
            case 1:
                primary_fragment primary = new primary_fragment();
                return primary;
            case 2:
                secondary_fragment secondary = new secondary_fragment();
                return secondary;
            default:
                return null;
        }
    }

}
