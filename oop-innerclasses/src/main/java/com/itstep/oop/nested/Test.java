package com.itstep.oop.nested;

import com.itstep.oop.inner.Car;

public class Test {
    public static void main(String[] args) {
        // вызов статического метода
        Ship.LifeBoat.down();
        // создание объекта статического класса
        Ship.LifeBoat lifeBoat = new Ship.LifeBoat();
        // вызов обычного метода
        lifeBoat.swim();


        Car car = new Car();
        car.setCarModel("m2");
        System.out.println(car.hashCode());
        Car car2 = new Car();
        car2.setCarModel("m2");
        System.out.println(car2.hashCode());

        System.out.println(car.equals(car2));
    }
}
