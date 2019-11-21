package com.itstep.oop.principles.inheritance.likhomanov_classwork;

class Duck extends FlyingBird {

    Duck(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Кря-кря");
    }
}
