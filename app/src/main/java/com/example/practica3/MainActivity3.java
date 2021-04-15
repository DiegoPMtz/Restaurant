package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void btn_regresar(View v){
        Intent regresar = new Intent(this,MainActivity.class);
        startActivity(regresar);
    }

    public void btn_ver(View v){
        Intent ejemplos = new Intent(MainActivity3.this,MainActivity5.class);
        startActivity(ejemplos);
    }


}