package com.itstep.control.structures.shyrkov_classwork;

public class IfElseTask {
    public static void main(String[] args) {

        int x = 3;
        if (x == 6)
            System.out.println("6");
        else if (x <= 5) {
            System.out.println("x<=5");
            if (x == 3)
                System.out.println("3");
        } else
            System.out.println("0");

    }


}
