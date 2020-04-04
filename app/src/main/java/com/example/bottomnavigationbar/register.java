package com.example.bottomnavigationbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = findViewById(R.id.toolbar);
    }
}
