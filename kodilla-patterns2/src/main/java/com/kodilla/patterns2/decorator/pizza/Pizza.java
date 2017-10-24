package com.kodilla.patterns2.decorator.pizza;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Scope("prototype")
public interface Pizza {
    String getRecipe();
    BigDecimal cost();
}
