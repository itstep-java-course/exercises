package com.itstep.oop.principles.inheritance.shyrkov_classwork;

public class Test {
    public static void main(String[] args) {
        Car bmw = new BMW("X5", 240);
        Car audi = new Audi("A3", 220);

        bmw.getCarInfo();
        bmw.startEngine();

        audi.getCarInfo();
        audi.startEngine();
    }
}
