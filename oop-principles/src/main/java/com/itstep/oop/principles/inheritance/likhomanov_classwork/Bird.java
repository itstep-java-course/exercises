package com.itstep.oop.principles.inheritance.likhomanov_classwork;

abstract class Bird {

    private String name;

    Bird(String name) {
        this.name = name;
    }

    abstract void makeSound();

    abstract void fly();
}
