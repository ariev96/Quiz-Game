package com.s1gnific4nt.quizgameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void actionAbout(View v){
        Intent an = new Intent(this, About.class);
        startActivity(an);
    }

    public void actionpreview(View v){
        Intent a = new Intent(this, Preview.class);
        startActivity(a);
    }

    public void actionquiz(View v){
        Intent an = new Intent(this, Quiz.class);
        startActivity(an);
    }

    public void actionhighscore(View v){
        Intent an = new Intent(this, Highscore.class);
        startActivity(an);
    }
}
