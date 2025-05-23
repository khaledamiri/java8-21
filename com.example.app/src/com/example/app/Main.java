package com.example.app;

import com.example.utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        String input = "Bonjour";
        String reversed = StringUtils.reverse(input);
        System.out.println("Inversé : " + reversed);
    }
}