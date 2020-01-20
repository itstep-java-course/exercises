package com.itstep.collections.shyrkov_collections_homework;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        //TASK 1

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList.add(500_000) = "+(endTime-startTime)+"ms\n");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList.add(500_000) = "+(endTime-startTime)+"ms\n");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList.add(0, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList.add(0, 500_000) = "+(endTime-startTime)+"ms\n");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            linkedList.add(0, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList.add(0, 500_000) = "+(endTime-startTime)+"ms\n");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList.add(200_000, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList.add(200_000, 500_000) = "+(endTime-startTime)+"ms\n");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            linkedList.add(200_000, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList.add(200_000, 500_000) = "+(endTime-startTime)+"ms\n");

        startTime = System.currentTimeMillis();

        arrayList.remove(200_000);

        endTime = System.currentTimeMillis();
        System.out.println("ArrayList.remove(200_000) = "+(endTime-startTime)+"ms\n");

        startTime = System.currentTimeMillis();

        linkedList.remove(200_000);

        endTime = System.currentTimeMillis();
        System.out.println("LinkedList.remove(200_000) = "+(endTime-startTime)+"ms\n");

        //TASK 2

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(423423, "BMW", "2010", "Green", "Sedan"));
        cars.add(new Car(213321, "Audi", "2008", "Green", "Sedan"));
        cars.add(new Car(734734, "Mers", "2011", "Green", "Sedan"));
        cars.add(new Car(457377, "KIA", "2009", "Green", "Sedan"));
        cars.add(new Car(499999, "Chevrolet", "2012", "Green", "Sedan"));

        cars.sort(Car::compareTo);
        for (Car car : cars) {
            System.out.println(car);
        }

        //TASK 3

        Set<Table> tables = new TreeSet<>();
        tables.add(new Table(124.4));
        tables.add(new Table(213.4));
        tables.add(new Table(125));
        tables.add(new Table(10.5));

        for (Table table : tables) {
            System.out.println(table);
        }

        //TASK 4

        Set<Car> carSet = new HashSet<>();
        carSet.add(new Car(423421, "BMW", "2010", "Green", "Sedan"));
        carSet.add(new Car(423422, "Audi", "2011", "Red", "Coupe"));
        carSet.add(new Car(423423, "Mers", "2012", "Blue", "Suv"));
        carSet.add(new Car(423424, "KIA", "2013", "Orange", "Sedan"));
        carSet.add(new Car(423425, "Chevrolet", "2014", "Black", "Coupe"));
        carSet.add(new Car(423426, "Volkswagen", "2015", "White", "Suv"));
        carSet.add(new Car(423427, "Renault", "2016", "Red", "Sedan"));
        carSet.add(new Car(423428, "Hyundai", "2017", "Blue", "Coupe"));
        carSet.add(new Car(423429, "Mazda", "2018", "Orange", "Suv"));
        carSet.add(new Car(423420, "Volvo", "2019", "Black", "Sedan"));
        carSet.add(new Car(423412, "Ford", "2018", "White", "Coupe"));
        carSet.add(new Car(423413, "Mitsubishi", "2017", "Green", "Suv"));
        carSet.add(new Car(423414, "Nissan", "2016", "White", "Sedan"));
        carSet.add(new Car(423415, "Infinity", "2015", "Black", "Coupe"));
        carSet.add(new Car(423416, "Alfa romeo", "2014", "Orange", "Suv"));
        carSet.add(new Car(423417, "Skoda", "2013", "Red", "Sedan"));
        carSet.add(new Car(423418, "Vaz", "2012", "Blue", "Coupe"));
        carSet.add(new Car(423419, "Honda", "2011", "White", "Suv"));
        carSet.add(new Car(423410, "Lamborghini", "2010", "Black", "Sedan"));
        carSet.add(new Car(423433, "Ferrari", "2011", "Green", "Coupe"));

        Map<String, Set<Car>> carsByYear = GroupCar.groupByYear(carSet);
        Map<String, Set<Car>> carsByColor = GroupCar.groupByColor(carSet);
        Map<String, Set<Car>> carsByType = GroupCar.groupByType(carSet);

        for(Map.Entry<String, Set<Car>> entry : carsByYear.entrySet()){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(entry.getKey()+" -> ");
            Set<Car> values = entry.getValue();
            for (Car car : values) {
                stringBuilder.append("vin: "+car.getVin()+", model: "+car.getModel()+", color: "+car.getColor()+", type: "+car.getType()+";\n");
            }
            System.out.println(stringBuilder);
        }

        System.out.println("===================================================================");

        for(Map.Entry<String, Set<Car>> entry : carsByColor.entrySet()){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(entry.getKey()+" -> ");
            Set<Car> values = entry.getValue();
            for (Car car : values) {
                stringBuilder.append("vin: "+car.getVin()+", model: "+car.getModel()+", year: "+car.getYear()+", type: "+car.getType()+";\n");
            }
            System.out.println(stringBuilder);
        }

        System.out.println("===================================================================");

        for(Map.Entry<String, Set<Car>> entry : carsByType.entrySet()){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(entry.getKey()+" -> ");
            Set<Car> values = entry.getValue();
            for (Car car : values) {
                stringBuilder.append("vin: "+car.getVin()+", model: "+car.getModel()+", year: "+car.getType()+", color: "+car.getColor()+";\n");
            }
            System.out.println(stringBuilder);
        }

        System.out.println("===================================================================");





    }
}
