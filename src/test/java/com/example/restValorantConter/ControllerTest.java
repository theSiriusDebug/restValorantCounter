package com.example.restValorantConter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

public class ControllerTest {
    @Mock
    private CalculatorService calculatorService;

    @InjectMocks
    private Controller controller;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUAH() {
        long amount = 100;

        when(calculatorService.getUAH(anyLong())).thenReturn(BigDecimal.valueOf(250));

        String result = controller.getUAH(amount);

        assertEquals("250", result);
    }

    @Test
    public void testGetUSD() {
        long amount = 100;

        when(calculatorService.getUSD(anyLong())).thenReturn(BigDecimal.valueOf(50));

        String result = controller.getUSD(amount);

        assertEquals("50", result);
    }
}
