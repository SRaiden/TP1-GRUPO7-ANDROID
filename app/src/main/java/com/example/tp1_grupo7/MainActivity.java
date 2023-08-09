package com.example.tp1_grupo7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
    }

    public void Ejercicio1(View view)
    {
        startActivity(new Intent(MainActivity.this, Ejercicio1_Activity.class));
    }

    public void Ejercicio2(View view)
    {
        startActivity(new Intent(MainActivity.this, Ejercicio2_Activity.class));
    }
}