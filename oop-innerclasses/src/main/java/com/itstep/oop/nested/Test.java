package com.itstep.oop.nested;

public class Test {
    public static void main(String[] args) {
        // вызов статического метода
        Ship.LifeBoat.down();
        // создание объекта статического класса
        Ship.LifeBoat lifeBoat = new Ship.LifeBoat();
        // вызов обычного метода
        lifeBoat.swim();
    }
}
