package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        return numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
    }
}
