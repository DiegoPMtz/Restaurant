package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    public void btn_regresar(View v){
        Intent regresar = new Intent(this,MainActivity.class);
        startActivity(regresar);
    }

    public void btn_ver(View v){
        Intent ejemplos = new Intent(MainActivity2.this,MainActivity4.class);
        startActivity(ejemplos);
    }


}