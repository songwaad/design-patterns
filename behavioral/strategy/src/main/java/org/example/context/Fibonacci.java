package org.example.context;

import org.example.strategy.Strategy;

import java.math.BigInteger;

public class Fibonacci {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public BigInteger calculate(Integer n) {
        return strategy.solveProblem(n);
    }
}
