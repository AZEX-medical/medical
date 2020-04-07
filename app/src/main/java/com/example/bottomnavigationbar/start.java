package com.example.bottomnavigationbar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

import com.balysv.materialripple.MaterialRippleLayout;

public class start extends AppCompatActivity {
  //  MaterialRippleLayout reg,sign ;
  Button regi,sign ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        regi=findViewById(R.id.reg);
        sign=findViewById(R.id.sign);
        regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(start.this,register.class);
                startActivity(intent);
            }

        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(start.this,sign.class);
                startActivity(intent);
            }

        });





    }
}
