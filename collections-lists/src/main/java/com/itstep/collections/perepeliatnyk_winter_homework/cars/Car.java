package com.itstep.collections.perepeliatnyk_winter_homework.cars;

/*
2. Создать класс Car с полями vin, model, year, color, type (sedan, coupe, suv).
Создать 12 разных объектов класса Car. Добавить элементы в List. отсортировать по полю ‘color’. Вывести элементы в консоль.
 */

import java.util.Objects;

public class Car implements Comparable<Car> {

    private int vin;
    private String model;
    private String year;
    private String color;
    private CarType type;

    public Car(int vin, String model, String year, String color, CarType type) {
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.color = color;
        this.type = type;
    }

    public int getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public CarType getType() {
        return type;
    }

    @Override
    public int compareTo(Car o) {
        return this.color.compareTo(o.color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return vin == car.vin &&
                year.equals(car.year) &&
                color.equals(car.color) &&
                type == car.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, year, color, type);
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
