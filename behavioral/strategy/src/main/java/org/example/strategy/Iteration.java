package org.example.strategy;

import java.math.BigInteger;

public class Iteration implements Strategy {
    @Override
    public BigInteger solveProblem(Integer n) {
        if (n==0) return BigInteger.ZERO;
        if (n==1) return BigInteger.ONE;


        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i=2; i<=n; i++) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }

        return b;
    }
}
