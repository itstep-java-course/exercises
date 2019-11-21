package com.itstep.oop.principles.inheritance.likhomanov_classwork;

class Chicken extends NotFlyingBird {

    Chicken(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Ко-ко-ко");
    }
}
