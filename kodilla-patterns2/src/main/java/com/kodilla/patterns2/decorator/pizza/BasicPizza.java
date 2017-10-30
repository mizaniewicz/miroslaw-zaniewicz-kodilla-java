package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements Pizza {
    @Override
    public String getRecipe() {
        return "Pizza with tomato sauce and cheese";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(15);
    }
}
