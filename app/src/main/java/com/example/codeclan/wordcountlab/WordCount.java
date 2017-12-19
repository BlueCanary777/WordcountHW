package com.example.codeclan.wordcountlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCount extends AppCompatActivity {

    EditText userInput;
    Button getWordCount;
    TextView calculatedCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        userInput = findViewById(R.id.userInput);
        getWordCount = findViewById(R.id.getWordCount);
        calculatedCount = findViewById(R.id.calculatedCount);
    }

    public void onWordCountButtonClicked(View button) {
        Log.d(getClass().toString(), "onWordCountButtonClicked was called");
        String text = userInput.getText().toString();
        Log.d(getClass().toString(), "The output was '" + text + "'");

        Phrase phrase = new Phrase();
        String output = phrase.wordCount(text);
        calculatedCount.setText(output);
    }

}
