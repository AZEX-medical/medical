package com.example.bottomnavigationbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class SurgeryFragment extends Fragment{

    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_surgery,container,false);

        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        recyclerView = view.findViewById(R.id.recycler);

        ArrayList<sheetSurgery> sheetSurgeries = new ArrayList<>();
        sheetSurgeries.add(new sheetSurgery
                ("date 1", "Mohammed", "باطنة"));
        sheetSurgeries.add(new sheetSurgery
                ("date 2", "Emam", "جراحة"));
        sheetSurgeries.add(new sheetSurgery
                ("date 3", "Eman", "باطنة"));
        sheetSurgeries.add(new sheetSurgery
                ("date 4", "Hamza", "جراحة"));
        RecyclerViewAdapterSurgery adapterSurgery = new RecyclerViewAdapterSurgery(sheetSurgeries);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapterSurgery);


        return  view;


    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
//        inflater.inflate(R.id.menu, menu);
//        return true;
    }
}
