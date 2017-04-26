package com.example.android.contesttestii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Choose semester", Toast.LENGTH_SHORT).show();

        Button sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8;

        sem1 = (Button) findViewById(R.id.sem1);
        sem2 = (Button) findViewById(R.id.sem2);
        sem3 = (Button) findViewById(R.id.sem3);
        sem4 = (Button) findViewById(R.id.sem4);
        sem5 = (Button) findViewById(R.id.sem5);
        sem6 = (Button) findViewById(R.id.sem6);
        sem7 = (Button) findViewById(R.id.sem7);
        sem8 = (Button) findViewById(R.id.sem8);

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, sem1Activity.class);
                startActivity(i);
            }
        });
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, sem2Activity.class);
                startActivity(i);
            }
        });
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, sem3Activity.class);
                startActivity(i);
            }
        });
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, sem4Activity.class);
                startActivity(i);
            }
        });
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, sem5Activity.class);
                startActivity(i);
            }
        });
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, sem6Activity.class);
                startActivity(i);
            }
        });
        sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, sem7Activity.class);
                startActivity(i);
            }
        });
        sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, sem8Activity.class);
                startActivity(i);
            }
        });
    }
}
