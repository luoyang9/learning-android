package xyz.charliezhang.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTeamA = 0;
        scoreTeamB = 0;
    }

    public void addThreeA(View view) {
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }
    public void addTwoA(View view) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }
    public void addOneA(View view) {
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }
    public void addThreeB(View view) {
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }
    public void addTwoB(View view) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }
    public void addOneB(View view) {
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }

    public void displayScoreTeamA(int score) {
        TextView scoreText = (TextView) findViewById(R.id.scoreA);
        scoreText.setText("" + score);
    }

    public void displayScoreTeamB(int score) {
        TextView scoreText = (TextView) findViewById(R.id.scoreB);
        scoreText.setText("" + score);
    }
}
