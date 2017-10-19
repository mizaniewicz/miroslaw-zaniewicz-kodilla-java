package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class ChildSeatDecorator extends AbstractTaxiOrderDecorator {
    public ChildSeatDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal gotCost() {
        return super.gotCost().add(new BigDecimal(2));
    }

    @Override
    public String gotDescription() {
        return super.gotDescription() + " + child seat";
    }
}
