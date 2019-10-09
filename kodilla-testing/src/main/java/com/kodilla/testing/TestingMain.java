package com.kodilla.testing;

import calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        if (calculator.add(2,5) == 7) {
            System.out.println("Method add from Calculator class works perfectly");
        } else {
            System.out.println("Method add from Calculator class works wrong");
        }

        if (calculator.subtract(5,1) == 4) {
            System.out.println("Method subtract from Calculator class works perfectly");
        } else {
            System.out.println("Method subtract from Calculator class works wrong");
        }
    }
}
