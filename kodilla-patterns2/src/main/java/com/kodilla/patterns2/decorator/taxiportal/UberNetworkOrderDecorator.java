package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class UberNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public UberNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal gotCost() {
        return super.gotCost().add(new BigDecimal(20));
    }

    @Override
    public String gotDescription() {
        return super.gotDescription() + " by Uber Network";
    }
}
