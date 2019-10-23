package com.kodilla.exception.test;

public class FirstChallenge {

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        int a = 3;
        int b = 0;
        try {
            System.out.println(firstChallenge.divide(a,b));
        } catch (ArithmeticException e) {
            System.out.println("You Shouldn't divide a number by zero");
        }  finally {
            System.out.println("Division action: " + a + " / " + b);
        }

    }

    public double divide(double a, double b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }
}
