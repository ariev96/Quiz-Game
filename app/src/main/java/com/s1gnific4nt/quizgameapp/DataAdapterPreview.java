package com.s1gnific4nt.quizgameapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by s1gnific4nt on 11/1/17.
 */

public class DataAdapterPreview extends ArrayAdapter<DataListPreview> {

    ArrayList<DataListPreview> arrayListData;

    public DataAdapterPreview(Context context, int resource, ArrayList<DataListPreview> objects) {
        super(context, resource, objects);
        this.arrayListData = objects;
    }

    public View getView(int pos, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater li = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = li.inflate(R.layout.preview, null);
        }

        DataListPreview dl = arrayListData.get(pos);
        if(dl != null){
            TextView tvpertanyaan = (TextView) v.findViewById(R.id.tvpertanyaan);
            TextView tvjwbA = (TextView) v.findViewById(R.id.tvjwbA);
            TextView tvjwbB = (TextView) v.findViewById(R.id.tvjwbB);
            TextView tvjwbC = (TextView) v.findViewById(R.id.tvjwbC);
            TextView tvjwbD = (TextView) v.findViewById(R.id.tvjwbD);

            tvpertanyaan.setText(dl.pertanyaan);
            tvjwbA.setText(dl.jwa);
            tvjwbB.setText(dl.jwb);
            tvjwbC.setText(dl.jwc);
            tvjwbD.setText(dl.jwd);
        }
        return v;
    }



}
