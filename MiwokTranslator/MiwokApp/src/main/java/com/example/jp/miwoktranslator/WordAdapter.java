package com.example.jp.miwoktranslator;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId ) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word currentWords = getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_number_textview);
        englishTextView.setText(currentWords.getEnglishTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_number_textview);
        miwokTextView.setText(currentWords.getMiwokTranslation());

        ImageView miwokImageView = (ImageView) listItemView.findViewById(R.id.miwok_imageView);
        if(currentWords.hasImage()) {
            miwokImageView.setImageResource(currentWords.getImageResourceId());
        }
        else
        {
            miwokImageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}
