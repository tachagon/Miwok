package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // Find the root view of the whole layout
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for (int index = 0; index < words.size(); index++) {
            // Create a new TextView
            TextView wordTextView = new TextView(this);

            // Set the text to be word at the current index
            wordTextView.setText(words.get(index));

            // Add this TextView as another child to the root view of this layout
            rootView.addView(wordTextView);
        }

    }
}
