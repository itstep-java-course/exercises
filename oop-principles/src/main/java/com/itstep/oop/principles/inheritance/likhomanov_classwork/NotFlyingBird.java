package com.itstep.oop.principles.inheritance.likhomanov_classwork;

abstract class NotFlyingBird extends Bird {

    NotFlyingBird(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("Не умею летать");
    }
}
