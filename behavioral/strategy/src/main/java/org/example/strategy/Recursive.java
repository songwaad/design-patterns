package org.example.strategy;

import java.math.BigInteger;

public class Recursive implements Strategy {
    @Override
    public BigInteger solveProblem(Integer n) {
        if (n <= 0) {
            return BigInteger.ZERO;
        }
        if (n == 1) {
            return BigInteger.ONE;
        }

        // เรียก recursive โดยใช้ BigInteger.add() สำหรับการบวก
        return solveProblem(n - 1).add(solveProblem(n - 2));
    }
}
