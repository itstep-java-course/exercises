package com.itstep.oop.dshnurenko_lift;

public class Test {
    public static void main(String[] args) {
        Lift lift = new Lift();

        lift.pressButton("second");
        System.out.println("===================");
        lift.pressButton("fifth");
        System.out.println("===================");
        lift.pressButton("first");
        System.out.println("===================");
        lift.pressButton("fourth");
        System.out.println("===================");
        lift.pressButton("third");
        System.out.println("===================");
        lift.pressButton("fifth");
        System.out.println("===================");
        lift.pressButton("first");
    }
}
