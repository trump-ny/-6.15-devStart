package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.service.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    static Logger log = LoggerFactory.getLogger("Application");

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();

        log.info("sum result = {}", calculatorService.sum(3, 4));
        log.info("sub result = {}", calculatorService.sub(3, 4));
        log.info("div result = {}", calculatorService.div(8, 4));
        log.info("multiplication result = {}", calculatorService.multiplication(8, 4));
    }

}

