package com.itstep.oop.principles.inheritance.constructorinit;

class Human extends TwoLegsHomoSapiens {
    Human(String name) {
        super(name);

        System.out.println("Human constructor initialized");
    }
}
