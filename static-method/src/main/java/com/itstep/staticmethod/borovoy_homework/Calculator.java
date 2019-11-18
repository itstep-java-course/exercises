package com.itstep.staticmethod.borovoy_homework;

public class Calculator {

    private double value1;
    private double value2;
    private String sign;

    private Calculator(double value1, double value2, String sign) {
        this.value1 = value1;
        this.value2 = value2;
        this.sign = sign;
        double result = 0;

        if (sign.equals("+")) {
            result = value1 + value2;
        } else if (sign.equals("-")) {
            result = value1 - value2;
        } else if (sign.equals("/")) {
            result = value1 / value2;
        } else if (sign.equals("*")) {
            result = value1 * value2;
        }
        System.out.println(result);
    }


    public static void main(String[] args) {

        Calculator plus = new Calculator(2, 5, "+");
        Calculator minus = new Calculator(10, 1, "-");
        Calculator divide = new Calculator(15, 3, "/");
        Calculator multiply = new Calculator(6, 6, "*");
    }
}
