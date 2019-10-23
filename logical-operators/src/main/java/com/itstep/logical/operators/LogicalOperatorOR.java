package com.itstep.logical.operators;

public class LogicalOperatorOR {
    public static void main(String[] args) {
        if (isSunny() || hasUmbrella()) {
            goOutside();
        } else {
            stayAtHome();
        }
    }

    private static boolean isSunny() {
        System.out.println("Is sunny method is called.");
        return false;
    }

    private static boolean hasUmbrella() {
        System.out.println("Has umbrella method is called.");
        return false;
    }

    private static void goOutside() {
        System.out.println("Cool. I'm going for a walk");
    }

    private static void stayAtHome() {
        System.out.println("I will stay at home");
    }

    // isSunny = true, hasUmbrella = true - go outside (executed 1 condition methods)
    // isSunny = true, hasUmbrella = false - go outside (executed 1 condition methods)
    // isSunny = false, hasUmbrella = true - go outside (executed 2 condition methods)
    // isSunny = false, hasUmbrella = false - stay at home (executed 2 condition methods)
}
