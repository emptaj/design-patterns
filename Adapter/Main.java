package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal(20000);

        LineTaxStrategy lineTaxStrategy = new LineTaxStrategy();
        ProgressiveTaxStrategy progressiveTaxStrategy = new ProgressiveTaxStrategy();

        EURToPLNAdapter eurToPLNAdapter = new EURToPLNAdapter(new EURTaxCalculator());

        System.out.println(eurToPLNAdapter.calculateTax(amount));
        System.out.println(lineTaxStrategy.calculateTax(amount));
    }
}
