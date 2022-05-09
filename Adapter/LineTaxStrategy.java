package com.company;

import java.math.BigDecimal;

public class LineTaxStrategy implements ITaxStrategy{
    @Override
    public BigDecimal calculateTax(BigDecimal amount) {
        BigDecimal percentage = new BigDecimal(19);
        BigDecimal result = amount.multiply(percentage).divide(new BigDecimal(100));
        return result;
    }
}
