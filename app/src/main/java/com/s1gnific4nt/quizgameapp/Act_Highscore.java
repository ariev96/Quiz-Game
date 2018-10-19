package com.s1gnific4nt.quizgameapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by s1gnific4nt on 11/2/17.
 */

public class Act_Highscore extends AppCompatActivity {
    ArrayList<DataListHighscore> arrayList = new ArrayList<DataListHighscore>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_highscore);

        arrayList.add(new DataListHighscore("1","NA","100"));

        ListView listView = (ListView) findViewById(R.id.listhighscore);
        DataAdapterHighscore adapter = new DataAdapterHighscore(this,R.layout.prev_highscore, arrayList);
        listView.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent a = getIntent();
        String nama = a.getStringExtra("dataScore");
        String score = a.getStringExtra("dataScore2");

        arrayList.add(new DataListHighscore("2",nama,score));


    }
}
