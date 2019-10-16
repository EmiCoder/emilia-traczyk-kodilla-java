package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.UniqueBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("mama", (a) -> a + " i tata"));
        System.out.println(poemBeautifier.beautify("różne wielkości liter", (a) -> a.toUpperCase()));
        System.out.println(poemBeautifier.beautify("abecadlo", UniqueBeautifier::separate));
        System.out.println(poemBeautifier.beautify("wakacje", UniqueBeautifier::changeBeginningEnd));

//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);

//        System.out.println("Calculating expressions with lambdas");
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        expressionExecutor.executeExpression(10,5, (a,b) -> a + b);
//        expressionExecutor.executeExpression(10,5, (a,b) -> a - b);
//        expressionExecutor.executeExpression(10,5, (a,b) -> a * b);
//        expressionExecutor.executeExpression(10,5, (a,b) -> a / b);
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);
    }
}
