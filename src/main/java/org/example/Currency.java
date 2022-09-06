package org.example;

import java.math.BigDecimal;

public class Currency {
    private String currencyCode;
    private BigDecimal amount;
    private BigDecimal rate;

    public Currency(String currencyCode, BigDecimal amount, BigDecimal rate) {
        this.currencyCode = currencyCode;
        this.amount = amount;
        this.rate = rate;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public BigDecimal getRate() {
        return rate;
    }
}
