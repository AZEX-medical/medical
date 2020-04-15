package com.example.bottomnavigationbar.Drugs;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.bottomnavigationbar.R;
import com.example.bottomnavigationbar.examination.AnalyzeFragment;
import com.example.bottomnavigationbar.examination.RaysFragment;
import com.example.bottomnavigationbar.examination.SpeculaFragment;
import com.example.bottomnavigationbar.examination.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;


public class DrugFragment extends Fragment {
    TabLayout tabLayout;
    ViewPager viewPager;

    public DrugFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_drug,container,false);



        tabLayout = (TabLayout) view.findViewById(R.id.drug_tab);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new TemporaryDrugsFragment(), getString(R.string.Temporary_Drugs));
        adapter.addFragment(new ChoronicDrugFragment(), getString(R.string.Choronic_Drug));

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        return  view;
    }

}
