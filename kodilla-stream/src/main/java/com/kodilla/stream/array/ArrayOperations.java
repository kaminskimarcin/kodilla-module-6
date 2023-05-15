package com.kodilla.stream.array;

import java.util.OptionalDouble;

import static java.util.stream.IntStream.*;

public class ArrayOperations {
    public static OptionalDouble getAverage(int[] numbers) {
        String test = "";


        range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        OptionalDouble result = range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
        return result;
    }
}
