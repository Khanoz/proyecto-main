package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Pregunta2 extends AppCompatActivity {

    CheckBox ninguno;
    CheckBox temp37;
    CheckBox dolorMuscular;
    CheckBox dolorCabeza;
    CheckBox tos;
    CheckBox dolorGarganta;
    CheckBox escNasal;
    CheckBox ojosRojos;
    CheckBox comezon;
    CheckBox ardor;
    CheckBox dolorOjos;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2);
        Intent intent = getIntent();
        contador = intent.getIntExtra("contador", 0);
        ninguno = (CheckBox) findViewById(R.id.Preg2Ninguno);
        temp37 = (CheckBox) findViewById(R.id.sintoma11);
        dolorMuscular = (CheckBox) findViewById(R.id.sintoma12);
        dolorCabeza = (CheckBox) findViewById(R.id.sintoma13);
        tos = (CheckBox) findViewById(R.id.sintoma14);
        dolorGarganta = (CheckBox) findViewById(R.id.Preg2DolorGarg);
        escNasal = (CheckBox) findViewById(R.id.Preg2EscNasal);
        ojosRojos = (CheckBox) findViewById(R.id.Preg2OjosRojos);
        comezon = (CheckBox) findViewById(R.id.Preg2Comezon);
        ardor = (CheckBox) findViewById(R.id.Preg2Ardor);
        dolorOjos = (CheckBox) findViewById(R.id.Preg2DolorOjos);
        /*
        boton = (Button) findViewById(R.id.Preg1SigBtn);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                contador+=(ninguno.isChecked() ? 0 : 0) +
                        (temp37.isChecked() ? 2 : 0) +
                        (dolorMuscular.isChecked() ? 2 : 0) +
                        (dolorCabeza.isChecked() ? 1 : 0) +
                        (tos.isChecked() ? 2 : 0) +
                        (dolorGarganta.isChecked() ? 2 : 0) +
                        (escNasal.isChecked() ? 2 : 0) +
                        (ojosRojos.isChecked() ? 1 : 0) +
                        (comezon.isChecked() ? 1 : 0) +
                        (ardor.isChecked() ? 1 : 0) +
                        (dolorOjos.isChecked() ? 1 : 0);
                IrActivity(Pregunta3.class);
            }
        });*/
    }

    /*
   private void IrActivity(Class<?> activity){
        Intent intent = new Intent(this, activity);
        intent.putExtra("contador", contador);
        startActivity(intent);
    }*/

    public void siguiente(View view)
    {
        Intent intent = new Intent(this, Pregunta3.class);
        contador+=
            (temp37.isChecked() ? 1 : 0) +
            (dolorMuscular.isChecked() ? 1 : 0) +
            (dolorCabeza.isChecked() ? 1 : 0) +
            (tos.isChecked() ? 1 : 0) +
            (dolorGarganta.isChecked() ? 1 : 0) +
            (escNasal.isChecked() ? 1 : 0) +
            (ojosRojos.isChecked() ? 1 : 0) +
            (comezon.isChecked() ? 1 : 0) +
            (ardor.isChecked() ? 1 : 0) +
            (dolorOjos.isChecked() ? 1 : 0);
        intent.putExtra("contador", contador);
        startActivity(intent);
    }

    public void anterior(View view)
    {
        Intent intent = new Intent(this, Pregunta1.class);
        intent.putExtra("contador", contador);
        startActivity(intent);
    }


}