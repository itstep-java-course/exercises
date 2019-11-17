package com.itstep.oop.principles.inheritance.constructorinit;

class HomoSapiens {

    private String name;

    HomoSapiens(String name) {
        this.name = name;

        System.out.println("HomoSapiens constructor initialized");
    }

    public String getName() {
        return name;
    }
}
