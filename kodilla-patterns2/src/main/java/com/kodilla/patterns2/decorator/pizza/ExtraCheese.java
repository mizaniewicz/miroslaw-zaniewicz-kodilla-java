package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheese extends AbstractPizzaDecorator {
    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String makePizza() {
        return super.makePizza() + ", extra cheese";
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(new BigDecimal(6));
    }
}
