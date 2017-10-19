package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Salami extends AbstractPizzaDecorator {
    public Salami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String makePizza() {
        return super.makePizza() + ", salami";
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(new BigDecimal(5));
    }
}
