package com.s1gnific4nt.quizgameapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

/**
 * Created by s1gnific4nt on 11/1/17.
 */

public class Quiz extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playquiz);
    }

    public void actionSelesai(View v){

        CheckBox Ayam = (CheckBox) findViewById(R.id.cbayam);
        CheckBox Sapi = (CheckBox) findViewById(R.id.cbSapi);
        CheckBox Bebek = (CheckBox) findViewById(R.id.cbBebek);
        CheckBox Bangau = (CheckBox) findViewById(R.id.cbBangau);
        CheckBox Tapir = (CheckBox) findViewById(R.id.cbTapir);
        CheckBox Kakaktua = (CheckBox) findViewById(R.id.cbKakaktua);
        CheckBox Harimau = (CheckBox) findViewById(R.id.cbHarimau);
        CheckBox Kambing = (CheckBox) findViewById(R.id.cbKambing);
        CheckBox Paus = (CheckBox) findViewById(R.id.cbPaus);
        CheckBox Naga = (CheckBox) findViewById(R.id.cbNaga);
        CheckBox Ular = (CheckBox) findViewById(R.id.cbUlar);
        CheckBox Komodo = (CheckBox) findViewById(R.id.cbKomodo);
        CheckBox Kancil = (CheckBox) findViewById(R.id.cbKancil);
        CheckBox Beruang = (CheckBox) findViewById(R.id.cbBeruang);
        CheckBox Piranha = (CheckBox) findViewById(R.id.cbPiranha);
        CheckBox Elang = (CheckBox) findViewById(R.id.cbElang);

        int hasil = 0;

        if(Ayam.isChecked()){
            hasil = hasil - 5;
        }

        if(Sapi.isChecked()){
            hasil = hasil + 10;
        }

        if(Bebek.isChecked()){
            hasil = hasil - 5;
        }

        if(Bangau.isChecked()){
            hasil = hasil - 5;
        }

        if(Tapir.isChecked()){
            hasil = hasil -5;
        }

        if(Kakaktua.isChecked()){
            hasil = hasil - 5;
        }

        if(Harimau.isChecked()){
            hasil = hasil + 10;
        }

        if(Kambing.isChecked()){
            hasil = hasil - 5;
        }

        if(Paus.isChecked()){
            hasil = hasil + 10;
        }

        if(Naga.isChecked()){
            hasil = hasil - 5;
        }

        if(Ular.isChecked()){
            hasil = hasil - 5;
        }

        if(Komodo.isChecked()){
            hasil = hasil - 5;
        }

        if(Kancil.isChecked()){
            hasil = hasil + 10;
        }

        if(Beruang.isChecked()){
            hasil = hasil - 5;
        }

        if(Piranha.isChecked()){
            hasil = hasil - 5;
        }

        if(Elang.isChecked()){
            hasil = hasil + 10;
        }


        String score = String.valueOf(hasil);

        Intent a = new Intent(this,Score.class);
        a.putExtra("datascore",score);
        startActivity(a);


    }



    }
