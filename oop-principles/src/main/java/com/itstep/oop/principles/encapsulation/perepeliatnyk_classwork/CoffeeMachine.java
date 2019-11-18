package com.itstep.oop.principles.encapsulation.perepeliatnyk_classwork;

public class CoffeeMachine {

    public void makeCappuccino(){
        addCoffee();
        addWater();
        addMilk();
        addSugar();
    }

    public void makeAmericano(){
        addCoffee();
        addWater();
        addSugar();
    }

    private void addCoffee(){
        System.out.println("Coffee added");
    }

    private void addMilk(){
        System.out.println("Milk added");
    }

    private void  addWater(){
        System.out.println("Water added");
    }

    private void addSugar(){
        System.out.println("Sugar added");
    }

}


