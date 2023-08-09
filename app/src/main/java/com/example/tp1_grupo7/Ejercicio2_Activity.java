package com.example.tp1_grupo7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ejercicio2_Activity extends AppCompatActivity {

    private Button off;
    private Button on;
    private TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        screen = findViewById(R.id.tvResultado);
    }

    public void On(View view){
        screen.setVisibility(View.VISIBLE);
        screen.setText("0");
    }

    public void Off(View view){
        screen.setVisibility(View.GONE);
    }
}