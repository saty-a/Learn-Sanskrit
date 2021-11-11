package com.example.learnsanksrit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase);

        ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("Welcome","svāgatam"));
        words.add(new Word("Hello","namaste"));
        words.add(new Word("How are you?","Male: " +"kathamasti bhavān\n"+"Female: "+"kathamasti bhavatī"));
        words.add(new Word("Reply to 'How are you?'","Male: " +"ahaṃ kuśalī\n"+"Female: "+"ahaṃ kuśalinī"));
        words.add(new Word("What's your name?","tava nāma kim?"));
        words.add(new Word("My name is ...","mama nāma ..."));
        words.add(new Word("Good morning","suprabhātam"));
        words.add(new Word("Good night","śubharātrī"));
        words.add(new Word("Goodbye","punarmilāma"));
        words.add(new Word("Good luck!","saubhāgyam"));
        words.add(new Word("Have a nice day","sudinamastu"));
        words.add(new Word("Bon appetit OR\n" +
                "Have a nice meal","bhojanaṃ svādiṣṭamastu"));
        words.add(new Word("Have a good journey","na jānāmi"));
        words.add(new Word("I don't know","śubhayātrā"));
        words.add(new Word("Excuse me","kṛpayā kṣamyatām"));
        words.add(new Word("Sorry","kṛpayā kṣamyatām"));
        words.add(new Word("Please","kṛpayā"));
        words.add(new Word("Thank you","dhanyavādāḥ"));
        words.add(new Word("Help!","sāhāyyam"));
        words.add(new Word("Stop!","tiṣṭha"));



        WordAdapter adapter=new WordAdapter(this, words,R.color.pharases);
        ListView listView= (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}