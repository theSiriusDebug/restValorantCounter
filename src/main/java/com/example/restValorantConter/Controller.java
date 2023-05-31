package com.example.restValorantConter;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@RestController
public class Controller {
    @Autowired
    private CalculatorService service;
    private static final Logger logger = Logger.getLogger(Controller.class);

    @Autowired
    public Controller(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/uah/{amount}")
    public String getUAH(@PathVariable @Positive long amount) {
        long startTime = System.nanoTime();
        logger.info(String.format("Received request for UAH calculation with amount: %s", amount));

        BigDecimal resultCalculation = service.getUAH(amount);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        if (resultCalculation.compareTo(BigDecimal.ZERO) >= 0) {
            logger.info(String.format("Successfully calculated UAH. Result: %s", resultCalculation));
            logger.info(String.format("Request execution time: %d ns", executionTime));
            return resultCalculation.toString();
        } else {
            logger.info(String.format("Unsuccessful UAH calculation. Result: %s", resultCalculation));
            logger.info(String.format("Request execution time: %d ns", executionTime));
            return "Amount exceeds the specified maximum capacity.";
        }
    }

    @GetMapping("/usd/{amount}")
    public String getUSD(@PathVariable @Positive long amount) {
        long startTime = System.nanoTime(); // Засекаем время начала выполнения запроса
        logger.info(String.format("Received request for USD calculation with amount: %s", amount));

        BigDecimal resultCalculation = service.getUSD(amount);

        long endTime = System.nanoTime(); // Засекаем время окончания выполнения запроса
        long executionTime = endTime - startTime; // Вычисляем время выполнения запроса в наносекундах

        if (resultCalculation.compareTo(BigDecimal.ZERO) >= 0) {
            logger.info(String.format("Successfully calculated USD. Result: %s", resultCalculation));
            logger.info(String.format("Request execution time: %d ns", executionTime));
            return resultCalculation.toString();
        } else {
            logger.info(String.format("Unsuccessful USD calculation. Result: %s", resultCalculation));
            logger.info(String.format("Request execution time: %d ns", executionTime));
            return "Amount exceeds the specified maximum capacity.";
        }
    }
}
