package com.itstep.control.structures;

public class ControlOperatorContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("The value of i is: " + i);
        }
    }
}
