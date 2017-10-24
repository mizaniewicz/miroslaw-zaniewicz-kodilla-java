package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PizzaTestSuite {
    @Autowired
    BasicPizza basicPizza;

    @Autowired
    Pizza pizza;

    @Test
    public void testBasicPizzaWithSalami() {
        System.out.println(basicPizza.cost());
    }

//    @Test
//    public void testBasicPizza() {
//        Pizza pizza = new BasicPizza();
//
//        String makePizza = pizza.getRecipe();
//        BigDecimal cost = pizza.cost();
//
//        assertEquals(new BigDecimal(15), cost);
//        assertEquals("Pizza with tomato sauce and cheese", makePizza);
//    }
//
//    @Test
//    public void testBasicPizzaWithSalami() {
//        Pizza pizza = new BasicPizza();
//        pizza = new SalamiPizzaDecorator(pizza);
//
//        String makePizza = pizza.getRecipe();
//        BigDecimal cost = pizza.cost();
//
//        assertEquals(new BigDecimal(20), cost);
//        assertEquals("Pizza with tomato sauce and cheese, salami", makePizza);
//    }
//
//    @Test
//    public void testBasicPizzaWithSalamiAndExtraCheese() {
//        Pizza pizza = new BasicPizza();
//        pizza = new SalamiPizzaDecorator(pizza);
//        pizza = new ExtraCheeseDecorator(pizza);
//
//        String makePizza = pizza.getRecipe();
//        BigDecimal cost = pizza.cost();
//
//        assertEquals(new BigDecimal(26), cost);
//        assertEquals("Pizza with tomato sauce and cheese, salami, extra cheese", makePizza);
//    }
}