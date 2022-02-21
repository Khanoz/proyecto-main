package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Cuestionario extends AppCompatActivity {

    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);
        boton = (Button) findViewById(R.id.CuestionarioBtn);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IrActivity(Pregunta0.class);
            }
        });
    }
    private void IrActivity(Class<?> activity){
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}