package org.example.exercises;

import java.util.List;

public class AverageOfIntegerList {

    public static void main(String[] args) {
        List<Integer> grades = List.of(10, 5, 4, 2);

        double gradeAverage = grades.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.printf("""
                The grade average is %s
                %n""", gradeAverage);
    }
}
