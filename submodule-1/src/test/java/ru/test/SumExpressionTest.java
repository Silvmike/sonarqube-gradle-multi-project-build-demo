package ru.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SumExpressionTest {

    @Test
    public void simpleTest() {

        Calculator calculator = new SimpleCalculator();
        Integer result = calculator.calculate(
            new SumExpression(
                Arguments.builder()
                        .integers(Arrays.asList(2, 1, 3))
                        .build()
            )
        );
        Assertions.assertEquals(Integer.valueOf(6), result);
    }

}
