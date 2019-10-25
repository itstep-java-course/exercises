package com.itstep.control.structures;

public class ControlOperatorIfElse {

    public static void main(String[] args) {
        //if
        boolean condition = false;
        boolean condition2 = true;

        if (condition) {
            System.out.println("condition is true");
        } else {
            System.out.println("condition is false");
        }

        //if else
        if (condition) {
            System.out.println("condition is true");
        } else if (condition2) {
            System.out.println("condition2 is true");
        } else {
            System.out.println("condition and condition2 are false");
        }
    }
}
