package com.kodilla.exception.main;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

//        FileReader fileReader = new FileReader();
//        try {
//            fileReader.readFile();
//        } catch (FileReaderException e) {
//            System.out.println("Problem while reading a file");
//        }

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2,1);
        } catch (ExceptionHandling e) {
            System.out.println("Catched ExceptionHandling");
        }


    }
}
