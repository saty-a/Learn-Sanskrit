package com.example.learnsanksrit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("father","tAta",R.drawable.family_father));
        words.add(new Word("mother","mAtR",R.drawable.family_mother));
        words.add(new Word("son","putra",R.drawable.family_son));
        words.add(new Word("daughter","putrI",R.drawable.family_daughter));
        words.add(new Word("older brother","jyeSTha",R.drawable.family_older_brother));
        words.add(new Word("younger brother","anuja",R.drawable.family_younger_brother));
        words.add(new Word("older sister","jyeSThA",R.drawable.family_older_sister));
        words.add(new Word("grandmother","mAtAmaha",R.drawable.family_grandmother));
        words.add(new Word("grandfather","pitAmaha",R.drawable.family_grandfather));


        WordAdapter adapter=new WordAdapter(this, words,R.color.family_members);
        ListView listView= (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}