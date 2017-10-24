package com.kodilla.patterns2.decorator.pizza;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//@Component
//@Scope("prototype")
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
