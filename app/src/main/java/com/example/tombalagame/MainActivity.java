package com.example.tombalagame;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText sayi1,sayi2,sayi3,sayi4,sayi5,sayi6,sayi7,
            sayi8,sayi9,sayi10,sayi11,sayi12;

    private Button oyna_btn;
    private ArrayList<String> sayilarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayilarim = new ArrayList<>();

        sayi1 = findViewById(R.id.sayi1);
        sayi2 = findViewById(R.id.sayi2);
        sayi3 = findViewById(R.id.sayi3);
        sayi4 = findViewById(R.id.sayi4);
        sayi5 = findViewById(R.id.sayi5);
        sayi6 = findViewById(R.id.sayi6);
        sayi7 = findViewById(R.id.sayi7);
        sayi8 = findViewById(R.id.sayi8);
        sayi9 = findViewById(R.id.sayi9);
        sayi10 = findViewById(R.id.sayi10);
        sayi11 = findViewById(R.id.sayi11);
        sayi12 = findViewById(R.id.sayi12);


        oyna_btn = findViewById(R.id.oyna_btn);





        oyna_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sayilarim.add(sayi1.getText().toString());
                sayilarim.add(sayi2.getText().toString());
                sayilarim.add(sayi3.getText().toString());
                sayilarim.add(sayi4.getText().toString());
                sayilarim.add(sayi5.getText().toString());
                sayilarim.add(sayi6.getText().toString());
                sayilarim.add(sayi7.getText().toString());
                sayilarim.add(sayi8.getText().toString());
                sayilarim.add(sayi9.getText().toString());
                sayilarim.add(sayi10.getText().toString());
                sayilarim.add(sayi11.getText().toString());
                sayilarim.add(sayi12.getText().toString());


                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putStringArrayListExtra("sayilarim",sayilarim);
                startActivity(i);
            }
        });

    }
}