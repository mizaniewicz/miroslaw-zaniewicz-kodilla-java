package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class BasicTaxiOrder implements TaxiOrder {
    @Override
    public BigDecimal gotCost() {
        return new BigDecimal(5.00);
    }

    @Override
    public String gotDescription() {
        return "Drive a course";
    }
}
