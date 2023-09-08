package org.example.exercises;

import java.util.List;

public class UpperCaseString {

    public static void main(String[] args) {
        List<String> strings = List.of("dog", "cat", "turtle");

        List<String> uppercaseStrings = strings.stream()
                .map(String::toUpperCase)
                .toList();

        for (String uppercaseString : uppercaseStrings) {
            System.out.println(uppercaseString);
        }
    }
}
