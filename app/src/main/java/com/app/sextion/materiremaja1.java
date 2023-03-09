package com.app.sextion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class materiremaja1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materiremaja1);

        //back to home
        ImageButton backToHomeButton = findViewById(R.id.backToHome);
        backToHomeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(materiremaja1.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //switch activity ke berita1
        LinearLayout berita_pk1 = findViewById(R.id.berita_pk1);
        berita_pk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(materiremaja1.this, beritaremaja1.class);
                startActivity(intent);
            }
        });

    }


}