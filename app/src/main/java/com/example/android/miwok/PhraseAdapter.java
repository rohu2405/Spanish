package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PhraseAdapter extends ArrayAdapter {
    public PhraseAdapter(Activity context, ArrayList<Phrase> phrases) {
        super(context, 0, phrases);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_phrase_item, parent,false );
        }

        Phrase currPhrase = (Phrase) getItem(position);
        TextView spanTextView = listItemView.findViewById(R.id.Spanish);
        spanTextView.setText(currPhrase.getSpanish());

        TextView defTextView = listItemView.findViewById(R.id.English);
        defTextView.setText(currPhrase.getDefault());
        return listItemView;
    }

}
