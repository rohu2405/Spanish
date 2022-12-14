/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


// Find the View that shows the numbers category
//TextView numbers = (TextView) findViewById(R.id.numbers);
//
//// Set a click listener on that View
//        numbers.setOnClickListener(new View.OnClickListener() {
//// The code in this method will be executed when the numbers View is clicked on.
//@Override
//public void onClick(View view) {
//        Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
//        startActivity(numbersIntent);
//        }
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void numbersActivity(View view) {
        Intent i = new Intent(this, numbers.class);
        startActivity(i);

        Toast.makeText(view.getContext(), "Opening Numbers", Toast.LENGTH_SHORT).show();

    }

    public void familyActivity(View view) {
        Intent i = new Intent(this, familymembers.class);
        startActivity(i);
        Toast.makeText(view.getContext(), "Opening Family Members", Toast.LENGTH_SHORT).show();
    }

    public void colorActivity(View view) {
        Intent i = new Intent(this, colors.class);
        startActivity(i);
        Toast.makeText(view.getContext(), "Opening Colors", Toast.LENGTH_SHORT).show();
    }

    public void phraseActivity(View view) {
        Intent i = new Intent(this, phrases.class);
        startActivity(i);
        Toast.makeText(view.getContext(), "Opening Phrases", Toast.LENGTH_SHORT).show();
    }
}