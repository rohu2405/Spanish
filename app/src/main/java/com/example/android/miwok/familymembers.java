package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class familymembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familymembers);
        ArrayList<Family> familyList = new ArrayList<>();
        familyList.add(new Family("Father", "Padre"));
        familyList.add(new Family("Mother", "Madre"));
        familyList.add(new Family("Son", "Sonido"));
        familyList.add(new Family("Daughter", "Hija"));
        familyList.add(new Family("Husband", "Marido"));
        familyList.add(new Family("Wife", "Esposa"));
        familyList.add(new Family("Brother", "Hermano"));
        familyList.add(new Family("Sister", "Hermana"));
        familyList.add(new Family("Grandfather", "Abuelo"));
        familyList.add(new Family("Grandmother", "Abuela"));
        familyList.add(new Family("Uncle", "Tío"));
        familyList.add(new Family("Aunt", "Tía"));
        familyList.add(new Family("Cousin", "Primo"));
        familyList.add(new Family("Nephew", "Sobrino"));
        familyList.add(new Family("Niece", "Sobrina"));

        FamilyAdapter adapter = new FamilyAdapter(this,familyList);
        ListView listView = findViewById(R.id.familylist);
        listView.setAdapter((ListAdapter) adapter);
    }
}