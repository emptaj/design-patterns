package com.company;

import java.math.BigDecimal;

public class ProgressiveTaxStrategy implements ITaxStrategy {
    @Override
    public BigDecimal calculateTax(BigDecimal amount) {
        BigDecimal percentage = new BigDecimal(29);
        BigDecimal result = amount.multiply(percentage).divide(new BigDecimal(100));

        return result;

    }
}
