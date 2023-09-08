package org.example.exercises;

import java.util.List;

public class DeleteDuplicateElements {

    public static void main(String[] args) {
        List<String> elements = List.of("element1", "element1", "element2", "element3");

        elements = elements.stream()
                .distinct()
                .toList();

        System.out.println(elements);
    }
}
