package com.example.bottomnavigationbar.Diseases;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class pagerAdapter extends FragmentStatePagerAdapter {
    private int num_tab;
    public pagerAdapter(@NonNull FragmentManager fm,int num_tab) {
        super(fm);
        this.num_tab=num_tab;
    }

    @NonNull
    @Override

    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new tab1();
            case 1:
                return new tab2();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return num_tab;
    }
}