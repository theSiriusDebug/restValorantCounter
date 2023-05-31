package com.example.restValorantConter;

import java.math.BigDecimal;

@org.springframework.stereotype.Service
public class CalculatorService {
    public BigDecimal getUSD(long amount) {
        if (amount <= 9650 && amount > 0) {
            return BigDecimal.valueOf(amount <= 475 ? Math.round(9.99 / 1000 * amount) :
                    amount <= 1000 ? 9.99 / 1000 * amount :
                            amount <= 2050 ? 19.99 / 2050 * amount :
                                    amount <= 3650 ? 34.99 / 3650 * amount :
                                            amount <= 5350 ? 49.99 / 5350 * amount : 99.99 / 11000 * amount);
        } else {
            return BigDecimal.valueOf(-1);
        }
    }

    public BigDecimal getUAH(long amount) {
        if (amount <= 11000 && amount > 0) {
            return BigDecimal.valueOf(amount <= 420 ? Math.round(80.0 / 420.0 * amount) :
                    amount <= 880 ? 160.0 / 880.0 * amount :
                            amount <= 1825 ? 320.0 / 1825.0 * amount :
                                    amount <= 3225 ? 560.0 / 3225.0 * amount :
                                            amount <= 4650 ? 800.0 / 4650.0 * amount : 1600.0 / 9650.0 * amount);
        } else {
            return BigDecimal.valueOf(-1);
        }
    }
}
