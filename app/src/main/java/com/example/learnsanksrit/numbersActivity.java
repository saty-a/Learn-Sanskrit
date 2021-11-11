package com.example.learnsanksrit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;


import java.util.*;
public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("one","ekam",R.drawable.number_one));
        words.add(new Word("Two","dvi",R.drawable.number_two));
        words.add(new Word("Three","tri",R.drawable.number_three));
        words.add(new Word("Four","Catur",R.drawable.number_four));
        words.add(new Word("Five","pancha",R.drawable.number_five));
        words.add(new Word("Six","sas",R.drawable.number_six));
        words.add(new Word("Seven","Sapta",R.drawable.number_seven));
        words.add(new Word("Eight","ashta",R.drawable.number_eight));
        words.add(new Word("Nine","nava",R.drawable.number_nine));
        words.add(new Word("Ten","dasha",R.drawable.number_ten));

        WordAdapter adapter=new WordAdapter(this, words,R.color.category_numbers);
        ListView listView= (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}