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
        familyList.add(new Family("Father", "Padre" , R.drawable.family_father));
        familyList.add(new Family("Mother", "Madre" , R.drawable.family_mother));
        familyList.add(new Family("Son", "Sonido" , R.drawable.family_son));
        familyList.add(new Family("Daughter", "Hija" , R.drawable.family_daughter));
       // familyList.add(new Family("Husband", "Marido" ,));
      //  familyList.add(new Family("Wife", "Esposa"));
        familyList.add(new Family("Brother", "Hermano" ,  R.drawable.family_older_brother));
        familyList.add(new Family("Sister", "Hermana" , R.drawable.family_older_sister));
        familyList.add(new Family("Grandfather", "Abuelo" , R.drawable.family_grandfather));
        familyList.add(new Family("Grandmother", "Abuela" , R.drawable.family_grandmother));
//        familyList.add(new Family("Uncle", "Tío"));
//        familyList.add(new Family("Aunt", "Tía"));
//        familyList.add(new Family("Cousin", "Primo"));
//        familyList.add(new Family("Nephew", "Sobrino"));
//        familyList.add(new Family("Niece", "Sobrina"));

        FamilyAdapter adapter = new FamilyAdapter(this,familyList);
        ListView listView = findViewById(R.id.familylist);
        listView.setAdapter((ListAdapter) adapter);
    }
}