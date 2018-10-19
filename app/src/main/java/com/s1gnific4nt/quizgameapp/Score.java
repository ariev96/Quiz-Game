package com.s1gnific4nt.quizgameapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by s1gnific4nt on 11/1/17.
 */

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasilakhir);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent a = getIntent();
        String score = a.getStringExtra("datascore");
        TextView tvscore = (TextView) findViewById(R.id.tvscore);
        tvscore.setText(score);
    }
    public void actionhighscore(View v){
        EditText inputnama = (EditText) findViewById(R.id.inputnama);
        String nama = inputnama.getText().toString();


        TextView tvscore = (TextView) findViewById(R.id.tvscore);
        int score = Integer.parseInt(tvscore.getText().toString());


        SharedPreferences preferences = getSharedPreferences("PREFS", 0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("lastScore", score);
        editor.putString("nama", nama);
        editor.apply();

        Intent intent = new Intent(getApplicationContext(), Highscore.class);
        startActivity(intent);
        finish();
    }
}
