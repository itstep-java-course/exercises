package com.itstep.oop.principles.inheritance.huk_classwork;

abstract class Flying extends  Animal {


    public Flying(String name, String color) {
        super(name, color);
    }


    @Override
    public void fly() {
        System.out.println("Умею летать, не умею ходить");
    }

}
