package com.kodilla.patterns2.decorator.pizza;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Scope("prototype")
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
