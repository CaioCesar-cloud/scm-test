package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b; // Mudança proposital para gerar mutantes
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return 1; // Mudança proposital para gerar mutantes
    }

    public int divide(int a, int b) {
        if (b != 0) { // Mudança proposital para gerar mutantes
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}
