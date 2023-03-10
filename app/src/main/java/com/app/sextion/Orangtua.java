package com.app.sextion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Orangtua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orangtua);


        // Mendapatkan instance dari SharedPreferences
        SharedPreferences savedPekerjaan = getSharedPreferences("myPrefs", MODE_PRIVATE);
        // Mendapatkan nilai savedPekerjaan dari SharedPreferences
        String lastSelectedPekerjaan = savedPekerjaan.getString("selectedPekerjaan", "");



        // Cek nilai savedPekerjaan
        if ("Pelajar".equals(lastSelectedPekerjaan)) {
            // Jika last selected Pekerjaan = "pelajar", buka Activity lain
            Intent intent = new Intent(Orangtua.this, MainActivity.class);
            startActivity(intent);
            finish(); // Selesai (tutup) MainActivity agar tidak bisa kembali ke sini
        } else {
            // Jika savedPekerjaan tidak sama dengan "Pelajar", tampilkan MainActivity biasa
            setContentView(R.layout.activity_orangtua);
            // Lakukan inisialisasi UI dan lain-lain di sini
        }


        //switch activity ke konseling
        RelativeLayout konselingLayout = findViewById(R.id.buttonChat);
        konselingLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Orangtua.this, Konseling.class);
                startActivity(intent);
            }
        });


        //switch activity ke profile
        RelativeLayout profileLayout = findViewById(R.id.buttonProfile);
        profileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Orangtua.this, Profile.class);
                startActivity(intent);
            }
        });

        //switch activity ke materi remaja
        LinearLayout materiOrtu1 = findViewById(R.id.materi_ortu1);
        materiOrtu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Orangtua.this, materiremaja1.class);
                startActivity(intent);
            }
        });
    }
}