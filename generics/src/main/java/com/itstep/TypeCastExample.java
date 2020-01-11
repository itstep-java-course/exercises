package com.itstep;

import java.util.ArrayList;
import java.util.List;

public class TypeCastExample {
    public static void main(String[] args) {
        Car car = new Car("X6");
        Car fourWheelCar = new FourWheelDriveCar("X3");

        FourWheelDriveCar fourWheelDriveCar = new FourWheelDriveCar("X3");


        runCar(fourWheelDriveCar);

        runCar((FourWheelDriveCar) fourWheelCar);
        runCar((FourWheelDriveCar) car);

//        String str = "eee";
//        Integer x = (Integer) str;


        List rawList = new ArrayList();
        rawList.add("8");
        rawList.add(8);

        String s = (String) rawList.get(0);
        System.out.println(s);
        Integer i = (Integer) rawList.get(1);
        System.out.println(i);


        Integer iError = (Integer) rawList.get(0);
        System.out.println(iError);


    }

//    private static void runCar(Car car) {
//
//    }

    private static void runCar(FourWheelDriveCar car) {

    }

    private static class Car {
        protected final String model;

        private Car(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    '}';
        }
    }

    private static class FourWheelDriveCar extends Car {
        private Integer countOfDriveWheel = 4;

        private FourWheelDriveCar(String model) {
            super(model);
        }

        @Override
        public String toString() {
            return "FourWheelDrive{" +
                    "model='" + model + '\'' +
                    ", countOfDriveWheel=" + countOfDriveWheel +
                    '}';
        }
    }
}
