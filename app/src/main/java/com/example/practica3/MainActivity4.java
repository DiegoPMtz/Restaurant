package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }


    public void btn_regresar(View v){
        finish();
    }

    public void btn_ver(View v){
        Intent ejemplos = new Intent(MainActivity4.this,MainActivity3.class);
        startActivity(ejemplos);
    }
}