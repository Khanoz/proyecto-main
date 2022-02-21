package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Pregunta5 extends AppCompatActivity {
    RadioButton si;
    RadioButton no;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta5);
        Intent intent = getIntent();
        contador = intent.getIntExtra("contador", 0);
        si = (RadioButton) findViewById(R.id.Preg5Si);
        no = (RadioButton) findViewById(R.id.Preg5No);
    }


    public void siguiente(View view) {
        Intent intent = new Intent(this, Final.class);
        contador += (si.isChecked() ? 1 : 0);
        intent.putExtra("contador", contador);
        startActivity(intent);
    }

    public void anterior(View view) {
        Intent intent = new Intent(this, pregunta4.class);
        intent.putExtra("contador", contador);
        startActivity(intent);
    }
}