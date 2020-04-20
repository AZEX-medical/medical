package com.example.bottomnavigationbar.examination;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavigationbar.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class SpeculaFragment extends Fragment {

    View view;
    RecyclerView recyclerView;
    FloatingActionButton add_specula;

    public SpeculaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_specula, container, false);

        recyclerView = view.findViewById(R.id.specula_recycle);

        ArrayList<ExamContent> contents = new ArrayList<>();

        RecyclerAdapter adapter = new RecyclerAdapter(contents);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(getContext());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);

        add_specula = view.findViewById(R.id.add_specula);
        add_specula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.fragment_container, new AddAnalyzeFragment());
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        return view;
    }
}
