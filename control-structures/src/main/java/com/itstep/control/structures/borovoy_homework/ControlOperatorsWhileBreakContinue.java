package com.itstep.control.structures.borovoy_homework;

public class ControlOperatorsWhileBreakContinue {
    public static void main(String[] args) {
        int x = 20;
        while (x > 0) {
            if (x % 2 != 0) {
                x--;
                continue;
            } else if (x == 2) {
                break;
            }
            System.out.println("The value of x is: " + x);
            x--;
        }
    }
}


