package com.itstep.cl.object;

public class InitializationOrder {

    private static String staticField = initStaticField();

    static {
        System.out.println("static block");
    }

    private String nonStaticField = initNonStaticField();

    {
        System.out.println("non static block");
    }

    public InitializationOrder() {
        System.out.println("Constructor");
    }

    private static String initStaticField() {
        System.out.println("static field");
        return "s";
    }

    public static void main(String[] args) {
        new InitializationOrder();
    }

    private String initNonStaticField() {
        System.out.println("non static field");
        return "s";
    }


}
