package com.itstep.oop.anonymous;

public class CarLauncher {
    public static void main(String[] args) {
        launchCar(new Car() {
            @Override
            public void launch() {
                System.out.println("The car is launched");
            }
        });
    }

    private static void launchCar(Car car) {
        car.launch();
    }
}
