package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculatorAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(6, 3);
        //Then
        Assert.assertEquals("result: 9.0", 9.0, result, 0.01) ;
    }

    @Test
    public void testCalculatorSubtract() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.sub(6, 3);
        //Then
        Assert.assertEquals("result: 3.0", 3.0, result, 0.01) ;
    }

    @Test
    public void testCalculatorMultiply() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.mul(6, 3);
        //Then
        Assert.assertEquals("result: 18.0", 18.0, result, 0.01) ;
    }

    @Test
    public void testCalculatorDivide() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.div(6, 3);
        //Then
        Assert.assertEquals("result: 2.0", 2.0, result, 0.01) ;
    }
}
