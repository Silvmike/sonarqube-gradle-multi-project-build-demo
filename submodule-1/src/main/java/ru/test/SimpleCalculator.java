package ru.test;

import java.util.Arrays; // unused import to be spotted by sonarqube
import java.util.Random;

public class SimpleCalculator implements Calculator {

    @Override
    public Integer calculate(Expression expression) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e); // another issue to be spotted by sonarqube
        }
        return expression.calculate();
    }

    // security issue to be spotted by spotbugs
    public String bug() {
        Random r = new Random();
        return Long.toHexString(r.nextLong());
    }
}
