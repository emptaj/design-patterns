package com.company;

import java.math.BigDecimal;

public class EURTaxCalculator {
    public BigDecimal getEuroTax(BigDecimal amount) {
        return amount.divide(new BigDecimal(2));
    }
}
