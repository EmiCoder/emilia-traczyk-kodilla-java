package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        int[] tab = prepareTabOfInt(5);
        double average = 0;
        for (int i = 0; i < tab.length; i++) {
           average += tab[i];
        }
        Assert.assertEquals(average / tab.length, ArrayOperations.getAverage(tab),0);
    }

    private int[] prepareTabOfInt (int amountOfElements) {
        Random generator = new Random();
        return IntStream.rangeClosed(1, amountOfElements)
                        .map(x -> generator.nextInt(11))
                        .boxed().mapToInt(i -> i).toArray();
    }
}
