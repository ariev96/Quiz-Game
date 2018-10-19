package com.s1gnific4nt.quizgameapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by s1gnific4nt on 11/1/17.
 */

public class Preview extends AppCompatActivity {
    ArrayList<DataListPreview> arrayList = new ArrayList<DataListPreview>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrydataquiz);

        arrayList.add(new DataListPreview("1.Hewan berkaki dua dibawah ini kecuali :","A. Ayam","B. Sapi","C. Bebek","D. Bangau"));
        arrayList.add(new DataListPreview("2.Berikut ini manakah yang merupakan hewan karnivora?","A. Tapir","B. Burung kakak tua","C. Harimau","D. Kambing"));
        arrayList.add(new DataListPreview("3.Berikut ini yang termasuk hewan mamalia adalah :","A. Ikan Paus","B. Naga","C. Ular","D. Komodo"));
        arrayList.add(new DataListPreview("4.Termasuk hewan herbivora dibawah ini adalah :","A. Kancil","B. Beruang","C. Ikan Piranha","D. Burung Elang"));

        ListView listView = (ListView) findViewById(R.id.pertanyaan);
        DataAdapterPreview adapter = new DataAdapterPreview(this,R.layout.preview, arrayList);
        listView.setAdapter(adapter);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Intent a = getIntent();
        String pertanyaan = a.getStringExtra("tambah");
        String pila = a.getStringExtra("tambah1");
        String pilb = a.getStringExtra("tambah2");
        String pilc = a.getStringExtra("tambah3");
        String pild = a.getStringExtra("tambah4");

        arrayList.add(new DataListPreview(pertanyaan,pila,pilb,pilc,pild));


    }
    public void actionAdd(View v){
        Intent a = new Intent(this, Tambahpertanyaan.class);
        startActivity(a);
    }

}
