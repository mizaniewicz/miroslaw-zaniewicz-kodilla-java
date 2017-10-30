package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaDecorator {
    public ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getRecipe() {
        return super.getRecipe() + ", extra cheese";
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(new BigDecimal(6));
    }
}
