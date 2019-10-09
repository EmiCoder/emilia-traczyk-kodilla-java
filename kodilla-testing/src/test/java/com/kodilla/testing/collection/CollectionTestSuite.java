package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    int counter = 1;

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }


    @Test
    public void testOddNumbersExterminatorNormalList () {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(3);
        oddNumbersExterminator.exterminate(list);
        ArrayList<Integer> arrayListToCheck = new ArrayList<>();
        arrayListToCheck.add(2);
        arrayListToCheck.add(8);
        Assert.assertArrayEquals(arrayListToCheck.toArray(), oddNumbersExterminator.exterminate(list).toArray());
        Assert.assertEquals(2, oddNumbersExterminator.exterminate(list).toArray().length);
        counter++;
    }

    @Test
    public void testOddNumbersExterminatorEmptyList () {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> arrayListToCheck = new ArrayList<>();
        Assert.assertArrayEquals(arrayListToCheck.toArray(), oddNumbersExterminator.exterminate(list).toArray());
        Assert.assertTrue(oddNumbersExterminator.exterminate(list).isEmpty());
    }
}
