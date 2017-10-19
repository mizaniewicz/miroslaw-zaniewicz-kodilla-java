package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Olive extends AbstractPizzaDecorator {
    public Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String makePizza() {
        return super.makePizza() + ", olive";
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(new BigDecimal(2));
    }
}
