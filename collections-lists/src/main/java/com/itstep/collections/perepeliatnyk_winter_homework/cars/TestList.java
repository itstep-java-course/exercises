package com.itstep.collections.perepeliatnyk_winter_homework.cars;


import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {

        List<Car> list = new ArrayList<Car>(12);
        list.add(new Car(123456, "Volkswagen Caddy", "2000", "Black", CarType.COUPE));
        list.add(new Car(789101, "Renault Kangoo", "2001", "Red", CarType.SEDAN));
        list.add(new Car(112131, "Hyundai Santa FE", "2002", "Green", CarType.SUV));
        list.add(new Car(415161, "Mazda 6", "2003", "Grey", CarType.COUPE));
        list.add(new Car(171819, "Volkswagen Passat B8 TDI", "2004", "Yellow", CarType.SEDAN));
        list.add(new Car(202122, "Volvo V50", "2005", "White", CarType.SUV));
        list.add(new Car(232425, "Renault Megane", "2006", "Blue", CarType.COUPE));
        list.add(new Car(262728, "Ford Focus", "2007", "Pink", CarType.SEDAN));
        list.add(new Car(293031, "BMW X5", "2008", "Dark", CarType.SUV));
        list.add(new Car(323334, "BMW 530 AC", "2009", "Black", CarType.COUPE));
        list.add(new Car(353637, "Mitsubishi Grandis", "2010", "Grey", CarType.SEDAN));
        list.add(new Car(383940, "Nissan Juke 1.6 AT", "2011", "Black", CarType.SUV));

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        System.out.println("_________________________________________________________");

        list.sort(Car::compareTo);
        for (int i = 0; i < list.size(); i++)
        System.out.println(list.get(i));

    }
}
