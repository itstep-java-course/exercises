package com.itstep.logical.operators;

public class CombinedOperators {
    public static void main(String[] args) {
        System.out.println("more or equal to 20");
        System.out.println();

        moreOrEqualToTwenty(20);
        moreOrEqualToTwenty(22);
        moreOrEqualToTwenty(15);

        System.out.println("less or equal to 20");
        System.out.println();
        lessOrEqualToTwenty(20);
        lessOrEqualToTwenty(22);
        lessOrEqualToTwenty(15);

        System.out.println("value should be equal to 20");
        System.out.println();
        equalToTwenty(20);
        equalToTwenty(22);
        equalToTwenty(15);

        System.out.println("value should not be equal to 20");
        System.out.println();
        notEqualToTwenty(20);
        notEqualToTwenty(22);
        notEqualToTwenty(15);
    }

    private static void moreOrEqualToTwenty(int value) {
        if (value >= 20) {
            System.out.println("The value is more or equals to 20");
        } else {
            System.out.println("else block");
        }
    }

    private static void lessOrEqualToTwenty(int value) {
        if (value <= 20) {
            System.out.println("The value is less or equals to 20");
        } else {
            System.out.println("else block");
        }
    }

    private static void equalToTwenty(int value) {
        if (value == 20) {
            System.out.println("The value is equal to 20");
        } else {
            System.out.println("else block");
        }
    }

    private static void notEqualToTwenty(int value) {
        if (value != 20) {
            System.out.println("The value is not equal to 20");
        } else {
            System.out.println("else block");
        }
    }
}
