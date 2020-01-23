package com.itstep;

import java.util.function.Supplier;

//https://habr.com/ru/post/224593/
public class ConstructorReferenceExample {

    public static void main(String[] args) {
        makeCar(Car::new);
    }

    private static void makeCar(Supplier<Car> supplier) {
        final Car car = supplier.get();

        car.runCar();
    }

    private static class Car {

        private String model;

        public Car(String model) {
            this.model = model;
        }

        public Car() {

        }

        public void runCar() {
            System.out.println("grn grn ...");
        }
    }
}
