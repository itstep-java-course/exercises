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


    public void addCoffee() {
        System.out.println("Add coffee");
    }

    public void addMilk() {
        System.out.println("Add milk");
    }

    public void addWater() {
        System.out.println("Add water");
    }

    public void addSugar() {
        System.out.println("Add sugar");
    }
}
