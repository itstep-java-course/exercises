package com.itstep.control.structures;

public class ControlOperatorBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("The value of i is: " + i);
        }
    }
}
