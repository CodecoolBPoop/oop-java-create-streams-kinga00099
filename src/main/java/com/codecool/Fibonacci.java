package com.codecool;

import java.util.function.Supplier;

public class Fibonacci implements  Supplier<Integer> {
    private int current = 1;
    private int previous = 0;

    @Override
    public Integer get() {
        int result = current;
        current = previous + current;
        previous = result;
        return result;
    }
}