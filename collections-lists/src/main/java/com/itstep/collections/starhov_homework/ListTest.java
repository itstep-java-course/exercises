package com.itstep.collections.starhov_homework;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {


        //System.out.println(Arrays.toString(Car.CarType.values()));


        List<Car> list = new ArrayList<Car>(12);
        list.add(new Car(202122, "Volvo V50", "2005", "White", Car.CarType.SUV));
        list.add(new Car(232425, "Renault Megane", "2006", "Blue", Car.CarType.COUPE));
        list.add(new Car(123456, "Volkswagen Caddy", "2000", "Black", Car.CarType.COUPE));
        list.add(new Car(415161, "Mazda 6", "2003", "Grey", Car.CarType.COUPE));
        list.add(new Car(323334, "BMW 530 AC", "2009", "Black", Car.CarType.COUPE));
        list.add(new Car(293031, "BMW X5", "2008", "Dark", Car.CarType.SUV));
        list.add(new Car(383940, "Nissan Juke 1.6 AT", "2011", "Black", Car.CarType.SUV));
        list.add(new Car(789101, "Renault Kangoo", "2001", "Red", Car.CarType.SEDAN));
        list.add(new Car(262728, "Ford Focus", "2007", "Pink", Car.CarType.SEDAN));
        list.add(new Car(171819, "Volkswagen Passat B8 TDI", "2004", "Yellow", Car.CarType.SEDAN));
        list.add(new Car(353637, "Mitsubishi Grandis", "2010", "Grey", Car.CarType.SEDAN));


        for (int i = 0; i < list.size(); i++)//вывод
            System.out.println(list.get(i));

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");

        list.sort(Car::compareTo); //сортировка по полю color

        for (int i = 0; i < list.size(); i++)//вывод
            System.out.println(list.get(i));

    }
}

