package com.example.scorekeeper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView pointsA, pointsB;
    private Button add3A, add2A, add1A, add3B, add2B, add1B;
    private Button resetPoint;
    private int teamAScore = 0;
    private int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pointsA = findViewById(R.id.PointA);
        pointsB = findViewById(R.id.PointB);

        add1A = findViewById(R.id.button1A);
        add2A = findViewById(R.id.button2A);
        add3A = findViewById(R.id.button3A);

        add1B = findViewById(R.id.button1B);
        add2B = findViewById(R.id.button2B);
        add3B = findViewById(R.id.button3B);

        resetPoint = findViewById(R.id.resetpoint);

        add3A.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                teamAScore+=3;
                DisplayForTeamA(teamAScore);
            }
        });
        add2A.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                teamAScore+=2;
                DisplayForTeamA(teamAScore);
            }
        });
        add1A.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                teamAScore+=1;
                DisplayForTeamA(teamAScore);
            }
        });
        add3B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                teamBScore+=3;
                DisplayForTeamB(teamBScore);
            }
        });
        add2B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                teamBScore+=2;
                DisplayForTeamB(teamBScore);
            }
        });
        add2B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                teamBScore+=1;
                DisplayForTeamB(teamBScore);
            }
        });
        resetPoint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                teamBScore=0;
                teamAScore=0;
                DisplayForTeamB(teamBScore);
                DisplayForTeamA(teamAScore);
            }
        });
    }

    private void DisplayForTeamB(int score) {
        pointsB.setText(""+score);
    }

    private void DisplayForTeamA(int score) {
        pointsA.setText(""+score);
    }
}