package com.itstep.oop.nested;

public class Ship {
    private String model = "AX-12";
    private static String model2 = "AXX-12";

    public static class LifeBoat {
        private int boatId;

        public static void down() {
            System.out.println("шлюпки на воду!");
        }

        public void swim() {

            Ship ship = new Ship();
            System.out.println(ship.model);

            System.out.println(model2);
            System.out.println("отплытие шлюпки");
        }
    }
}
