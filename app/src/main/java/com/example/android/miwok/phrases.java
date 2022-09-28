package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Phrase> phraseList = new ArrayList<>();
        phraseList.add(new Phrase("Hi! I am Rohit. And you?", "¡Hola! Soy Rohit. ¿Y tú?"));
        phraseList.add(new Phrase(" Nice to meet you.", "Encantado de conocerte."));
        phraseList.add(new Phrase("Where are you from?", "¿De dónde eres?"));
        phraseList.add(new Phrase("What do you do?", "¿A qué te dedicas?"));
        phraseList.add(new Phrase("What do you like to do (in your free time)?", "¿Qué te gusta hacer (en tu tiempo libre)?"));
        phraseList.add(new Phrase("What is your phone number?", "¿Cuál es tu número de teléfono?"));
        phraseList.add(new Phrase("Do you have Facebook?", "¿Tienes Facebook?"));
        phraseList.add(new Phrase("Thanks so much.", "Muchas gracias."));
        phraseList.add(new Phrase(" I really appreciate…", "Realmente aprecio..."));
        phraseList.add(new Phrase("Excuse me.", "Perdona."));
        phraseList.add(new Phrase(" I am sorry.", "Lo siento."));
        phraseList.add(new Phrase("What do you think?", "¿Qué te parece?"));
        phraseList.add(new Phrase("How does that sound?", "¿Cómo suena eso?"));
        phraseList.add(new Phrase("That sounds great.", "Eso es excelente."));
        phraseList.add(new Phrase("(Oh,) never mind.", "(Oh,) no importa."));
        phraseList.add(new Phrase(" I am learning English.", "Estoy aprendiendo inglés."));
        phraseList.add(new Phrase(" I do not understand.", "No entiendo."));
        phraseList.add(new Phrase("Could you repeat that please?", "¿Podrías repetir eso, por favor?"));
        phraseList.add(new Phrase("Could you please talk slower?", "¿Podría por favor hablar más despacio?"));
        phraseList.add(new Phrase("Thank you. That helps a lot.", "Gracias. Eso ayuda mucho."));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));
//        phraseList.add(new Phrase("Hi! I am Rohit. (And you?)", "¡Hola! Soy Rohit. (¿Y tú?)"));






        PhraseAdapter adapter = new PhraseAdapter(this,phraseList);
        ListView listView = findViewById(R.id.phraselist);
        listView.setAdapter((ListAdapter) adapter);
    }
}