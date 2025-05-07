package org.example;

import org.example.context.Fibonacci;
import org.example.strategy.*;

public class Main {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        Strategy binetsFormula = new BinetsFormula();
        Strategy iteration = new Iteration();
        Strategy fastDoubling = new FastDoubling();
        Strategy recursive = new Recursive();

        System.out.println("\nRecursive");
        client(fibonacci, recursive, 40);


        System.out.println("\nBinet's Formula");
        for(int n=100000; n<=100000; n=n*10) {
            client(fibonacci, binetsFormula, n);
        }

        System.out.println("\nIteration");
        for(int n=100000; n<=100000; n=n*10) {
            client(fibonacci, iteration, n);
        }

        System.out.println("\nFast Doubling");
        for(int n=100000; n<=100000; n=n*10) {
            client(fibonacci, fastDoubling, n);
        }
    }

    public static void client(Fibonacci fibonacci, Strategy strategy, Integer n) {
        fibonacci.setStrategy(strategy);

        long startTime, endTime;

        System.gc();
        startTime = System.nanoTime();
        System.out.println("n = " + n + " : " + fibonacci.calculate(n));
        endTime = System.nanoTime();
        System.gc();
        System.out.println("Execution Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}