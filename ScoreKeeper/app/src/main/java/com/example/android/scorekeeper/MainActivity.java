package com.example.android.scorekeeper;

//Copyright [2018] [Vrushabh Gore]
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //Initialize all the global variables used to update the scores and the fouls
    int scoreteamA = 0;
    int foulteamA = 0;
    int scoreteamB = 0;
    int foulteamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
// Method used to display the Score for Team A
    public void displayScoreA (int score){

        TextView scoreA = (TextView)findViewById(R.id.team_a_score);
        scoreA.setText(String.valueOf(score));
    }
// Method used to display the Foul for Team A
    public void displayFoulA (int foul){

        TextView foulA = (TextView)findViewById(R.id.team_a_foul);
        foulA.setText(String.valueOf(foul));
    }
// Method used to display the Score for Team B
    public void displayScoreB (int score){

        TextView scoreA = (TextView)findViewById(R.id.team_b_score);
        scoreA.setText(String.valueOf(score));
    }
// Method used to display the Foul for Team B
    public void displayFoulb (int foul){

        TextView foulA = (TextView)findViewById(R.id.team_b_foul);
        foulA.setText(String.valueOf(foul));
    }
// Method used to update the Score for Team A
    public void ScoreTeamA(View view) {
        scoreteamA = scoreteamA +1;
        displayScoreA(scoreteamA);
    }
// Method used to update the Foul for Team A
    public void FoulTeamA(View view) {
        foulteamA = foulteamA + 1;
        displayFoulA(foulteamA);
    }

// Method used to update the Score for Team B
    public void ScoreTeamB(View view) {
        scoreteamB = scoreteamB +1;
        displayScoreB(scoreteamB);
    }
// Method used to update the Foul for Team B
    public void FoulTeamB(View view) {
        foulteamB = foulteamB + 1;
        displayFoulb(foulteamB);
    }
// Method used to Reset all the scores and fouls to 0
    public void Reset(View view) {

        displayFoulA(0);
        displayScoreA(0);
        displayScoreB(0);
        displayFoulb(0);

    }
}
