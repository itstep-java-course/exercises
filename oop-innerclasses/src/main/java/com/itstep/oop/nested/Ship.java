package com.itstep.oop.nested;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return model.equals(ship.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}
