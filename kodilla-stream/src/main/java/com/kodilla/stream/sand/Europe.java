package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Europe implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("123213481235123123");
        return sandQuantity;
    }
}
