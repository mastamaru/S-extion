package com.app.sextion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Konseling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konseling);

        //switch activity navbar
        RelativeLayout HomeLayout = findViewById(R.id.buttonHome);
        HomeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Konseling.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}