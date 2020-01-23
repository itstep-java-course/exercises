package com.itstep.collections.arraylist.borovoy_newyearhomework;



import java.util.*;

public class CarSet {


    private static Map<String, Set<Car>> groupByYear(Set<Car> sortedSet) {
        Map<String, Set<Car>> map = new HashMap<>();

        for (Car car : sortedSet) {
            if (map.get(car.getYear()) == null) {
                Set<Car> set = new HashSet<>();
                set.add(car);
                map.put(car.getYear(), set);

            } else {
                map.get(car.getYear()).add(car);
            }
        }
        return map;
    }

    private static Map<String, Set<Car>> groupByColor(Set<Car> sortedSet) {
        Map<String, Set<Car>> map = new HashMap<>();

        for (Car car : sortedSet) {
            if (map.get(car.getColour()) == null) {
                Set<Car> set = new HashSet<>();
                set.add(car);
                map.put(car.getColour(), set);

            } else {
                map.get(car.getColour()).add(car);
            }
        }
        return map;
    }


    private static Map<Car.BodyType, Set<Car>> groupByType(Set<Car> sortedSet) {
        Map<Car.BodyType, Set<Car>> map = new HashMap<>();

        for (Car car : sortedSet) {
            if (map.get(car.getBodyType()) == null) {
                Set<Car> set = new HashSet<>();
                set.add(car);
                map.put(car.getBodyType(), set);

            } else {
                map.get(car.getBodyType()).add(car);
            }
        }
        return map;
    }


    public static void main(String[] args) {

        Set<Car> sortedSet = new HashSet<Car>();

        sortedSet.add(new Car("123456", "Volkswagen Caddy", "2000", "Black", Car.BodyType.COUPE));
        sortedSet.add(new Car("789101", "Renault Kangoo", "2001", "Red", Car.BodyType.SEDAN));
        sortedSet.add(new Car("112131", "Hyundai Santa FE", "2002", "Green", Car.BodyType.SUV));
        sortedSet.add(new Car("415161", "Mazda 6", "2003", "Grey", Car.BodyType.COUPE));
        sortedSet.add(new Car("171819", "Volkswagen Passat B8 TDI", "2004", "Yellow", Car.BodyType.SEDAN));

        sortedSet.add(new Car("202122", "Volvo V50", "2005", "White", Car.BodyType.SUV));
        sortedSet.add(new Car("232425", "Renault Megane", "2006", "Blue", Car.BodyType.COUPE));
        sortedSet.add(new Car("262728", "Ford Focus", "2007", "Pink", Car.BodyType.SEDAN));
        sortedSet.add(new Car("293031", "BMW X5", "2008", "Dark", Car.BodyType.SUV));
        sortedSet.add(new Car("323334", "BMW 530 AC", "2009", "Black", Car.BodyType.COUPE));

        sortedSet.add(new Car("353637", "Mitsubishi Grandis", "2010", "Grey", Car.BodyType.SEDAN));
        sortedSet.add(new Car("383940", "Nissan Juke 1.6 AT", "2011", "Black", Car.BodyType.SUV));
        sortedSet.add(new Car("414243", "INFINITY FX 35", "2012", "Brown", Car.BodyType.COUPE));
        sortedSet.add(new Car("444546", "MAZDA CX-5", "2013", "Orange", Car.BodyType.SEDAN));
        sortedSet.add(new Car("474849", "ALFA ROMEO Stelvio", "2014", "Coral", Car.BodyType.SUV));

        sortedSet.add(new Car("505152", "MITSUBISHI Outlander", "2015", "Purple", Car.BodyType.COUPE));
        sortedSet.add(new Car("535455", "FORD Fusion", "2015", "Silver", Car.BodyType.SEDAN));
        sortedSet.add(new Car("565758", "ВАЗ 2115", "2017", "Gold", Car.BodyType.SUV));
        sortedSet.add(new Car("596061", "SKODA Fabia", "2015", "Red", Car.BodyType.SEDAN));
        sortedSet.add(new Car("626364", "KIA Ceed", "2019", "Red", Car.BodyType.SUV));


        Map<String, Set<Car>> map = groupByYear(sortedSet);
        Map<String, Set<Car>> map2 = groupByColor(sortedSet);
        Map<Car.BodyType, Set<Car>> map3 = groupByType(sortedSet);


        for (Map.Entry<String, Set<Car>> entry : map.entrySet()) {
            String result = entry.getKey() + " -> ";
            final Set<Car> values = entry.getValue();
            for (Car car : values) {
                result += car.getVin() + ", " + car.getModel() + ", " + car.getColour() + ", " + car.getBodyType() + "; ";

            }
            System.out.println(result);

        }

        System.out.println("=========================================================================================");


        for (Map.Entry<String, Set<Car>> entry : map2.entrySet()) {
            String result = entry.getKey() + " -> ";
            final Set<Car> values = entry.getValue();
            for (Car car : values) {
                result += car.getVin() + ", " + car.getModel() + ", " + car.getYear() + ", " + car.getBodyType() + "; ";

            }
            System.out.println(result);
        }

        System.out.println("=========================================================================================");

        for (Map.Entry<Car.BodyType, Set<Car>> entry : map3.entrySet()) {
            String result = entry.getKey() + " -> ";
            final Set<Car> values = entry.getValue();
            for (Car car : values) {
                result += car.getVin() + ", " + car.getModel() + ", " + car.getYear() + ", " + car.getColour() + "; ";

            }
            System.out.println(result);
        }
    }
}