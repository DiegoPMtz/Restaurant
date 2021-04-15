package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }

    public void btn_regresar(View v){
        Intent regresar = new Intent(this,MainActivity2.class);
        startActivity(regresar);
    }

    public void btn_comida1(View v){
        Intent comida1 = new Intent(this,MainActivity6.class);
        startActivity(comida1);
    }

    public void btn_comida2(View v){
        Intent comida2 = new Intent(this,MainActivity7.class);
        startActivity(comida2);
    }

    public void btn_comida3(View v){
        Intent comida3 = new Intent(this,MainActivity8.class);
        startActivity(comida3);
    }

    public void btn_comida4(View v){
        Intent comida4 = new Intent(this,MainActivity9.class);
        startActivity(comida4);
    }
}