package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends ArrayAdapter {
    public ColorAdapter(Activity context, ArrayList<Color> colors) {
        super(context, 0, colors);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_color_item, parent,false );
        }

        Color currColor = (Color) getItem(position);
        TextView spanTextView = listItemView.findViewById(R.id.Spanish);
        spanTextView.setText(currColor.getSpanish());

        TextView defTextView = listItemView.findViewById(R.id.English);
        defTextView.setText(currColor.getDefault());

        ImageView iconView = listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currColor.getColorResId());
        return listItemView;
    }
}
