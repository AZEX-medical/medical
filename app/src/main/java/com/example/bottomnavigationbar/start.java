package com.example.bottomnavigationbar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;

import com.balysv.materialripple.MaterialRippleLayout;

public class start extends AppCompatActivity {
    MaterialRippleLayout reg,sign ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        reg=findViewById(R.id.btn1);
        sign=findViewById(R.id.btn2);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(),register.class);
                startActivity(intent);
            }

        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(),sign.class);
                startActivity(intent);
            }

        });





    }
}
