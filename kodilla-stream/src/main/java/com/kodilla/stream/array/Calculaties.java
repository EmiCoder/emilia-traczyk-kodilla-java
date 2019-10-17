package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class Calculaties implements ArrayOperations {

    @Override
    public double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length).map(x -> numbers[x]).forEach(System.out::println);
        return IntStream.range(0, numbers.length).map(x -> numbers[x]).average().getAsDouble();
    }
}
