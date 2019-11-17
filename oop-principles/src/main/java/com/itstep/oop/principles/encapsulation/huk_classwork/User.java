package com.itstep.oop.principles.encapsulation.huk_classwork;

public class User {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        System.out.println("We do american: ");
        coffeeMachine.makeAmerican();
        System.out.println("Your american is ready, take it!!!");
        System.out.println("===========================");
        System.out.println("We do cappuccino: ");
        coffeeMachine.makeCappuccino();
        System.out.println("Your cappuccino is ready, take it!!!");

    }
}
