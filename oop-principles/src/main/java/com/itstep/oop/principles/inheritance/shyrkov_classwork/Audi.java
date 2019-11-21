package com.itstep.oop.principles.inheritance.shyrkov_classwork;

public class Audi extends Car{

    public Audi(String model, double maxSpeed) {
        super("Audi",model,maxSpeed);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine is started with key");
    }
}
