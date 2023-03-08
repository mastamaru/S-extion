package com.app.sextion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class Profile extends AppCompatActivity {
    public String selectedPekerjaan = "Pelajar";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        //switch activity ke home
        RelativeLayout HomeLayout = findViewById(R.id.buttonHome);
        HomeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //switch activity ke konseling
        RelativeLayout konselingLayout = findViewById(R.id.buttonChat);
        konselingLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, Konseling.class);
                startActivity(intent);
            }
        });

        //load last saved variable pekerjaan
        SharedPreferences savedPekerjaan = getSharedPreferences("myPrefs", MODE_PRIVATE);
        String lastSelectedPekerjaan = savedPekerjaan.getString("selectedPekerjaan", "Pelajar");

        //dropdown pekerjaan
        Spinner dropdown = findViewById(R.id.pekerjaanDropdown);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.items, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);
        dropdown.setSelection(adapter.getPosition(lastSelectedPekerjaan), false);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedPekerjaan = parent.getItemAtPosition(position).toString();
                SharedPreferences savedPekerjaan = getSharedPreferences("myPrefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = savedPekerjaan.edit();
                editor.putString("selectedPekerjaan", selectedPekerjaan);
                editor.apply();
                Toast.makeText(Profile.this, selectedPekerjaan, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}