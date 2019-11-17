package com.itstep.oop.principles.inheritance.fields;

public class Test {

    public static void main(String[] args) {
        HomoSapiens homoSapiens = new HomoSapiens();
        Human human = new Human();

        homoSapiens.setName("homo");
        human.setName("human");


        System.out.println(homoSapiens.getName());
        System.out.println(human.getName());
        System.out.println(human.getHomoSapiensName());
    }
}
