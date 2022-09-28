package com.example.android.miwok;





import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyAdapter extends ArrayAdapter {
    public FamilyAdapter(Activity context, ArrayList<Family> families) {
        super(context, 0, families);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_family_item, parent,false );
        }

        Family currColor = (Family) getItem(position);
        TextView spanTextView = listItemView.findViewById(R.id.Spanish);
        spanTextView.setText(currColor.getSpanish());

        TextView defTextView = listItemView.findViewById(R.id.English);
        defTextView.setText(currColor.getDefault());
        return listItemView;
    }
}
