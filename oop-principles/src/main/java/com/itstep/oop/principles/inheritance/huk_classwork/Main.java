package com.itstep.oop.principles.inheritance.huk_classwork;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Sparrow("Воробей", "Серый");
        System.out.println(animal.getName() + " " + animal.getColor());
        animal.fly();
        animal.makeSound();
        System.out.println("======================================");

        animal =new Ostrich("Страус","Белый");
        System.out.println(animal.getName() + " " + animal.getColor());
        animal.fly();
        animal.makeSound();

    }
}
