package com.kodilla.testing;

import calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (result.length() == 12) {
            System.out.println("test ok :)");
        } else {
            System.out.println("Sorry :(");
        }

        Calculator calculator = new Calculator();
        int addResult = calculator.add(3,5);
        int subtractResult = calculator.subtract(23,2);

        if (addResult == 8) {
            System.out.println("add method from Calculator class works perfectly");
        } else {
            System.out.println("add method from Calculator class works wrong");
        }

        if (subtractResult == 21) {
            System.out.println("subtract method from Calculator class works perfectly");
        } else {
            System.out.println("subtract method from Calculator class works wrong");
        }
    }
}
