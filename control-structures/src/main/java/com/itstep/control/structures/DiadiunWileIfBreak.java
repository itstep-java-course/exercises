package com.itstep.control.structures;

public class DiadiunWileIfBreak {
    public static void main(String[] args) {
        int x = 20;

        while (x > 0) {
            if (x % 2 != 0) {
                x--;
                continue;
            } else if (x == 2) {
                break;
            }

            System.out.println("X=" + x);
            x--;
        }
    }
}





