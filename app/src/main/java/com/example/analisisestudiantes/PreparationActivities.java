package com.example.analisisestudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class PreparationActivities extends AppCompatActivity {

    private CheckBox c1;
    private CheckBox c2;
    private CheckBox c3;
    private Button secondcontinueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades_de_preparacion);

        c1 = (CheckBox) findViewById(R.id.checkBox1);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        secondcontinueButton = findViewById(R.id.continueButton2);

        secondcontinueButton.setOnClickListener((view) -> {
            Intent i = new Intent(this, Feedback.class);
            startActivityForResult(i,100);

        });

    }
}