package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class VipDecorator extends AbstractTaxiOrderDecorator {
    public VipDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal gotCost() {
        return super.gotCost().add(new BigDecimal(10));
    }

    @Override
    public String gotDescription() {
        return super.gotDescription() + " variant VIP";
    }
}
