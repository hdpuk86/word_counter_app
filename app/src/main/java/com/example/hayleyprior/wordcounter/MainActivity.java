package com.example.hayleyprior.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private WordCounter wordCounter;
    private EditText enterTextField;
    private Button countButton;
    private TextView wordCountAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordCounter = new WordCounter();
        enterTextField = findViewById(R.id.enterTextField);
        countButton = findViewById(R.id.countTextButton);
        wordCountAnswer = findViewById(R.id.countAnswer);

    }

    public void onCountButtonClicked(View button) {
        String textToCount = enterTextField.getText().toString();
        int answer = wordCounter.totalWordCount(textToCount);

        wordCountAnswer.setText("Word Count: " + answer);
    }

    public void onIndividualCountButtonClicked(View button) {
        String textToCount = enterTextField.getText().toString();
        wordCounter.addText(textToCount);
        HashMap answer = wordCounter.countIndividualWords();
        wordCountAnswer.setText(answer.toString());
    }
}
