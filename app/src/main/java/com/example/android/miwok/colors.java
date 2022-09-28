package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Color> colorList = new ArrayList<>();
       // colorList.add(new Word(""));
        colorList.add(new Color("blue", "azul"));
        colorList.add(new Color("red", "rojo"));
        colorList.add(new Color("orange", "naranja"));
        colorList.add(new Color("yellow", "amarillo"));
        colorList.add(new Color("green", "verde"));
        colorList.add(new Color("indigo", "añil"));
        colorList.add(new Color("violet", "violeta"));









      //  WordAdapter adapter = new WordAdapter(this, colorList);
        ColorAdapter adapter = new ColorAdapter(this,colorList);
        ListView listView = findViewById(R.id.colorlist);
        listView.setAdapter(adapter);

        // ListView listView =  findViewById(R.id.list);
        //ListView listView =  findViewById(R.id.colorlist);

       // listView.setAdapter(adapter);
    }
}