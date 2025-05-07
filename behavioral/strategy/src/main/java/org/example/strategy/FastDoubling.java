package org.example.strategy;

import java.math.BigInteger;

public class FastDoubling implements Strategy {

    @Override
    public BigInteger solveProblem(Integer n) {
        return fib(BigInteger.valueOf(n))[0];
    }

    public BigInteger[] fib(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) return new BigInteger[]{BigInteger.ZERO, BigInteger.ONE};

        BigInteger[] ab = fib(n.divide(BigInteger.TWO));
        BigInteger a = ab[0];
        BigInteger b = ab[1];

        BigInteger c = a.multiply(b.shiftLeft(1).subtract(a));
        BigInteger d = a.multiply(a).add(b.multiply(b));

        if (n.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            return new BigInteger[]{c,d};
        }

        return new BigInteger[]{d, c.add(d)};
    }
}
