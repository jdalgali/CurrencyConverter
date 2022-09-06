package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Currency test = new Currency("CHF", BigDecimal.valueOf(10), BigDecimal.valueOf(1.02));
        System.out.println(test.getCurrencyCode() + " " + test.getAmount());
        System.out.println(test.getRate());
    }
}