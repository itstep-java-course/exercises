package com.itstep.cl.object;

public class InitializationOrder {

    static {
        System.out.println("static block");
    }

    private static String staticField = initStaticField();


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
        InitializationOrder order = new InitializationOrder();

        System.out.println(order);
    }

    private String initNonStaticField() {
        System.out.println("non static field");
        return "s";
    }


}
