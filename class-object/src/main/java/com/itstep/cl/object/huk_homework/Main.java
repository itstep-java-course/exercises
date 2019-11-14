package com.itstep.cl.object.huk_homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {//метод Main
        Reverser reverser = new Reverser("hello");
        System.out.println("String inputString = " + reverser.doReverse());
        System.out.println("=========================================================================================");


        Date date1 = Car.StringToDate("2015-12-06 13:13:00");
        Date date2 = Car.StringToDate("2016-11-06 14:23:00");
        Date date3 = Car.StringToDate("2017-10-06 15:43:00");
        //System.out.println(date1);
        //System.out.println(date2);
        //System.out.println(date3;


        // System.out.println(date);
        //System.out.println(date.toString());

        Car volvo = new Car("S90 Momentum Pro ", "Sedan ", "Metallic", 5, 252_100_000, 204.00,date1);
        Car opel = new Car("Astra Enjoy Plus ", "Sedan ", "Silver ", 5, 442_000_000, 207.00,date2);
        Car bmw = new Car("X7 30d xDrive ", "Сrossover ", "Black ", 5, 212_100_000, 245.00,date3);

        System.out.println(volvo.getCarInfo().toString());
        System.out.println(opel.getCarInfo().toString());
        System.out.println(bmw.getCarInfo().toString());


//        String carInfo = volvo.getCarInfo();
//        String carInfo1 = opel.getCarInfo();
//        String carInfo2 = bmw.getCarInfo();
//
//        System.out.println(carInfo);
//        System.out.println(carInfo1);
//        System.out.println(carInfo2);

    }
}