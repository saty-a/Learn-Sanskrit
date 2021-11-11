package com.example.learnsanksrit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NumberList(View view)
    {
        Intent i = new Intent(this, numbersActivity.class);
        startActivity(i);
    }

    public void familymembers(View view)
    {
        Intent i = new Intent(this, FamilyMembersActivity.class);
        startActivity(i);
    }

    public void phrases(View view)
    {
        Intent i = new Intent(this, PhraseActivity.class);
        startActivity(i);
    }
}