package com.itstep.oop.inner;

public class Test {
    public static void main(String[] args) {
        Car.Engine.E obj = new Car().new Engine().new E();

        System.out.println(obj);
    }
}
