package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OlivePizzaDecorator extends AbstractPizzaDecorator {
    public OlivePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getRecipe() {
        return super.getRecipe() + ", olive";
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(new BigDecimal(2));
    }
}
