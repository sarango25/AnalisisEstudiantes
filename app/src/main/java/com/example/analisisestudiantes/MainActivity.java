package com.example.analisisestudiantes;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView listTxt;
    private Button register;
    private String list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listTxt = findViewById(R.id.StudentsList);
        register = findViewById(R.id.RegisterButton);
        list = "";

        register.setOnClickListener((view) -> {
        Intent i = new Intent(this, RegisterScreen.class);
        startActivityForResult(i,100);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==100){
            String name = data.getStringExtra("name");
            String code = data.getStringExtra("code");

            list += name + "->" + code + "\n";
            listTxt.setText(list);
        }
    }
}