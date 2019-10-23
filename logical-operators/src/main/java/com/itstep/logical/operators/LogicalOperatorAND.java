package com.itstep.logical.operators;

public class LogicalOperatorAND {

    public static void main(String[] args) {
        if (hasDriver() && hasGas()) {
            run();
        } else {
            waiting();
        }
    }

    private static boolean hasGas() {
        System.out.println("Has gas is called");
        return true;
    }

    private static boolean hasDriver() {
        System.out.println("Has driver is called");
        return false;
    }

    private static void run() {
        System.out.println("Run car");
    }

    private static void waiting() {
        System.out.println("Waiting for smt.");
    }

    // hasDriver = true, hasGas = true - run car (executed 2 condition methods)
    // hasDriver = true, hasGas = false - waiting for gas (executed 2 condition methods)
    // hasDriver = false, hasGas = true - waiting for driver (executed 1 condition methods)
    // hasDriver = false, hasGas = false - waiting for driver and gas (executed 1 condition methods)
}
