package com.itstep.collections.dudkin_hometask;

import com.itstep.collections.dudkin_hometask.Garage.MashinkaTypes;

import java.util.*;

public class CarTest {
    public static void main(String[] args) {
        Set<Car> carSet = new HashSet<>();
        carSet.add(new Car("23", "SR5", "red", MashinkaTypes.SEDAN, 2000));
        carSet.add(new Car("523", "SR6", "orange", MashinkaTypes.SEDAN, 2001));
        carSet.add(new Car("233", "S8", "green", MashinkaTypes.COUPE, 2020));
        carSet.add(new Car("223", "ER2", "blue", MashinkaTypes.SUV, 2003));
        carSet.add(new Car("23", "SR44", "red", MashinkaTypes.COUPE, 2019));
        carSet.add(new Car("263", "X5", "green", MashinkaTypes.COUPE, 2001));
        carSet.add(new Car("263", "FR33", "yellow", MashinkaTypes.SEDAN, 2000));
        carSet.add(new Car("234", "T5", "black", MashinkaTypes.SUV, 2002));
        carSet.add(new Car("263", "FN8", "yellow", MashinkaTypes.COUPE, 2014));
        carSet.add(new Car("723", "SW455", "white", MashinkaTypes.SEDAN, 2015));
        carSet.add(new Car("283", "DRP", "black", MashinkaTypes.SEDAN, 2014));
        carSet.add(new Car("239", "MMN45", "white", MashinkaTypes.SEDAN, 2016));
        carSet.add(new Car("023", "XER34", "blue", MashinkaTypes.SUV, 2019));
        carSet.add(new Car("234", "SVI", "blue", MashinkaTypes.COUPE, 2001));
        carSet.add(new Car("253", "T5", "black", MashinkaTypes.SUV, 2003));
        carSet.add(new Car("323", "X5", "grey", MashinkaTypes.COUPE, 2019));
        carSet.add(new Car("233", "S8", "orange", MashinkaTypes.SEDAN, 2020));
        carSet.add(new Car("423", "FN5", "brown", MashinkaTypes.SUV, 2010));
        carSet.add(new Car("235", "ER2", "brown", MashinkaTypes.SUV, 2005));
        carSet.add(new Car("123", "SR55", "green", MashinkaTypes.COUPE, 2010));
        ShowColorGroups(carSet);
        ShowYearGroups(carSet);
        ShowTypeGroups(carSet);
    }

    public static void ShowColorGroups(Set<Car> carSet) {
        Map<String, List<Car>> groupedByColor = new HashMap();
        for (Car car : carSet) {
            if (!groupedByColor.containsKey(car.getColor())) {
                List<Car> sameColor = new LinkedList<>();
                sameColor.add(car);
                groupedByColor.put(car.getColor(), sameColor);
            } else {
                List<Car> sameColor = groupedByColor.get(car.getColor());
                sameColor.add(car);
                groupedByColor.put(car.getColor(), sameColor);
            }
        }
        for (Map.Entry<String, List<Car>> entry : groupedByColor.entrySet()) {
            System.out.print(entry.getKey() + "->");
            int i = 0;
            for (Car car1 : entry.getValue()) {
                if (i != 0) System.out.print(";  ");
                System.out.print("vin:" + car1.getVin() + ",model:" + car1.getModel() + ",type:" + car1.getType() + ",year:" + car1.getYear());
                i++;
            }
            System.out.println();
        }
        System.out.println("====================================");
    }

    public static void ShowYearGroups(Set<Car> carSet) {
        Map<Integer, List<Car>> groupedByYear = new HashMap();
        for (Car car : carSet) {
            if (!groupedByYear.containsKey(car.getYear())) {
                List<Car> sameYear = new LinkedList<>();
                sameYear.add(car);
                groupedByYear.put(car.getYear(), sameYear);
            } else {
                List<Car> sameYear = groupedByYear.get(car.getYear());
                sameYear.add(car);
                groupedByYear.put(car.getYear(), sameYear);
            }
        }
        for (Map.Entry<Integer, List<Car>> entry : groupedByYear.entrySet()) {
            System.out.print(entry.getKey() + "->");
            int i = 0;
            for (Car car1 : entry.getValue()) {
                if (i != 0) System.out.print(";  ");
                System.out.print("vin:" + car1.getVin() + ",model:" + car1.getModel() + ",color:" + car1.getColor() + ",type:" + car1.getType());
                i++;
            }
            System.out.println();
        }
        System.out.println("====================================");
    }

    public static void ShowTypeGroups(Set<Car> carSet) {
        Map<MashinkaTypes, List<Car>> groupedByType = new HashMap<>();
        for (Car car : carSet) {
            if (!groupedByType.containsKey(car.getType())) {
                List<Car> sameType = new LinkedList<>();
                sameType.add(car);
                groupedByType.put(car.getType(), sameType);
            } else {
                List<Car> sameType = groupedByType.get(car.getType());
                sameType.add(car);
                groupedByType.put(car.getType(), sameType);
            }
        }
        for (Map.Entry<MashinkaTypes, List<Car>> entry : groupedByType.entrySet()) {
            System.out.print(entry.getKey() + "->");
            int i = 0;
            for (Car car1 : entry.getValue()) {
                if (i != 0) System.out.print(";  ");
                System.out.print("vin:" + car1.getVin() + ",model:" + car1.getModel() + ",color:" + car1.getColor() + ",year:" + car1.getYear());
                i++;
            }
            System.out.println();
        }
    }
}
