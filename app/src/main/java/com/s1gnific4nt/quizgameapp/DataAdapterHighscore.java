package com.s1gnific4nt.quizgameapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by s1gnific4nt on 11/2/17.
 */

public class DataAdapterHighscore extends ArrayAdapter <DataListHighscore> {

    ArrayList<DataListHighscore> arrayListData;

    public DataAdapterHighscore(Context context, int resource, ArrayList<DataListHighscore> objects) {
        super(context, resource, objects);
        this.arrayListData = objects;
    }

    public View getView(int pos, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater li = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = li.inflate(R.layout.prev_highscore, null);
        }

        DataListHighscore dl = arrayListData.get(pos);
        if(dl != null){
            TextView tvno = (TextView) v.findViewById(R.id.tvno);
            TextView tvnama = (TextView) v.findViewById(R.id.tvnama);
            TextView tvscore = (TextView) v.findViewById(R.id.tvscore);

            tvno.setText(dl.no);
            tvnama.setText(dl.nama);
            tvscore.setText(dl.score);
        }
        return v;
    }
}
