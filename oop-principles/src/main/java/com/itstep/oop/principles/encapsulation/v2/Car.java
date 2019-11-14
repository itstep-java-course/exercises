package com.itstep.oop.principles.encapsulation.v2;

public class Car {

    private int carSpeed;
    private int currentTransmissionNumber;
    private TransmissionController transmissionController;

    public Car(TransmissionController transmissionController) {
        this.carSpeed = 0;
        this.currentTransmissionNumber = 0;
        this.transmissionController = transmissionController;
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
        transmissionController.controlTransmission(carSpeed, currentTransmissionNumber);

        carSpeed += 10;
    }

    public void reduceGas() {
        carSpeed -= 10;
        transmissionController.controlTransmission(carSpeed, currentTransmissionNumber);
    }
    // ======= педаль газа

    //спидометр
    public int getSpeed() {
        return carSpeed;
    }
    //спидометр
}
