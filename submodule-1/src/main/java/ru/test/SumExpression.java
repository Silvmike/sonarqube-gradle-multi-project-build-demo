package ru.test;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SumExpression implements Expression {

    private final Arguments arguments;

    @Override
    public Integer calculate() {
        return arguments.getIntegers().stream().reduce(0, (a,b) -> a + b);
    }
}
