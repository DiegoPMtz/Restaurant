package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    ImageView imagen;
    TextView descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        imagen = findViewById(R.id.alimento);
        descripcion = findViewById(R.id.descripcion_alimento);

        if (getIntent().hasExtra("comida4")){
            imagen.setImageResource(R.drawable.comida1);
            descripcion.setText("Esto es comida, no bebida");
        }
        if (getIntent().hasExtra("bebida4")){
            imagen.setImageResource(R.drawable.foto1);
            descripcion.setText("Esto es bebida, no comida");
        }
    }
}