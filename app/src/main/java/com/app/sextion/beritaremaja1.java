package com.app.sextion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class beritaremaja1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beritaremaja1);

        //back to materi remaja1
        ImageButton back = findViewById(R.id.backToHome);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(beritaremaja1.this, materiremaja1.class);
                startActivity(intent);
                finish();
            }
        });
    }
}