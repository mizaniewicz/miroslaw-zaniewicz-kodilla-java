package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiPizzaDecorator extends AbstractPizzaDecorator {
    public SalamiPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getRecipe() {
        return super.getRecipe() + ", salami";
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(new BigDecimal(5));
    }
}
