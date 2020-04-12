package com.example.bottomnavigationbar.examination;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavigationbar.R;

import java.util.ArrayList;

public class SpeculaFragment extends Fragment {

    View view;
    RecyclerView recyclerView;

    public SpeculaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_specula, container, false);

        recyclerView = view.findViewById(R.id.specula_recycle);

        ArrayList<Content> contents = new ArrayList<>();

        RecyclerAdapter adapter = new RecyclerAdapter(contents);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(getContext());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
