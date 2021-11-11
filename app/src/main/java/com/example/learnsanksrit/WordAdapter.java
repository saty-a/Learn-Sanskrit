package com.example.learnsanksrit;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId){

        super(context,0,words);
        mColorResourceId=colorResourceId;
    }


    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView =convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        Word currentWord = getItem(position);

        TextView sanskritTextView =(TextView) listItemView.findViewById(R.id.sanskrit_text_view);
        sanskritTextView.setText(currentWord.getsanskritTranslation());

        TextView defaultTextView =(TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getdefaultTranslation());

        ImageView img=(ImageView) listItemView.findViewById(R.id.resImage_View);
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            img.setImageResource(currentWord.getmImageResourceId());
            // Make sure the view is visible
            img.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            img.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor((color));
        return listItemView;
    }



}
