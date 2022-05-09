package com.company;

import java.math.BigDecimal;

public interface ITaxStrategy {
    public BigDecimal calculateTax(BigDecimal amount);

}
