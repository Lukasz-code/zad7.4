package com.kodilla.steam.sand;

import java.math.BigDecimal;

public class Europe implements SandStorage{
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("12345678901234567890");
        return sandQuantity;
    }
}
