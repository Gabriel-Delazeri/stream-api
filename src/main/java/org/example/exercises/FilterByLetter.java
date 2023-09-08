package org.example.exercises;

import java.util.List;

public class FilterByLetter {

    public static void main(String[] args) {
        List<String> names = List.of("kyara", "simba", "mufasa");

        List<String> filteredNames = names.stream()
                .filter((n) -> n.contains("f"))
                .toList();
    }
}
