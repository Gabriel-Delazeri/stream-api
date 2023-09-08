package org.example.exercises;

import java.util.List;

public class CountStringStartingWithLetter {

    public static void main(String[] args) {
        char letter = 'a';

        List<String> names = List.of("anderson", "andreia", "luana", "marcos");

        long countStartingWithLetter = names.stream()
                .filter((name) -> name.startsWith(String.valueOf(letter)))
                .count();

        System.out.println(countStartingWithLetter);
    }
}
