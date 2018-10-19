package com.s1gnific4nt.quizgameapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by s1gnific4nt on 11/2/17.
 */

public class Highscore extends AppCompatActivity {
    int lastScore;
    int best1, best2, best3;
    String nama,nama1,nama2,nama3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highscore);

        TextView tv_score = (TextView) findViewById(R.id.tv_score);

        SharedPreferences preferences = getSharedPreferences("PREFS", 0);
        lastScore = preferences.getInt("lastScore", 0);
        nama = preferences.getString("nama", "-");

        best1 = preferences.getInt("best1", 0);
        best2 = preferences.getInt("best2", 0);
        best3 = preferences.getInt("best3", 0);

        nama1 = preferences.getString("nama1", "-");
        nama2 = preferences.getString("nama2", "-");
        nama3 = preferences.getString("nama3", "-");



        if(lastScore > best3){
            best3 = lastScore;
            nama3 = nama;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best3", best3);
            editor.putString("nama3", nama3);
            editor.apply();
        }

        if(lastScore > best2){
            int temp = best2;
            best2 = lastScore;
            best3 = temp;

            String temp2 = nama2;
            nama2 = nama;
            nama3 = temp2;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best3", best3);
            editor.putInt("best2", best2);
            editor.putString("nama3", nama3);
            editor.putString("nama2", nama2);
            editor.apply();
        }

        if(lastScore > best1){
            int temp = best1;
            best1 = lastScore;
            best2 = temp;

            String temp2 = nama1;
            nama1 = nama;
            nama2 = temp2;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best2", best2);
            editor.putInt("best1", best1);
            editor.putString("nama2", nama2);
            editor.putString("nama1", nama1);
            editor.apply();
        }
        tv_score.setText(" 1."+"                               "+nama1 +"                               "+ best1 + "\n" +
                "2."+"                               "+nama2 +"                               "+ best2 + "\n" +
                "3."+"                               "+nama3 +"                               "+ best3);

        SharedPreferences.Editor editor = preferences.edit();
        editor.remove("nama");
        editor.remove("lastScore");
        editor.commit();

    }


    public void actionCobaLagi(View v){
        Intent an = new Intent(this, Quiz.class);
        startActivity(an);
        finish();
    }
}
