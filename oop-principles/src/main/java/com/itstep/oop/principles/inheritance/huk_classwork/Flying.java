package com.itstep.oop.principles.inheritance.huk_classwork;

abstract class Flying extends  Animal {


    public Flying(String name, String color) {
        super(name, color);
    }


    @Override
    public void flyOrWalk() {
        System.out.println("Умею летать, не умею ходить");
    }

}
