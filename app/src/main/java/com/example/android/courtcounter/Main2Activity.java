package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    int scoreteamA = 0;
    int scoreteamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        displayForTeamA(0);
        displayForTeamB(0);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void display3pointsA (View v){
        scoreteamA = scoreteamA + 3;
        displayForTeamA(scoreteamA);
    }

    public void display2pointsA(View v){

        scoreteamA = scoreteamA + 2;
        displayForTeamA(scoreteamA);

    }

    public void displayonepointsA(View v){

        scoreteamA = scoreteamA + 1;
        displayForTeamA(scoreteamA);
    }

    public void display3pointsB (View v){
        scoreteamB = scoreteamB + 3;
        displayForTeamB(scoreteamB);
    }

    public void display2pointsB(View v){

        scoreteamB = scoreteamB + 2;
        displayForTeamB(scoreteamB);

    }

    public void displayonepointsB(View v){

        scoreteamB = scoreteamB + 1;
        displayForTeamB(scoreteamB);
    }

    public void ResetButton (View v){
        scoreteamA = 0;
        scoreteamB = 0;
        displayForTeamA(scoreteamA);
        displayForTeamB(scoreteamB);

        String message = " Start Play ";
        displaymessage(message);

    }

    public void SubmitScore(View v){

        if (scoreteamA > scoreteamB ){
            String message = "Congratulations , Team A wins !!!";
            displaymessage(message);

        }else if(scoreteamB > scoreteamA) {

            String message = "Congratulations , Team B wins !!!";
            displaymessage(message);

        }
        else if((scoreteamA == 0)&&(scoreteamB == 0)) {

            String message = "Try Again !!!";
            displaymessage(message);


        }
        else  {
            String message = "It's a draw !!!" +  " Try Again ";
            displaymessage(message);


        }


    }

    public void displaymessage(String message){

        TextView scoreView = (TextView) findViewById(R.id.result);
        scoreView.setText(message);


    }


}
