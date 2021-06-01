package com.joseortale.ortalesoft.sample.util;

public class Utils {
    public static boolean validateFirstLetter(String textField) {
        return !textField.substring(0, 1).matches("[0-9]");
    }
}
