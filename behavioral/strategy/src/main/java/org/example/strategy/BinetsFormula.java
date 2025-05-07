package org.example.strategy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class BinetsFormula implements Strategy {

    @Override
    public BigInteger solveProblem(Integer n) {
        MathContext precision = new MathContext(1000);

        BigDecimal sqrt5 = new BigDecimal(Math.sqrt(5), precision);
        BigDecimal a = BigDecimal.ONE.add(sqrt5).divide(BigDecimal.valueOf(2), precision);
        BigDecimal b = BigDecimal.ONE.subtract(sqrt5).divide(BigDecimal.valueOf(2), precision);

        BigDecimal aPowN = a.pow(n, precision);
        BigDecimal bPowN = b.pow(n, precision);

        BigDecimal result = aPowN.subtract(bPowN).divide(sqrt5, precision);

        return result.setScale(0, BigDecimal.ROUND_HALF_UP).toBigInteger();
    }
}
