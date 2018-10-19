package com.s1gnific4nt.quizgameapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by s1gnific4nt on 11/1/17.
 */

public class Tambahpertanyaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputpertanyaan);
    }

    public void actionSimpan(View v) {

        EditText inputpertanyaan = (EditText) findViewById(R.id.inputpertanyaan);
        EditText inputpila = (EditText) findViewById(R.id.inputpila);
        EditText inputpilb = (EditText) findViewById(R.id.inputpilb);
        EditText inputpilc = (EditText) findViewById(R.id.inputpilc);
        EditText inputpild = (EditText) findViewById(R.id.inputpild);

        CheckBox cbpila = (CheckBox) findViewById(R.id.cbpila);
        CheckBox cbpilb = (CheckBox) findViewById(R.id.cbpilb);
        CheckBox cbpilc = (CheckBox) findViewById(R.id.cbpilc);
        CheckBox cbpild = (CheckBox) findViewById(R.id.cbpild);

        String pertanyaan = inputpertanyaan.getText().toString();
        String jwa = inputpila.getText().toString();
        String jwb = inputpilb.getText().toString();
        String jwc = inputpilc.getText().toString();
        String jwd = inputpild.getText().toString();

        Intent a = new Intent(this, Preview.class);
        a.putExtra("tambah", pertanyaan);
        a.putExtra("tambah1", jwa);
        a.putExtra("tambah2", jwb);
        a.putExtra("tambah3", jwc);
        a.putExtra("tambah4", jwd);
        startActivity(a);
    }
    public void actionBatal(View v){

        Intent a = new Intent(this, Preview.class);
        startActivity(a);
    }
}
