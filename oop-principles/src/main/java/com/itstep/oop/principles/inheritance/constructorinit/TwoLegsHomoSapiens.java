package com.itstep.oop.principles.inheritance.constructorinit;

class TwoLegsHomoSapiens extends HomoSapiens {
    TwoLegsHomoSapiens(String name) {
        super(name);

        System.out.println("TwoLegsHomoSapiens constructor initialized");
    }
}
