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
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double add = calculator.add(2.0, 3.0);
        double sub = calculator.sub(3.0, 1.0);
        double mul = calculator.mul(4.0, 2.0);
        double div= calculator.div(8.0, 2.0);

        //Then
        Assert.assertEquals(5.0, add, 0.01);
        Assert.assertEquals(2.0, sub, 0.01);
        Assert.assertEquals(8.0, mul, 0.01);
        Assert.assertEquals(4.0, div, 0.01);
    }
}
