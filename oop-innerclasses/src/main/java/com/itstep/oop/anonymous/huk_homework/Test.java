package com.itstep.oop.anonymous.huk_homework;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date carDate = new Date(2018 - 12 - 12);

        Car car = new Car("BMW", "Sedan", "Black", 5, 250_000_000, 300.00, carDate);
        System.out.println(car.getCarInfo());
        car.ride();//Engine started...

        Car.Wheel wheel = new Car("Benz", "Cabriolet", "Grey", 1, 2700000.00, 100.0, carDate).new Wheel(25, "Black");

        AbleToRide bicycle = new AbleToRide() { //Anonymous class
            @Override
            public void ride() {
                System.out.println("Bicycle is riding...");
            }
        };
        bicycle.ride();
    }
}





