package com.itstep.oop.principles.inheritance.likhomanov_classwork;

abstract class FlyingBird extends Bird {

    FlyingBird (String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("Лечу");
    }
}
