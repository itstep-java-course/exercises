package com.itstep.oop.dudkin_car.proga_insides;

 interface Movable {
    class NumberOfTransport {
        static int counter = 0;

        NumberOfTransport() {
            counter++;
        }

        static void showNumberOfTransport() {
            System.out.println(counter);
        }
    }
}
