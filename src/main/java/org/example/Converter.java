package org.example;

import java.math.BigDecimal;

public class Converter {
    Currency baseCurrency;

    public Converter(Currency baseCurrency){
        this.baseCurrency = baseCurrency;
    }

    private BigDecimal convertTo(BigDecimal rate){
        return baseCurrency.getAmount().multiply(rate);
    }

}
