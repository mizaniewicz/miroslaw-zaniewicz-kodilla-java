package com.kodilla.patterns2.decorator.pizza;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Scope("prototype")
public class BasicPizza implements Pizza {
    @Override
    public String getRecipe() {
        return "Pizza with tomato sauce and cheese";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(15);
    }
}
