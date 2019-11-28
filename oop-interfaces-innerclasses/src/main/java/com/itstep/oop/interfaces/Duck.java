package com.itstep.oop.interfaces;

public class Duck implements Flyable, Kryakaushee {


    @Override
    public void fly() {
    }

    @Override
    public void krya() {

    }

    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.fly();
        duck.krya();



        Flyable duck2 = new Duck();

        duck2.fly();
//        duck2.krya();

        Kryakaushee duck3 = new Duck();

//        duck3.fly();
        duck3.krya();



    }
}
