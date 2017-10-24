package com.kodilla.patterns2.decorator.pizza;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//@Component
//@Scope("prototype")
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
