package com.kodilla;

public class Calculator {

    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subSmallerFromBigger(int a, int b) {
        return (a > b || a == b) ? (a - b) : (b - a);
    }
}
