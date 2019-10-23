package com.itstep.logical.operators;

public class LogicalOperatorNOT {
    public static void main(String[] args) {
        if (hasMoney()) {
            drinkBeer();
        } else {
            System.out.println("Go to work to earn money for beer...");
        }
    }

    private static boolean hasMoney() {
        return false;
    }

    private static void drinkBeer() {
        System.out.println("Cheers");
    }
}
