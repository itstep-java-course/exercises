package com.itstep.control.structures.huk_homework;

public class BreakContinueTask {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("The value of i is: " + i);
            } else if (i == 10) {
                continue;
            } else if (i == 19) {
                break;
            } else {
                System.out.println("Error");
            }
        }
    }
}
