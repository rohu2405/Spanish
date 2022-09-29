package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
//        String[] numbersList = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN"};
        ArrayList<Word> numbersList = new ArrayList<>();
        numbersList.add(new Word("one","uno", R.drawable.number_one));
        numbersList.add(new Word("two","dos", R.drawable.number_two));
        numbersList.add(new Word("three","tres", R.drawable.number_three));
        numbersList.add(new Word("four","cuatro", R.drawable.number_four));
        numbersList.add(new Word("five","cinco", R.drawable.number_five));
        numbersList.add(new Word("six","ceis", R.drawable.number_six));
        numbersList.add(new Word("seven","siete" , R.drawable.number_seven));
        numbersList.add(new Word("eight","ocho" , R.drawable.number_eight));
        numbersList.add(new Word("nine","nueve", R.drawable.number_nine));
        numbersList.add(new Word("ten","diez", R.drawable.number_ten));





        WordAdapter adapter = new WordAdapter(this, numbersList);

       // ListView listView =  findViewById(R.id.list);
        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

        // Using While Loop
//        int count = 0;
//        while(count<numbersList.size()) {
//            TextView wordView = new TextView(this);
//            wordView.setText(numbersList.get(count));
//            rootView.addView(wordView);
//            count++;
//        }

//        // Using For Loop
//        for (int count = 0; count < numbersList.size() ; count++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(numbersList.get(count));
//            rootView.addView(wordView);
//
//        }
















    }
}

//        int count = 0;
//        while(count<=10) {
//            numbersList.add(" ONE");
//            numbersList.add(" TWO");
//            numbersList.add(" THREE");
//            numbersList.add(" FOUR");
//            numbersList.add(" FIVE");
//            numbersList.add(" SIX");
//            numbersList.add(" SEVEN");
//            numbersList.add(" EIGHT");
//            numbersList.add(" NINE");
//            numbersList.add(" TEN");
//            count++;
//        }


//        TextView wordView1 = new TextView(this);
//        wordView1.setText(numbersList.get(1));
//        rootView.addView(wordView1);
//
//        TextView wordView2 = new TextView(this);
//        wordView2.setText(numbersList.get(2));
//        rootView.addView(wordView2);
//
//        TextView wordView3 = new TextView(this);
//        wordView3.setText(numbersList.get(3));
//        rootView.addView(wordView3);
//
//        TextView wordView4 = new TextView(this);
//        wordView4.setText(numbersList.get(4));
//        rootView.addView(wordView4);
//
//        TextView wordView5 = new TextView(this);
//        wordView5.setText(numbersList.get(5));
//        rootView.addView(wordView5);
//
//        TextView wordView6 = new TextView(this);
//        wordView6.setText(numbersList.get(6));
//        rootView.addView(wordView6);
//
//        TextView wordView7 = new TextView(this);
//        wordView7.setText(numbersList.get(7));
//        rootView.addView(wordView7);
//
//        TextView wordView8 = new TextView(this);
//        wordView8.setText(numbersList.get(8));
//        rootView.addView(wordView8);
//
//        TextView wordView9 = new TextView(this);
//        wordView9.setText(numbersList.get(9));
//        rootView.addView(wordView9);