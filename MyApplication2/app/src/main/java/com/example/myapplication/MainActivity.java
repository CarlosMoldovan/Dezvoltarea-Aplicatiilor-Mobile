package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toastButton = findViewById(R.id.button);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Butonul Toast a fost apăsat", Toast.LENGTH_SHORT).show();
            }
        });

        Button countButton = findViewById(R.id.buttonBottom);
        TextView countTextView = findViewById(R.id.textView2);

        final int[] count = {0};

        countTextView.setText(String.valueOf(count[0]));

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count[0]++;
                countTextView.setText(String.valueOf(count[0]));
            }
        });

    }
}