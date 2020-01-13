package com.itstep.collections.huk_homework;


/*
2. Создать класс Car с полями vin, model, year, color, type (sedan, coupe, suv).

Создать 12 разных объектов класса Car. Добавить элементы в List. отсортировать по полю ‘color’. Вывести элементы в консоль.

 */

public class Car implements Comparable<Car> {


    private int vin;
    private String model;
    private String year;
    private String color;
    private Type type;

    public Car(int vin, String model, String year, String color, Type type) {
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

    public Type getType() {
        return type;
    }

    @Override
    public int compareTo(Car o) {
        return this.color.compareTo(o.color);
    }


    public enum Type implements BodyType {
        SEDAN("sedan"),
        COUPE("coupe"),
        SUV("suv");

        private String bodyTypePrintable;

        Type(String bodyTypePrintable) {
            this.bodyTypePrintable = bodyTypePrintable;
        }

        public static Type getTypeByTypeName(String name) {
            final Type[] carType = values();

            for (Type value : carType) {
                if (value.bodyTypePrintable.equals(name)) {
                    return value;
                }
            }
            throw new RuntimeException("Illegal type: " + name);
        }


        @Override
        public String getDisplayName() {
            return bodyTypePrintable;
        }

        @Override
        public String toString() {
            return bodyTypePrintable;
        }

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
