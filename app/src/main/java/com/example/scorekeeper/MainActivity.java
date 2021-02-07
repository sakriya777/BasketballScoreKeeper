package com.example.scorekeeper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView PointsA, PointsB;
    private Button Add3A, Add2A, Add1A, Add3B, Add2B, Add1B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PointsA = findViewById(R.id.PointA);
        PointsB = findViewById(R.id.PointB);

        Add1A = findViewById(R.id.button1A);
        Add2A = findViewById(R.id.button2A);
        Add3A = findViewById(R.id.button3A);

        Add1B = findViewById(R.id.button1B);
        Add2B = findViewById(R.id.button2B);
        Add3B = findViewById(R.id.button3B);


//        button3.setOnClickListner(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Toast.makeText(MainActivity.this, "Button CLicked", Toast.LENGTH_LONG.show());
//            }
//        });
    }
}