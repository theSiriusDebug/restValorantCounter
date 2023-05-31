package com.example.restValorantConter;

import com.example.restValorantConter.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculatorServiceTest {
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testGetUSD_ValidAmount_ReturnsExpectedResult() {
        long amount = 1000;
        BigDecimal expected = BigDecimal.valueOf(9.99 * amount / 1000);

        BigDecimal result = calculatorService.getUSD(amount);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetUSD_ZeroAmount_ReturnsErrorValue() {
        long amount = 0;
        BigDecimal expected = BigDecimal.valueOf(-1);

        BigDecimal result = calculatorService.getUSD(amount);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetUSD_InvalidAmount_ReturnsErrorValue() {
        long amount = 20000;
        BigDecimal expected = BigDecimal.valueOf(-1);

        BigDecimal result = calculatorService.getUSD(amount);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetUAH_ValidAmount_ReturnsExpectedResult() {
        long amount = 1000;
        BigDecimal expected = BigDecimal.valueOf(320.0 * amount / 1825.0);

        BigDecimal result = calculatorService.getUAH(amount);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetUAH_ZeroAmount_ReturnsErrorValue() {
        long amount = 0;
        BigDecimal expected = BigDecimal.valueOf(-1);

        BigDecimal result = calculatorService.getUAH(amount);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetUAH_InvalidAmount_ReturnsErrorValue() {
        long amount = 15000;
        BigDecimal expected = BigDecimal.valueOf(-1);

        BigDecimal result = calculatorService.getUAH(amount);

        Assertions.assertEquals(expected, result);
    }
}
