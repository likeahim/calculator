package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {

        SpringApplication.run(CalculatorApplication.class, args);
        Calculator calc = new Calculator();
        int a = 10;
        int b = 5;
        System.out.println(calc.addAToB(a, b));
        System.out.println(calc.subSmallerFromBigger(a, b));
    }

}
