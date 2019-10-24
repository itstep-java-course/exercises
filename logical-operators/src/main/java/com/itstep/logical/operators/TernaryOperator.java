package com.itstep.logical.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        String decision = hasMoney() ? drinkBeer() : stayAtHome();

        System.out.println(decision);
    }

    private static boolean hasMoney() {
        return true;
    }

    private static String drinkBeer() {
        return "drink beer";
    }

    private static String stayAtHome() {
        return "stay at home";
    }
}
