package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView descripcion;
    TextView titulo;

    boolean platillo;
    boolean bebida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        descripcion = findViewById(R.id.descripcion);
        titulo = findViewById(R.id.titulo);

        if (getIntent().hasExtra("plato")){
            platillo =  getIntent().getBooleanExtra("plato",true);
              titulo.setText("platillos");
              descripcion.setText("Contamos con una extensa variedad de platillos altamente mexicanos destinados a satisfacer todo tu paladar gastronomico");



        }else if (getIntent().hasExtra("bebida")){
            bebida =  getIntent().getBooleanExtra("bebida",true);
            titulo.setText("bebidas");
            descripcion.setText("Ofrecemos las mejores bebidas refrescantes para cualquier tipo de persona y en cualquier clima");
        }
    }


    public void btn_regresar(View v){
        Intent regresar = new Intent(this,MainActivity.class);
        startActivity(regresar);
    }

    public void btn_ver(View v){
        Intent ejemplos = new Intent(MainActivity2.this,MainActivity3.class);
        if (platillo){
            ejemplos.putExtra("platillo",true);
        }else if(bebida) {
            ejemplos.putExtra("bebidas",true);
        }
        startActivity(ejemplos);
    }


}