package com.itstep.collections.hashset.chubuk_bigHomeTask.cars;

import java.lang.reflect.Type;
import java.util.Comparator;

public class Car implements Comparable<Car>{

    /*static class ColorComparator implements Comparator<Car>
    {
        public int compare(Car c1, Car c2)
        {
            return c1.getColour().compareTo(c2.getColour());
        }
    }

    static class ModelComparator implements Comparator<Car>
    {
        public int compare(Car c1, Car c2)
        {
            return c1.getModel().compareTo(c2.getModel());
        }
    }

    static class YearComparator implements Comparator<Car>
    {
        public int compare(Car c1, Car c2)
        {
            if (c1.getYear() > c2.getYear())
                return 1;
            if (c1.getYear() < c2.getYear())
                return -1;
            else
                return 0;
        }
    }
*/
    enum TypeOfNewCar{
        SEDAN("sedan"),
        COUPE("coupe"),
        SUV("suv");

        private String type;

        TypeOfNewCar(String type) {
            this.type = type;
        }

        public static TypeOfNewCar getTypeByTypeName(String name) {
            final TypeOfNewCar[] carType = values();

            for (TypeOfNewCar value : carType) {
                if (value.type.equals(name)) {
                    return value;
                }
            }
            throw new RuntimeException("Illegal type: " + name);
        }
    }
    private final int vin;
    private final String model;
    private final int year;
    private final String color;
    private final TypeOfNewCar type;

    Car(int vin, String model, int year, String color, TypeOfNewCar type){
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

    public TypeOfNewCar getCarType(){
        return type;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return color;
    }

    @Override
    public String toString() {
        return "vin: " + vin + " model: " + model +
                " year: " + year + " color: " + color +
                " type: " + type;
    }

    @Override
    public int compareTo(Car o) {
        return this.color.compareTo(o.color);
    }
}
