package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Pregunta3 extends AppCompatActivity {

    CheckBox ninguno;
    CheckBox sintoma11;
    CheckBox sintoma12;
    CheckBox sintoma13;
    CheckBox sintoma14;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
        Intent intent = getIntent();
        contador = intent.getIntExtra("contador", 0);
        ninguno = (CheckBox) findViewById(R.id.Preg3Ninguno);
        sintoma11 = (CheckBox) findViewById(R.id.sintoma11);
        sintoma12 = (CheckBox) findViewById(R.id.sintoma12);
        sintoma13 = (CheckBox) findViewById(R.id.sintoma13);
        sintoma14 = (CheckBox) findViewById(R.id.sintoma14);
        //boton = (Button) findViewById(R.id.Preg1SigBtn);

        /*
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                contador+=(ninguno.isChecked() ? 0 : 0) +
                        (sintoma11.isChecked() ? 2 : 0) +
                        (sintoma12.isChecked() ? 2 : 0) +
                        (sintoma13.isChecked() ? 1 : 0) +
                        (sintoma14.isChecked() ? 2 : 0) +
                        (sintoma15.isChecked() ? 2 : 0);
                IrActivity(pregunta4.class);
            }
        });*/
    }

    /*private void IrActivity(Class<?> activity){
        Intent intent = new Intent(this, activity);
        intent.putExtra("contador", contador);
        startActivity(intent);
    }*/

    public void siguiente(View view)
    {
        Intent intent = new Intent(this, pregunta4.class);
        contador+=(ninguno.isChecked() ? 0 : 0) +
                (sintoma11.isChecked() ? 1 : 0) +
                (sintoma12.isChecked() ? 1 : 0) +
                (sintoma13.isChecked() ? 1 : 0) +
                (sintoma14.isChecked() ? 1 : 0);
        intent.putExtra("contador", contador);
        startActivity(intent);
    }

    public void anterior(View view)
    {
        Intent intent = new Intent(this, Pregunta2.class);
        intent.putExtra("contador", contador);
        startActivity(intent);
    }

}