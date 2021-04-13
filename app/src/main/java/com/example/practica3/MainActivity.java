package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_platillo(View v){
        Intent plato = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(plato);
    }

    public void btn_bebida(View v){
        Intent bebida = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(bebida);
    }

    public void btn_cancelar(View v){
        finish();
    }
}