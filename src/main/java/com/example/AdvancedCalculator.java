package com.example;

public class AdvancedCalculator {

    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot take square root of a negative number");
        }
        return Math.sqrt(a);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
