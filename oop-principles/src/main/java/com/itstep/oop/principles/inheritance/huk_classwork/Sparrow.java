package com.itstep.oop.principles.inheritance.huk_classwork;

 class Sparrow extends Flying {
     Sparrow(String name, String color) {
        super(name, color);
    }



     @Override
    void makeSound() {
        System.out.println("Чик-Чирик");
    }
}
