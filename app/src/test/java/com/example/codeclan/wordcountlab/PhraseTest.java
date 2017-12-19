package com.example.codeclan.wordcountlab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Green on 18/12/2017.
 */

public class PhraseTest {
    Phrase phrase;

    @Before
    public void before(){
        phrase = new Phrase("jolly hockey sticks");
    }

    @Test
    public void canCalculate(){
        assertEquals(3, phrase.wordCount(phrase.getSampleString()));
    }
}
