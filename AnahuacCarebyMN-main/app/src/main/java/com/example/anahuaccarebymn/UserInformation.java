package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

public class UserInformation extends AppCompatActivity {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    private Button ContinuarButton;
    private Button CancelarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);
        InitElements();
        ContinuarButton = (Button) findViewById(R.id.RegistrarContinuarBtn);
        ContinuarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(PasswordsMatch())
                    Registrar();
            }
        });
        CancelarButton = (Button) findViewById(R.id.RegistrarCancelarBtn);
        CancelarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegresarAMain();
            }
        });
    }
    public void InitElements(){
        preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        editor = preferences.edit();
    }
    private boolean PasswordsMatch(){
        return ((TextView) findViewById(R.id.Password)).getText().toString().equals(((TextView) findViewById(R.id.CPassword)).getText().toString());
    }
    private void Registrar(){
        Set<String> setEP = new HashSet<String>();
        String email = ((TextView) findViewById(R.id.Email)).getText().toString();
        setEP.add(((TextView) findViewById(R.id.Email)).getText().toString());
        setEP.add(((TextView) findViewById(R.id.Password)).getText().toString());
        setEP.add(((TextView) findViewById(R.id.Nombre)).getText().toString());
        setEP.add(((TextView) findViewById(R.id.ApellidoP)).getText().toString());
        setEP.add(((TextView) findViewById(R.id.ApellidoM)).getText().toString());
        editor.putStringSet(email, setEP) ;
        editor.commit();
        RegresarAMain();
    }
    private void RegresarAMain(){
        this.finish();
    }
}