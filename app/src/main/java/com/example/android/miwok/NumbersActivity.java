package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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

        Log.v("NumnersActivity", "Word at index 0: " + words.get(0));
        Log.v("NumnersActivity", "Word at index 1: " + words.get(1));
        Log.v("NumnersActivity", "Word at index 2: " + words.get(2));
        Log.v("NumnersActivity", "Word at index 3: " + words.get(3));
        Log.v("NumnersActivity", "Word at index 4: " + words.get(4));
        Log.v("NumnersActivity", "Word at index 5: " + words.get(5));
        Log.v("NumnersActivity", "Word at index 6: " + words.get(6));
        Log.v("NumnersActivity", "Word at index 7: " + words.get(7));
        Log.v("NumnersActivity", "Word at index 8: " + words.get(8));
        Log.v("NumnersActivity", "Word at index 9: " + words.get(9));
    }
}
