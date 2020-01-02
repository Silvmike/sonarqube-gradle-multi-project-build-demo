package ru.test;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MultiplyExpression implements Expression {

    private final Arguments arguments;

    @Override
    public Integer calculate() {
        return arguments.getIntegers().stream().reduce(1, (a,b) -> a * b);
    }

    public void anotherNotCoveredAndNotUsedPublicMethod() {

        System.out.println("Hello, world!");
    }
}
