package com.itstep.oop.principles.encapsulation.huk_classwork;

public class CoffeeMachine {

    public void makeCappuccino() {
        addCoffee();
        addMilk();
        addWater();
        addSugar();
    }

    public void makeAmerican() {
        addCoffee();
        addWater();
        addSugar();
    }


    private void addCoffee() {
        System.out.println("Add coffee");
    }

    private void addMilk() {
        System.out.println("Add milk");
    }

    private void addWater() {
        System.out.println("Add water");
    }

    private void addSugar() {
        System.out.println("Add sugar");
    }
}
