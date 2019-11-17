package com.itstep.oop.principles.inheritance.constructorinit;

public class Test {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("HomoSapiens creation");
        HomoSapiens homoSapiens = new HomoSapiens("name");

        System.out.println();
        System.out.println("TwoLegsHomoSapiens creation");
        HomoSapiens twoLegsHomoSapiens = new TwoLegsHomoSapiens("name");

        System.out.println();
        System.out.println("Human creation");
        HomoSapiens human = new Human("name");
    }
}
