package com.example.bottomnavigationbar.Drugs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.EditText;

import com.example.bottomnavigationbar.R;


public class ChoronicDrugFragment extends Fragment {
    CalendarView calender;
    EditText txt;
    public ChoronicDrugFragment() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_choronic_drug, container, false);

        txt = view.findViewById(R.id.txt_calender);
        calender=view.findViewById(R.id.calender);

        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                String date = year+"/"+month+"/"+dayOfMonth;
                txt.setText(date);
            }
        });


        return view;
    }

}
