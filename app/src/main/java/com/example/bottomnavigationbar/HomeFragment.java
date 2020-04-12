package com.example.bottomnavigationbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.bottomnavigationbar.examination.ExaminationFragment;

public class HomeFragment extends Fragment {
    CardView card_file ,card_disease,card_examin,card_sur,card_drug;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home,container,false);
        card_file = (CardView) view.findViewById(R.id.crd_file);
        card_disease = (CardView) view.findViewById(R.id.crd_disease);
        card_examin = (CardView) view.findViewById(R.id.crd_examine);
        card_sur = (CardView) view.findViewById(R.id.crd_surg);
        card_drug = (CardView) view.findViewById(R.id.crd_drug);
        //                getSupportFragmentManager().beginTransaction().replace(R.layout.fragment_home,
//                        new FileFragment()).commit();

        card_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.fragment_container, new FileFragment());
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });
        card_disease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.fragment_container, new DiseaseFragment());
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });
        card_examin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.fragment_container, new ExaminationFragment());
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });
        card_sur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.fragment_container, new SurgeryFragment());
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });
        card_drug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.fragment_container, new DrugFragment());
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });


        return view;



    }
}
