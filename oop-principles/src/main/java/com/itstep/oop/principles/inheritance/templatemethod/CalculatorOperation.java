package com.itstep.oop.principles.inheritance.templatemethod;

public abstract class CalculatorOperation {

    //default constructor
    public CalculatorOperation() {
    }

    public double calculate(String valueA, String valueB) {
        double val1 = Double.parseDouble(valueA);
        double val2 = Double.parseDouble(valueB);

        return makeCalculation(val1, val2);
    }

    abstract double makeCalculation(double val1, double val2);

}
