package com.example.yodgorbekkomilov.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(8);
    }


    public void displayPointA(View view){
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);

    }

    public void displayPointB(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    public void displayPointC(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }

    public void displayPointD(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }


    public void displayPointsA(View view){
        scoreTeamB = scoreTeamB + 6;
        displayForTeamA(scoreTeamA);

    }

    public void displayPointsB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    public void displayPointsC(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void displayPointsD(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }



    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

