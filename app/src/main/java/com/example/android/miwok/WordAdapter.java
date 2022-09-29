package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }



    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false );
        }

        Word currWord = getItem(position);
        TextView spanTextView = listItemView.findViewById(R.id.Spanish);
        spanTextView.setText(currWord.getSpanish());

        TextView defTextView = listItemView.findViewById(R.id.English);
        defTextView.setText(currWord.getDefault());

        ImageView iconView = listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currWord.getImageResId());
        return listItemView;
    }
}


