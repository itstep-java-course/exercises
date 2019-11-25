package com.itstep.oop.interfaces;

public class Test {

    public static void main(String[] args) {
        SedanCar bmw = new BMW();

        Mercedes mercedes = new Mercedes();
        String carCase = bmw.getCarCase();

        System.out.println(carCase);
        System.out.println(mercedes.getCarCase());


    }
}
