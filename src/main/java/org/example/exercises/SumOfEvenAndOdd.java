package org.example.exercises;

import java.util.List;

public class SumOfEvenAndOdd {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        int sumOfEven = numbers.stream()
                .filter((n) -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int sumOfOdd = numbers.stream()
                .filter((n) -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.printf("Sum of even %d%n", sumOfEven);
        System.out.printf("Sum of odd %d%n", sumOfOdd);
    }
}
