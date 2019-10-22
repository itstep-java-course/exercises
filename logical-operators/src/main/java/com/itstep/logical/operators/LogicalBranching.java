package com.itstep.logical.operators;

public class LogicalBranching {
    public static void main(String[] args) {
        if (hasMoney()) {
            letsDrink();
        } else if (myFriendHasMoney()) {
            letsDrink();
        } else if (freeBeer()) {
            letsDrink();
        } else {
            System.out.println("Go to work to earn money for beer...");
        }
    }

    private static boolean hasMoney() {
        System.out.println("I have money");
        return true;
    }

    private static boolean myFriendHasMoney() {
        System.out.println("My friend has money");
        return true;
    }

    private static boolean freeBeer() {
        System.out.println("There is free beer");
        return true;
    }

    private static void letsDrink() {
        System.out.println("We are going to drink a lot");
    }
}
