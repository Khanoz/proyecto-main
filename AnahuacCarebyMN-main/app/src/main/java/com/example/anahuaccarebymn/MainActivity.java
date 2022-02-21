package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Button entrar;
    Button cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitElements();
        entrar = (Button) findViewById(R.id.MainLoginButton);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IrActivity(LoginIn_Activity.class);
            }
        });
        cancelar = (Button) findViewById(R.id.MainRegisterButton);
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IrActivity(UserInformation.class);
            }
        });
    }

    private void InitElements(){
        preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    private void IrActivity(Class<?> activity){
        Intent siguiente = new Intent(this, activity);
        startActivity(siguiente);
    }
}