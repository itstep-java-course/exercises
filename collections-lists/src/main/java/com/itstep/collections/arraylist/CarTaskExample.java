package com.itstep.collections.arraylist;
import java.util.ArrayList;
import java.util.List;
public class CarTaskExample {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("1234", "Duster", "2011", "white", "SUV"));
        cars.add(new Car("1245", "CLS250", "2014", "brown", "Sedan"));
        cars.add(new Car("1275", "Megane", "2013", "green", "Coupe"));
        cars.add(new Car("1211", "X5", "2019", "black", "SUV"));
        cars.add(new Car("1257", "A4", "2013", "white", "Sedan"));
        cars.add(new Car("1278", "Mustang", "2015", "red", "Coupe"));
        cars.add(new Car("1241", "Corolla", "2018", "black", "Sedan"));
        cars.add(new Car("1268", "Tucson", "2016", "silver", "SUV"));
        cars.add(new Car("1273", "S63", "2015", "grey", "Coupe"));
        cars.add(new Car("1249", "CC", "2011", "white", "Coupe"));
        cars.add(new Car("1253", "Rav4", "2017", "black", "SUV"));
        cars.add(new Car("1222", "Is250", "2007", "blue", "Sedan"));

        cars.sort(Car::compareTo);
        for (int i = 0; i < cars.size(); i++)
            System.out.println(cars.get(i));

    }
}

