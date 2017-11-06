package com.example.hayleyprior.wordcounter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by hayleyprior on 06/11/2017.
 */

public class WordCounter {

    private ArrayList<String> words;
    private HashMap<String, Integer> wordCounter;

    public WordCounter() {
        this.words = new ArrayList<>();
        this.wordCounter = new HashMap<>();
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void addText(String text) {
        resetWordCounter();
        resetTextToCount();
        for (String word : text.split(" ")) {
            this.words.add(word);
        }
    }

    public void resetTextToCount() {
        this.words.clear();
    }

    public void resetWordCounter() {
        this.wordCounter.clear();
    }

    public int totalWordCount(String text) {
        addText(text);
        return this.words.size();
    }

    public HashMap<String, Integer> countIndividualWords() {
        for (String word : this.words) {
            Integer count = wordCounter.get(word);
            if (count == null) {
                count = 0;
            }
            wordCounter.put(word, count + 1);
        }
        return wordCounter;
    }


}
