package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnNextPage);
        btn.setOnClickListener(view -> {//создание метода click для кнопки
            //Toast.makeText(MainActivity.this, "Welcome!", Toast.LENGTH_SHORT).show();//всплываюзее окно при нажатии
            Intent intent = new Intent(MainActivity.this, Window2.class);//переход на другое окно
            intent.putExtra("value", edt.getText().toString());//?!
            startActivity(intent);
        });

        btn = findViewById(R.id.btnNextPage);
        edt = findViewById(R.id.edtInfo);
    }
}