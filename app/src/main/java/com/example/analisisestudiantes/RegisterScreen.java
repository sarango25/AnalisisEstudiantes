package com.example.analisisestudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterScreen extends AppCompatActivity {

    private EditText nameEt;
    private EditText codeEt;
    private Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nameEt = findViewById(R.id.Name);
        codeEt = findViewById(R.id.Code);
        continueButton = findViewById(R.id.continueButton);

        continueButton.setOnClickListener((view) -> {
            Intent i = new Intent(this, PreparationActivities.class);
            startActivityForResult(i,100);

            String name = nameEt.getText().toString();
            String code = codeEt.getText().toString();

            Intent data = new Intent();
            data.putExtra("name", name);
            data.putExtra("code", code);

            setResult(RESULT_OK, data);
            finish();
        });


    }
}