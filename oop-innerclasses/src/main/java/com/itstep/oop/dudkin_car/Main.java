package com.itstep.oop.dudkin_car;

import com.itstep.oop.dudkin_car.proga_insides.Parameters;
import com.itstep.oop.dudkin_car.proga_insides.Transport;

public class Main {
    public static void main(String[] args) {
        Parameters parameters = new Parameters() {
            public int speedOfOneWheel() {
                return 20;
            }

            public String model() {
                return "BMW";
            }
        };
        Transport.Bike newBike = new Transport(parameters.model(), parameters.speedOfOneWheel()).new Bike();
        Transport.Bike newBike2 = new Transport(parameters.model(), parameters.speedOfOneWheel()).new Bike();
        Transport.Car newCar = new Transport(parameters.model(), parameters.speedOfOneWheel()).new Car();
        Transport.Car newCar1 = new Transport(parameters.model(), parameters.speedOfOneWheel()).new Car();
        Transport.Car newCar2 = new Transport(parameters.model(), parameters.speedOfOneWheel()).new Car();
        newBike.showModel();
        newBike.showSpeed();
        newCar.showModel();
        newCar.showSpeed();
        Transport.ShowCharacteristic.showCounter();
    }

}
