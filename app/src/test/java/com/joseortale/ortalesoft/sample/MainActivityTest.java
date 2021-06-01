package com.joseortale.ortalesoft.sample;

import com.joseortale.ortalesoft.sample.util.Utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {
    @Test
    public void input_isFirstLetterCorrect() {
        String test = "Async";

        assertTrue(Utils.validateFirstLetter(test));
    }

    @Test
    public void input_isWrongLetterCorrect() {
        String test = "0sync";

        assertTrue(!Utils.validateFirstLetter(test));
    }
}