package com.itstep.oop.principles.encapsulation;

public class Car {

    private int carSpeed;
    private int currentTransmissionNumber;

    public Car() {
        this.carSpeed = 0;
        this.currentTransmissionNumber = 0;
    }

    // ======= кнопка старт - стоп
    public void startEngine() {
        System.out.println("The engine has been started by driver");
    }

    public void stopEngine() {
        if (carSpeed != 0) {
            throw new RuntimeException("Can't stop engine. Please stop the car before");
        }
        System.out.println("The engine has been stopped by driver");
    }
    // ======= кнопка старт - стоп

    // ======= педаль газа
    public void addGas() {
        controlTransmission(carSpeed);

        carSpeed += 10;
    }

    public void reduceGas() {
        carSpeed -= 10;
        controlTransmission(carSpeed);
    }
    // ======= педаль газа

    //спидометр
    public int getSpeed() {
        return carSpeed;
    }
    //спидометр

    //управление сцеплением и трансмиссией
    private void controlTransmission(int carSpeed) {
        if (carSpeed == 0) {
            pushClutch();
            setTransmission(1);
        } else if (carSpeed == 30) {
            pushClutch();
            setTransmission(2);
        } else if (carSpeed == 50) {
            pushClutch();
            setTransmission(3);
        } else if (carSpeed > 70) {
            pushClutch();
            setTransmission(4);
        }
    }

    private void pushClutch() {
        System.out.println("The clutch has been pushed by car");
    }

    private void setTransmission(int number) {
        if (number - currentTransmissionNumber > 1) {
            throw new RuntimeException("заглохла... брббббрбрбрб");
        }
        System.out.println("The transmission number: " + number + " is being set");
        currentTransmissionNumber = number;
    }
    //управление сцеплением и трансмиссией
}
