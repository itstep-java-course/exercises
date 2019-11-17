package com.itstep.oop.principles.inheritance.templatemethod;

public class PlusOperation extends CalculatorOperation {
    @Override
    double makeCalculation(double val1, double val2) {
        return val1 + val2;
    }
}
