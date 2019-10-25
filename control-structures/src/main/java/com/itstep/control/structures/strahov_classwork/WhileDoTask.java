package com.itstep.control.structures.strahov_classwork;

public class WhileDoTask {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 101) {
            System.out.println("The x value is: " + x);
            x++;
        }


        do {
            System.out.println("The x value is: " + y);
            y++;
        } while (y < 101);
    }

}
