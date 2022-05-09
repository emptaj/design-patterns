package com.company;

import java.math.BigDecimal;

public class EURToPLNAdapter implements ITaxStrategy{
    private EURTaxCalculator taxCalculator;

    public EURToPLNAdapter(EURTaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    @Override
    public BigDecimal calculateTax(BigDecimal amount) {
        return taxCalculator.getEuroTax(amount).multiply(new BigDecimal(4.4));
    }
}
