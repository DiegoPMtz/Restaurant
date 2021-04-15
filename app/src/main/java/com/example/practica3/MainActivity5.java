package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    ImageView imagen;
    TextView descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        imagen = findViewById(R.id.alimento);
        descripcion = findViewById(R.id.descripcion_alimento);

        if (getIntent().hasExtra("comida2")){
            imagen.setImageResource(R.drawable.comida1);
            descripcion.setText("Esto es comida, no bebida");
        }
        if (getIntent().hasExtra("bebida2")){
            imagen.setImageResource(R.drawable.foto1);
            descripcion.setText("Esto es bebida, no comida");
        }


    }
}