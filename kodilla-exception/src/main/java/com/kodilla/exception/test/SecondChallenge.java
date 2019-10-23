package com.kodilla.exception.test;

public class SecondChallenge {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2,1);
        } catch (ExceptionHandling e) {
            System.out.println("Catched ExceptionHandling");
        }
    }

    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {
        try {
            if(x >= 2 || x < 1 || y == 1.5) {
                throw new ExceptionHandling();
            }
        } finally {
            System.out.println("Finally done!");
        }
        return "done";
    }
}
