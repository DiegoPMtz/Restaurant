package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        img1 = findViewById(R.id.imagen1);
        img2 = findViewById(R.id.imagen2);
        img3 = findViewById(R.id.imagen3);
        img4 = findViewById(R.id.imagen4);

        if (getIntent().hasExtra("platillo")){
            img1.setImageResource(R.drawable.comida1);
            img2.setImageResource(R.drawable.comida2);
            img3.setImageResource(R.drawable.comida3);
            img4.setImageResource(R.drawable.comida4);

        }
    }

    public void btn_regresar(View v){
        finish();
    }


}