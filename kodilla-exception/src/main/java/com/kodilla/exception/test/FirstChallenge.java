package com.kodilla.exception.test;

public class FirstChallenge {

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println(result);
    }

    public double divide(double a, double b) {
        double result = 0;
        try {
            if (b == 0) throw new ArithmeticException();
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println ("You Shouldn't divide a number by zero");
        } finally {
            System.out.println("Division action: " + a + " / " + b);
        }
        return result;
    }
}
