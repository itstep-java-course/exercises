package com.itstep.oop.principles.encapsulation;

import com.itstep.oop.principles.encapsulation.v2.Car;
import com.itstep.oop.principles.encapsulation.v2.TransmissionController;

public class Driver2 {

    public static void main(String[] args) {
        TransmissionController transmissionController = new TransmissionController();

        Car car = new Car(transmissionController);

        car.startEngine();

        car.addGas();
        System.out.println("The car speed is: " + car.getSpeed());

        car.addGas();
        System.out.println("The car speed is: " + car.getSpeed());

        car.addGas();
        System.out.println("The car speed is: " + car.getSpeed());

        car.addGas();
        System.out.println("The car speed is: " + car.getSpeed());

        car.addGas();
        System.out.println("The car speed is: " + car.getSpeed());

        car.addGas();
        System.out.println("The car speed is: " + car.getSpeed());

        car.addGas();
        System.out.println("The car speed is: " + car.getSpeed());

        car.addGas();
        System.out.println("The car speed is: " + car.getSpeed());

        car.reduceGas();
        System.out.println("The car speed is: " + car.getSpeed());
        car.reduceGas();
        System.out.println("The car speed is: " + car.getSpeed());
        car.reduceGas();
        System.out.println("The car speed is: " + car.getSpeed());
        car.reduceGas();
        System.out.println("The car speed is: " + car.getSpeed());
        car.reduceGas();
        System.out.println("The car speed is: " + car.getSpeed());
        car.reduceGas();
        System.out.println("The car speed is: " + car.getSpeed());
        car.reduceGas();
        System.out.println("The car speed is: " + car.getSpeed());
        car.reduceGas();
        System.out.println("The car speed is: " + car.getSpeed());

        car.stopEngine();
    }
}
