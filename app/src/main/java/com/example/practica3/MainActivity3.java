package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;

    Boolean platillo;
    Boolean bebida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        platillo = getIntent().getBooleanExtra("platillo",true);
        bebida = getIntent().getBooleanExtra("bebidas",true);

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
        Intent regresar = new Intent(this,MainActivity.class);
        startActivity(regresar);
    }

    public void btn_alimento1(View v){
        Intent ejemplo = new Intent(this,MainActivity4.class);
        if (platillo){
            ejemplo.putExtra("comida1",true);
        }
        if (bebida){
            ejemplo.putExtra("bebida1",true);
        }
        startActivity(ejemplo);
    }


}