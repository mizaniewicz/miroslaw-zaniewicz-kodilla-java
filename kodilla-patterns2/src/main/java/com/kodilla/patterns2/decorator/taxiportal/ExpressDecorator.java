package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class ExpressDecorator extends AbstractTaxiOrderDecorator {
    public ExpressDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal gotCost() {
        return super.gotCost().add(new BigDecimal(5));
    }

    @Override
    public String gotDescription() {
        return super.gotDescription() + " express service";
    }
}
