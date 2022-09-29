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
        colorList.add(new Color("brown", "marrón" , R.drawable.color_brown));
        colorList.add(new Color("red", "rojo" , R.drawable.color_red));
        colorList.add(new Color("mustard yellow", "amarillo mostaza" , R.drawable.color_mustard_yellow));
        colorList.add(new Color("yellow", "amarillo" , R.drawable.color_dusty_yellow));
        colorList.add(new Color("green", "verde" , R.drawable.color_green));
        colorList.add(new Color("gray", "gris" , R.drawable.color_gray));
        colorList.add(new Color("White", "Blanco" , R.drawable.color_white));









      //  WordAdapter adapter = new WordAdapter(this, colorList);
        ColorAdapter adapter = new ColorAdapter(this,colorList);
        ListView listView = findViewById(R.id.colorlist);
        listView.setAdapter(adapter);

        // ListView listView =  findViewById(R.id.list);
        //ListView listView =  findViewById(R.id.colorlist);

       // listView.setAdapter(adapter);
    }
}