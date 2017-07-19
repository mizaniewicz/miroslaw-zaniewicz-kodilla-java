package com.kodilla.stream;

import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        //lambda expressions
        Executor codeToExecute = () -> System.out.println("This is an example text two.");
        processor.execute(codeToExecute);
        processor.execute(() -> System.out.println("This is an example text three."));

        //math expression
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println(expressionExecutor.executeExpression(10, 5, (a, b) -> a + b));
        System.out.println(expressionExecutor.executeExpression(10, 5, (a, b) -> a - b));
        System.out.println(expressionExecutor.executeExpression(10, 5, (a, b) -> a * b));
        System.out.println(expressionExecutor.executeExpression(10, 5, (a, b) -> a / b));

        //method reference
        System.out.println(expressionExecutor.executeExpression(30, 15, FunctionalCalculator::addAToB));
        System.out.println(expressionExecutor.executeExpression(30, 15, FunctionalCalculator::subBFromA));
        System.out.println(expressionExecutor.executeExpression(30, 15, FunctionalCalculator::multiplyAByB));
        System.out.println(expressionExecutor.executeExpression(30, 15, FunctionalCalculator::divideAByB));
    }
}
