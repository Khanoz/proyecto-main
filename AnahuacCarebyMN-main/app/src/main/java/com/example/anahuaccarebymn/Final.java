package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import java.util.Calendar;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class Final extends AppCompatActivity {
    private TextView dateTimeDisplay;
    private Date date;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        dateTimeDisplay = (TextView)findViewById(R.id.FinalFechaTV);
        date = Calendar.getInstance().getTime();
        dateTimeDisplay.setText(date.toString());
        Intent intent = getIntent();
        contador = intent.getIntExtra("contador", 0);
        Log.d("Final", String.valueOf(contador));
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(Color.YELLOW);
        if(contador>10){
            view.setBackgroundColor(Color.RED);
        }
        else if(contador>5){
            view.setBackgroundColor(Color.YELLOW);
        }
        else{

            view.setBackgroundColor(Color.GREEN);
        }
    }
}