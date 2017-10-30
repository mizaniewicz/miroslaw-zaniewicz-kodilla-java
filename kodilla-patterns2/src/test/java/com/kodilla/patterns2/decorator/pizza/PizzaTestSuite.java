package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaTestSuite {
    @Test
    public void testBasicPizza() {
        Pizza pizza = new BasicPizza();

        String makePizza = pizza.getRecipe();
        BigDecimal cost = pizza.cost();

        assertEquals(new BigDecimal(15), cost);
        assertEquals("Pizza with tomato sauce and cheese", makePizza);
    }

    @Test
    public void testBasicPizzaWithSalami() {
        Pizza pizza = new BasicPizza();
        pizza = new SalamiPizzaDecorator(pizza);

        String makePizza = pizza.getRecipe();
        BigDecimal cost = pizza.cost();

        assertEquals(new BigDecimal(20), cost);
        assertEquals("Pizza with tomato sauce and cheese, salami", makePizza);
    }

    @Test
    public void testBasicPizzaWithSalamiAndExtraCheese() {
        Pizza pizza = new BasicPizza();
        pizza = new SalamiPizzaDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);

        String makePizza = pizza.getRecipe();
        BigDecimal cost = pizza.cost();

        assertEquals(new BigDecimal(26), cost);
        assertEquals("Pizza with tomato sauce and cheese, salami, extra cheese", makePizza);
    }
}