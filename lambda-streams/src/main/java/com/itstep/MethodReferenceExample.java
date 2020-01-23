package com.itstep;

//https://habr.com/ru/post/224593/
public class MethodReferenceExample {

    public static void main(String[] args) {
        final Car car = new Car();

        carRunner(car::runCar);
    }

    private static void carRunner(Runnable runnable) {
        runnable.run();
    }

    private static class Car {
        void runCar() {
            System.out.println("car is running...");
        }
    }
}
