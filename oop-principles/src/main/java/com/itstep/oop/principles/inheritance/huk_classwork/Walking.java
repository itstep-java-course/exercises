package com.itstep.oop.principles.inheritance.huk_classwork;

abstract class Walking extends Animal {
    public Walking(String name, String color) {
        super(name, color);
    }

  @Override
    void fly(){
      System.out.println("Умею ходить, не умею летать");
  }
}
