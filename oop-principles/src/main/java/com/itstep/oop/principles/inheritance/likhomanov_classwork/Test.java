package com.itstep.oop.principles.inheritance.likhomanov_classwork;

public class Test {

    public static void main(String[] args) {
        Bird bird = new Duck("Утка");
        bird.fly();
        bird.makeSound();

        bird = new Chicken("Курица");
        bird.fly();
        bird.makeSound();
    }
}
