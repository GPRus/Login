package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Window2 extends AppCompatActivity {

    Button btn1;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window2);
        btn1= findViewById(R.id.btnClickBack);
        btn1.setOnClickListener(view -> finish());
        txt = findViewById(R.id.textView);
        Bundle argument = getIntent().getExtras();//!?
        txt.setText(argument.get("value").toString());

    }
}