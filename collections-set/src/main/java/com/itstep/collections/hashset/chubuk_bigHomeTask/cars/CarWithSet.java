package com.itstep.collections.hashset.chubuk_bigHomeTask.cars;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class CarWithSet {
    public static void main(String[] args) {
        SortedSet<Car> sortedSet = new TreeSet<>();

        sortedSet.add(new Car(524863, "Volkswagen Caddy", 2015, "White", Car.TypeOfNewCar.SEDAN));
        sortedSet.add(new Car(322486, "Renault Kangoo", 2015, "White", Car.TypeOfNewCar.SUV));
        sortedSet.add(new Car(947732, "Hyundai Santa FE", 2007, "Silver", Car.TypeOfNewCar.SUV));
        sortedSet.add(new Car(843115, "Mazda 6", 2004, "Red", Car.TypeOfNewCar.SEDAN));
        sortedSet.add(new Car(200161, "Volkswagen Passat B8 TDI", 2015, "White", Car.TypeOfNewCar.SEDAN));

        sortedSet.add(new Car(330049, "Volvo V50", 2009, "Black", Car.TypeOfNewCar.COUPE));
        sortedSet.add(new Car(726881, "Renault Megane", 2014, "Blue", Car.TypeOfNewCar.COUPE));
        sortedSet.add(new Car(951234, "Ford Focus", 2009, "Black", Car.TypeOfNewCar.SEDAN));
        sortedSet.add(new Car(324557, "BMW X5", 2011, "Gray", Car.TypeOfNewCar.SUV));
        sortedSet.add(new Car(174433, "BMW 530 AC", 2001, "Black", Car.TypeOfNewCar.COUPE));

        sortedSet.add(new Car(772001, "Mitsubishi Grandis", 2006, "Gray", Car.TypeOfNewCar.COUPE));
        sortedSet.add(new Car(541002, "Nissan Juke 1.6 AT", 2019, "Red", Car.TypeOfNewCar.SUV));
        sortedSet.add(new Car(852134, "INFINITY FX 35", 2007, "Black", Car.TypeOfNewCar.SUV));
        sortedSet.add(new Car(154423, "MAZDA CX-5", 2019, "Blue", Car.TypeOfNewCar.SUV));
        sortedSet.add(new Car(384519, "ALFA ROMEO Stelvio", 2019, "White", Car.TypeOfNewCar.SEDAN));

        sortedSet.add(new Car(208024, "MITSUBISHI Outlander", 2007, "Gray", Car.TypeOfNewCar.SUV));
        sortedSet.add(new Car(371106, "FORD Fusion", 2014, "Orange", Car.TypeOfNewCar.SEDAN));
        sortedSet.add(new Car(532288, "ВАЗ 2115", 2011, "Green", Car.TypeOfNewCar.SEDAN));
        sortedSet.add(new Car(911733, "SKODA Fabia", 2006, "Red", Car.TypeOfNewCar.SEDAN));
        sortedSet.add(new Car(109442, "KIA Ceed", 2019, "Blue", Car.TypeOfNewCar.SEDAN));

        System.out.print("SEDAN → ");
        for (Car s : sortedSet) {
            if (s.getCarType() == Car.TypeOfNewCar.SEDAN)
            System.out.print(s.getModel()+","+s.getColour()+","+s.getYear()+","+s.getVin()+";");
        }

        System.out.println();
        System.out.print("Blue → ");
        for (Car s : sortedSet) {
            if (s.getColour() == "Blue")
                System.out.print(s.getModel()+","+s.getCarType()+","+s.getYear()+","+s.getVin()+";");
        }

        System.out.println();
        System.out.print("2015 → ");
        for (Car s : sortedSet) {
            if (s.getYear() == 2015)
                System.out.print(s.getModel()+","+s.getColour()+","+s.getCarType()+","+s.getVin()+";");
        }
    }
}
