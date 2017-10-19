package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class MyTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public MyTaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal gotCost() {
        return super.gotCost().add(new BigDecimal(30));
    }

    @Override
    public String gotDescription() {
        return super.gotDescription() + " by MyTaxi Network";
    }
}
