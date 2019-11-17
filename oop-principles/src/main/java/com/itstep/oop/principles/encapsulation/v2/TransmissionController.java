package com.itstep.oop.principles.encapsulation.v2;

public class TransmissionController {

    void controlTransmission(int carSpeed, int currentTransmissionNumber) {
        if (carSpeed == 0) {
            pushClutch();
            setTransmission(1, currentTransmissionNumber);
        } else if (carSpeed == 30) {
            pushClutch();
            setTransmission(2, currentTransmissionNumber);
        } else if (carSpeed == 50) {
            pushClutch();
            setTransmission(3, currentTransmissionNumber);
        } else if (carSpeed > 70) {
            pushClutch();
            setTransmission(4, currentTransmissionNumber);
        }
    }

    private void pushClutch() {
        System.out.println("The clutch has been pushed by car");
    }

    private void setTransmission(int number, int currentTransmissionNumber) {
        if (number - currentTransmissionNumber > 1) {
            throw new RuntimeException("заглохла... брббббрбрбрб");
        }
        System.out.println("The transmission number: " + number + " is being set");
        currentTransmissionNumber = number;
    }
}
