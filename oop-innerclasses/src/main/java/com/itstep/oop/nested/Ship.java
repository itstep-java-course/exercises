package com.itstep.oop.nested;

public class Ship {
    public static class LifeBoat {
        private int boatId;
        public static void down() {
            System.out.println("шлюпки на воду!");
        }
        public void swim() {
            System.out.println("отплытие шлюпки");
        }
    }
}
