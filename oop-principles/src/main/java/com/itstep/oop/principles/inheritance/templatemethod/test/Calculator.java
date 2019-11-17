package com.itstep.oop.principles.inheritance.templatemethod.test;

import com.itstep.oop.principles.inheritance.templatemethod.CalculatorOperation;
import com.itstep.oop.principles.inheritance.templatemethod.MinusOperation;
import com.itstep.oop.principles.inheritance.templatemethod.PlusOperation;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("The sum is: " + calculate("22", "+", "33"));
        System.out.println("The diff is: " + calculate("12", "-", "7"));

        System.out.println("The error should occur: " + calculate("2", "/", "0"));
    }

    private static double calculate(String val1, String sign, String val2) {
        CalculatorOperation calculatorOperation = defineOperation(sign);

        return calculatorOperation.calculate(val1, val2);
    }

    private static CalculatorOperation defineOperation(String sign) {
        switch (sign) {
            case "+":
                return new PlusOperation();
            case "-":
                return new MinusOperation();
            default:
                throw new RuntimeException("Unknown operation");
        }
    }
}
