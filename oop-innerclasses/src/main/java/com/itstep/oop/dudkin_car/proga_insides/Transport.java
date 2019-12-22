package com.itstep.oop.dudkin_car.proga_insides;

import com.itstep.oop.dudkin_car.proga_insides.Movable;

public class Transport implements Movable {
    int wheels, speedOfOneWheel;
    String model;

    public Transport(String model, int speedOfOneWheel) {
        this.model = model;
        this.speedOfOneWheel = speedOfOneWheel;
    }

    public Transport(String model) {
        this(model, 10);
    }

    Transport() {
        this("unknown");
    }

    public class Car implements ShowCharacteristic {
        public Car() {
            new NumberOfTransport();
            wheels = 4;
        }

        @Override
        public void showSpeed() {
            System.out.println(speedOfOneWheel * wheels);
        }

        @Override
        public void showModel() {
            System.out.println("Car-" + model);
        }
    }

    public class Bike implements ShowCharacteristic {
        public Bike() {
            wheels = 2;
        }

        @Override
        public void showSpeed() {
            System.out.println(speedOfOneWheel * wheels);
        }

        @Override
        public void showModel() {
            System.out.println("Bike-" + model);
        }
    }

    public interface ShowCharacteristic {
        void showSpeed();

        void showModel();

        static void showCounter() {
            Movable.NumberOfTransport.showNumberOfTransport();
        }
    }

}
