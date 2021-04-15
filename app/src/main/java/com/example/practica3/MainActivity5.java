package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

    }

    public void btn_regresar(View v){
        Intent regresar = new Intent(this,MainActivity3.class);
        startActivity(regresar);
    }

    public void btn_bebida1(View v){
        Intent bebida1 = new Intent(this,MainActivity10.class);
        startActivity(bebida1);
    }

    public void btn_bebida2(View v){
        Intent bebida2 = new Intent(this,MainActivity11.class);
        startActivity(bebida2);
    }

    public void btn_bebida3(View v){
        Intent bebida3 = new Intent(this,MainActivity12.class);
        startActivity(bebida3);
    }

    public void btn_bebida4(View v){
        Intent bebida4 = new Intent(this,MainActivity13.class);
        startActivity(bebida4);
    }
}