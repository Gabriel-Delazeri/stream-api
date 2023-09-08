package org.example.exercises;

import java.util.Comparator;
import java.util.List;

public class AlphabeticalOrder {

    public static void main(String[] args) {
        List<String> colors = List.of("red", "green", "blue", "yellow");

        List<String> colorsInAscendingAlphabeticalOrder = colors.stream()
                .sorted()
                .toList();

        List<String> colorsInDescendingAlphabeticalOrder = colors.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(colorsInAscendingAlphabeticalOrder);
        System.out.println(colorsInDescendingAlphabeticalOrder);
    }
}
