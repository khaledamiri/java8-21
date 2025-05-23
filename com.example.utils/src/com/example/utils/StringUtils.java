package com.example.utils;

public class StringUtils {

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
