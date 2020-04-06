package com.example.bottomnavigationbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chooseYourAcount extends AppCompatActivity {

    CardView doctor, patient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_your_acount);

        doctor = findViewById(R.id.cardDoctor);
        patient = findViewById(R.id.cardPatient);

        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(chooseYourAcount.this, start.class);
                startActivity(Intent);
                //finish();// عشان تختفي الصفحة
            }
        });

        patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(chooseYourAcount.this, start.class);
                startActivity(Intent);
                //finish();// عشان تختفي الصفحة
            }
        });
    }
}
