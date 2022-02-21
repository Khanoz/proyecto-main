package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Set;

public class RecuperarContrasena extends AppCompatActivity {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Button confirmar;
    Button cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_contrasena);
        InitElements();
        confirmar = (Button) findViewById(R.id.RecPassConfirmarBtn);
        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RecoverPassword();
            }
        });
        cancelar = (Button) findViewById(R.id.RecPassCancelarBtn);
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cancelar();
            }
        });
    }
    private void InitElements(){
        preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        editor = preferences.edit();
    }
    private void RecoverPassword(){
        String email = ((TextView) findViewById(R.id.RecPassEmail)).getText().toString();
        Set<String> datos = preferences.getStringSet(email, null);
        if(datos == null)
            return;
        if(PasswordsMatch()){
            //String[] s = datos.toArray(new String[0]);
            /*s[2] = ((TextView) findViewById(R.id.RecPassNPass)).getText().toString();
            datos.clear();
            datos.addAll(Arrays.asList(s));*/
            datos.add(((TextView) findViewById(R.id.RecPassNPass)).getText().toString());
            Log.d("Recover Account:", "damn");
            editor.putStringSet(email, datos);
            editor.commit();
            this.finish();
        }
    }
    private boolean PasswordsMatch(){
        return ((TextView) findViewById(R.id.RecPassNPass)).getText().toString().equals(((TextView) findViewById(R.id.RecPassNPassConfirmed)).getText().toString());
    }
    private void Cancelar(){
        this.finish();
    }
}