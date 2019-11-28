package com.itstep.oop.principles.inheritance.shyrkov_classwork;

public class BMW extends Car{

    public BMW(String model, double maxSpeed) {
        super("BMW", model, maxSpeed);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine is started with button");
    }
}
