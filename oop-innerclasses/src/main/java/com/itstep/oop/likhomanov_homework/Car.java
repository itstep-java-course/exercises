package com.itstep.oop.likhomanov_homework;

class Car {

    private Engine engine;
    private Transmission transmission;
    private GasTank gasTank;

    Car(int consumptionRate, int amountOfGas) {
        engine = new Engine();
        transmission = new Transmission();
        gasTank = new GasTank();

        gasTank.fillTank(new Gas(amountOfGas) {
            @Override
            void burn() {
                reduceVolume(consumptionRate);
            }
        });
    }

    void acceptDriversChoice(int choice) {
        switch (choice) {
            case 1:
                speedUp();
                break;
            case 2:
                slowDown();
                break;
            default:
                stop();
                break;
        }
    }

    private void speedUp() {
        engine.speedUp();
    }

    private void slowDown() {
       engine.slowDown();
    }

    private void stop() {
        engine.fullStop();
    }

    private class Engine {

        private int rpm;

        void speedUp() {
            if (gasTank.hasGas()) {
                increaseRPM();
            } else {
                fullStop();
            }
        }

        void slowDown() {
            if (gasTank.hasGas()) {
                decreaseRPM();
            } else {
                fullStop();
            }
        }

        private void increaseRPM() {
            consumeGas();
            if (rpm < 5000) {
                rpm += 500;
                System.out.println("Current RPM " + rpm);
            } else {
                transmission.increaseGear();
                rpm = 1000;
                System.out.println("Current RPM " + rpm);
            }
        }

        private void decreaseRPM() {
            consumeGas();
            if (rpm > 1000) {
                rpm -= 500;
                System.out.println("Current RPM " + rpm);
            } else {
                transmission.decreaseGear();
                rpm = 5000;
                System.out.println("Current RPM " + rpm);
            }
        }

        private void consumeGas() {
            gasTank.gas.burn();
            System.out.println("Amount of gas left: " + gasTank.gas.getVolume());
        }

        private void fullStop() {
            rpm = 0;
            transmission.fullStop();
            System.out.println("We've run out of gas...");
            System.out.println("Current RPM " + rpm);
        }
    }

    private static class Transmission {

        private int gear;

        Transmission() {
            gear = 1;
        }

        void increaseGear() {
            if (gear < 6) {
                gear++;
                System.out.println("Gear number: " + gear);
            } else {
                System.out.println("Gear number: " + gear);
            }
        }

        void decreaseGear() {
            if (gear > 1) {
                gear--;
                System.out.println("Gear number: " + gear);
            } else {
                System.out.println("Gear number: " + gear);
            }
        }

        void fullStop() {
            gear = 1;
            System.out.println("Gear number: " + gear);
        }
    }

    private static class GasTank {

        private Gas gas;

        void fillTank(Gas gas) {
            this.gas = gas;
        }

        boolean hasGas() {
            return gas.getVolume() > 0;
        }
    }
}
