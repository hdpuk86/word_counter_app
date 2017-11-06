package com.example.hayleyprior.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 06/11/2017.
 */

public class TestWordCounter {

    WordCounter wordCounter;

    @Before
    public void setUp() throws Exception {
        wordCounter = new WordCounter();
    }

    @Test
    public void canAddWords() {
        wordCounter.addText("count these words");
        assertEquals(3, wordCounter.getWords().size());
    }

    @Test
    public void canResetTextField() throws Exception {
        wordCounter.addText("count these words");
        wordCounter.resetTextToCount();
        assertEquals(0, wordCounter.getWords().size());
    }

    @Test
    public void canCountWords() throws Exception {
        assertEquals(3, wordCounter.totalWordCount("count these words"));
    }

}
