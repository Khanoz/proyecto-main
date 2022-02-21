package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class pregunta4 extends AppCompatActivity {
    CheckBox ninguno;
    CheckBox sintoma15;
    CheckBox sintoma16;
    CheckBox sintoma17;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta4);
        Intent intent = getIntent();
        contador = intent.getIntExtra("contador", 0);
        ninguno = (CheckBox) findViewById(R.id.Preg4Ninguno);
        sintoma15 = (CheckBox) findViewById(R.id.sintoma11);
        sintoma16 = (CheckBox) findViewById(R.id.sintoma12);
        sintoma17 = (CheckBox) findViewById(R.id.sintoma13);

    }

    public void siguiente(View view)
    {
        Intent intent = new Intent(this, Pregunta5.class);
        contador+=(ninguno.isChecked() ? 0 : 0) +
                (sintoma15.isChecked() ? 1 : 0) +
                (sintoma16.isChecked() ? 1 : 0) +
                (sintoma17.isChecked() ? 1 : 0);
        intent.putExtra("contador", contador);
        startActivity(intent);
    }
    public void anterior(View view)
    {
        Intent intent = new Intent(this, Pregunta3.class);
        intent.putExtra("contador", contador);
        startActivity(intent);
    }

}