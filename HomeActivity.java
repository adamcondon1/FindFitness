package com.example.nci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    ImageButton Meal, Notes, Yoga, Map;
    Button Yt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Meal = findViewById(R.id.btnMeal);
        Notes = findViewById(R.id.btnNotes);
        Yoga = findViewById(R.id.btnYoga);
        Map = findViewById(R.id.btnMaps);
        Yt = findViewById(R.id.btnYt);

        Meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        Yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), yoga1Activity.class));

            }
        });

        Notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), workoutDiaryActivity.class));
            }
        });

        Yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main3Activity.class));
            }
        });



    }
}


