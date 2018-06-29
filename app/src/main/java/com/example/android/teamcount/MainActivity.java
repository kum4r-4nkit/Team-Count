package com.example.android.teamcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    public void addOneA (View v){
        scoreTeamA = scoreTeamA + 1;
        displayForA(scoreTeamA);
    }

    public void addTwoA (View v){
        scoreTeamA = scoreTeamA + 2;
        displayForA(scoreTeamA);
    }

    public void addThreeA (View v){
        scoreTeamA = scoreTeamA + 3;
        displayForA(scoreTeamA);
    }

    public void addOneB (View v){
        scoreTeamB = scoreTeamB + 1;
        dispalyForB(scoreTeamB);
    }

    public void addTwoB (View v){
        scoreTeamB = scoreTeamB + 2;
        dispalyForB(scoreTeamB);
    }

    public void addThreeB (View v){
        scoreTeamB = scoreTeamB + 3;
        dispalyForB(scoreTeamB);
    }

    public void resetScore (View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForA(scoreTeamA);
        dispalyForB(scoreTeamB);
    }

    public void displayForA (int s){
        TextView scoreView = findViewById(R.id.tAs);
        scoreView.setText(String.valueOf(s));
    }

    public void dispalyForB (int s){
        TextView scoreView = findViewById(R.id.tBs);
        scoreView.setText(String.valueOf(s));
    }
}
