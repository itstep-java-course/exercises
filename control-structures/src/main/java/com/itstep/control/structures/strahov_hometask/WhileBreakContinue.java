package com.itstep.control.structures.strahov_hometask;

public class WhileBreakContinue {
    public static void main(String[] args) {
        int i = 20;
        while (i > 0) {
            if (i % 2 != 0) {
                i--;
                continue;
            } else if (i == 2) {
                break;
            }
            System.out.println("i=" + i);
            i--;
        }
    }
}

