package com.kodilla.patterns2.decorator.pizza;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//@Component
//@Scope("prototype")
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
