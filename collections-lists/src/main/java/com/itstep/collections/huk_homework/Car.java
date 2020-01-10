package com.itstep.collections.huk_homework;

/*
2. Создать класс Car с полями vin, model, year, color, type (sedan, coupe, suv).

Создать 12 разных объектов класса Car. Добавить элементы в List. отсортировать по полю ‘color’. Вывести элементы в консоль.

 */

public class Car {



        private int vin;
        private String model;
        private String year;
        private String color;

    public Car( int vin, String model, String year, String color){
            this.vin = vin;
            this.model = model;
            this.year = year;
            this.color = color;
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

    public enum type implements bodyType {
            SEDAN("sedan"),
            COUPE("coupe"),
            SUV("suv");

            private String bodyTypePrintable;

            type(String bodyTypePrintable) {
                this.bodyTypePrintable = bodyTypePrintable;
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
