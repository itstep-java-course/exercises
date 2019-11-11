package com.itstep.cl.object.huk_homework;

public class Main {
    public static void main(String[] args) {//метод Main
        Reverser reverser = new Reverser("hello");
        System.out.println("String inputString = " + reverser.doReverse());
        System.out.println("=========================================================================================");


        //Date date = new Date();

        Car volvo = new Car("S90 Momentum Pro ", "Sedan ", "Metallic", 5, 252_100_000, 204.00, "2016-11-13");
        Car opel = new Car("Astra Enjoy Plus ", "Sedan ", "Silver ", 5, 442_000_000, 207.00, "2017-12-16");
        Car bmw = new Car("X7 30d xDrive ", "Сrossover ", "Black ", 5, 212_100_000, 245.00, "2018-10-17");

        System.out.println(volvo.getCarInfo());
        System.out.println(opel.getCarInfo());
        System.out.println(bmw.getCarInfo());


//        String carInfo = volvo.getCarInfo();
//        String carInfo1 = opel.getCarInfo();
//        String carInfo2 = bmw.getCarInfo();
//
//        System.out.println(carInfo);
//        System.out.println(carInfo1);
//        System.out.println(carInfo2);

    }
}