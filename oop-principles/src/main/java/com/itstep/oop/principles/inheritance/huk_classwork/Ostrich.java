package com.itstep.oop.principles.inheritance.huk_classwork;

public class Ostrich extends Walking {
    public Ostrich(String name, String color) {
        super(name, color);
    }

    @Override
    void makeSound() {
        System.out.println("Фью-Фью");
    }
}
