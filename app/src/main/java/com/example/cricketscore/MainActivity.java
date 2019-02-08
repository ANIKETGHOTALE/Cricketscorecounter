package com.example.cricketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int wickets = 0;
    int runs = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addwickets(View v) {
        wickets = wickets + 1;
        displaywickets(wickets);
    }

    /**
     * Wicket Counts....
     */
    private void displaywickets(int count) {
        TextView countView = (TextView) findViewById(R.id.wicket_counts);
        countView.setText("" + count);
    }

    /**
     * Add Runs...
     */
    public void addfirstsecond_runs(View v) {
        runs = runs + 1;
        displayruns(runs);
    }

    public void addfour_runs(View v) {
        runs = runs + 4;
        displayruns(runs);
    }

    public void addsix_runs(View v) {
        runs = runs + 6;
        displayruns(runs);
    }

    /**
     * Run counts...
     */
    public void displayruns(int count) {
        TextView countView = (TextView) findViewById(R.id.runs_count);
        countView.setText(String.valueOf(count));
    }

    /**
     * Reset...
     */
    public void reset_score(View v) {
        wickets = 0;
        runs = 0;
        displaywickets(wickets);
        displayruns(runs);
    }
}
