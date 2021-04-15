package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btn_platillo(View v){
        Intent plato = new Intent(MainActivity.this,MainActivity2.class);
        plato.putExtra("plato",true);
        startActivity(plato);
    }

    public void btn_bebida(View v){
        Intent bebida = new Intent(MainActivity.this,MainActivity2.class);
        bebida.putExtra("bebida",true);
        startActivity(bebida);
    }

    public void btn_cancelar(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}