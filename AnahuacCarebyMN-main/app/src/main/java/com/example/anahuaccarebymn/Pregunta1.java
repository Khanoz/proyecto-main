package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Pregunta1 extends AppCompatActivity {

    RadioButton si;
    RadioButton no;
    Button boton;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);
        InitElements();
    }
    private void InitElements(){
        si = (RadioButton) findViewById(R.id.Preg1Si);
        no = (RadioButton) findViewById(R.id.Preg1No);
        boton = (Button) findViewById(R.id.Preg1SigBtn);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(si.isChecked() || no.isChecked()){
                    contador += si.isChecked() ? 1 : 0;
                    IrActivity(Pregunta2.class);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Seleccione una respuesta", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
    }
    private void IrActivity(Class<?> activity){
        Intent intent = new Intent(this, activity);
        intent.putExtra("contador", contador);
        startActivity(intent);
    }
}