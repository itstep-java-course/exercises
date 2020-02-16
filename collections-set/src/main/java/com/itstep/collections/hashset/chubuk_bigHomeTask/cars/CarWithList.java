package com.itstep.collections.hashset.chubuk_bigHomeTask.cars;

import java.util.ArrayList;
import java.util.List;

public class CarWithList {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<Car>(12);
        list.add(new Car(524863, "Volkswagen Caddy", 2015, "White", Car.TypeOfNewCar.SEDAN));
        list.add(new Car(322486, "Renault Kangoo", 2015, "White", Car.TypeOfNewCar.SUV));
        list.add(new Car(947732, "Hyundai Santa FE", 2007, "Silver", Car.TypeOfNewCar.SUV));
        list.add(new Car(843115, "Mazda 6", 2004, "Red", Car.TypeOfNewCar.SEDAN));
        list.add(new Car(200161, "Volkswagen Passat B8 TDI", 2015, "White", Car.TypeOfNewCar.SEDAN));

        list.add(new Car(330049, "Volvo V50", 2009, "Black", Car.TypeOfNewCar.COUPE));
        list.add(new Car(726881, "Renault Megane", 2014, "Blue", Car.TypeOfNewCar.COUPE));
        list.add(new Car(951234, "Ford Focus", 2009, "Black", Car.TypeOfNewCar.SEDAN));
        list.add(new Car(324557, "BMW X5", 2011, "Gray", Car.TypeOfNewCar.SUV));
        list.add(new Car(174433, "BMW 530 AC", 2001, "Black", Car.TypeOfNewCar.COUPE));

        list.add(new Car(772001, "Mitsubishi Grandis", 2006, "Gray", Car.TypeOfNewCar.COUPE));
        list.add(new Car(541002, "Nissan Juke 1.6 AT", 2019, "Red", Car.TypeOfNewCar.SUV));


        list.sort(Car::compareTo);
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
