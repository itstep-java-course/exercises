package com.itstep.cl.object;

public class Calculator {
    private int value1;
    private int value2;

    public Calculator(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int add() {
        return value1 + value2;
    }

    public int minus() {
        return value1 - value2;
    }
}
