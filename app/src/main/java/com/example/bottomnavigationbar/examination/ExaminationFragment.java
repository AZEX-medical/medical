package com.example.bottomnavigationbar.examination;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.bottomnavigationbar.R;
import com.google.android.material.tabs.TabLayout;

public class ExaminationFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_examination, container, false);

        tabLayout = (TabLayout) view.findViewById(R.id.examination_tab);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new RaysFragment(), getString(R.string.examination_rays));
        adapter.addFragment(new AnalyzeFragment(), getString(R.string.examination_analyze));
        adapter.addFragment(new SpeculaFragment(), getString(R.string.examination_specula));

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        return view;
    }
}
