package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaDecorator implements Pizza {
    private final Pizza pizza;

    protected AbstractPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getRecipe() {
        return pizza.getRecipe();
    }

    @Override
    public BigDecimal cost() {
        return pizza.cost();
    }
}
