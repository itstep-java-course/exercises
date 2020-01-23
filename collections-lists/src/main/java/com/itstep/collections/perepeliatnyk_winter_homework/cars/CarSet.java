package com.itstep.collections.perepeliatnyk_winter_homework.cars;

import java.util.*;
/*
4. Создать класс Car с полями vin, model, year, color, CarType (sedan, coupe, suv). Создать 20 разных объектов класса Car
с периодически повторяющимися значениями для полей color, year, CarType. Добавить элементы в Set.
Сгруппировать элементы по color по year и по CarType. Вывести в консоль поле по которому выполнялась
группировка информацию по автомобилям. Пример вывода:
2010 → vin: 202020, model: CX-5, color: red, CarType: Sedan; (если несколько значение то через ‘;’)
red → vin: 202020, model: CX-5, year: 2010, CarType: Sedan
Sedan → vin: 202020, model: CX-5, color: red, year: 2010
обратите внимание на то что поле, по которому происходит группировка не отображается в выводе информации по авто.
Для группировки элементов использовать Map
При выполнении задания использовать ООП подход
 */


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
        Map<String, Set<Car>> map2 = new HashMap<>();

        for (Car car : sortedSet) {
            if (map2.get(car.getColor()) == null) {
                Set<Car> set = new HashSet<>();
                set.add(car);
                map2.put(car.getColor(), set);

            } else {
                map2.get(car.getColor()).add(car);
            }
        }
        return map2;
    }

    private static Map<CarType, Set<Car>> groupByType(Set<Car> sortedSet) {
        Map<CarType, Set<Car>> map3 = new HashMap<>();

        for (Car car : sortedSet) {
            if (map3.get(car.getType()) == null) {
                Set<Car> set = new HashSet<>();
                set.add(car);
                map3.put(car.getType(), set);

            } else {
                map3.get(car.getType()).add(car);
            }
        }
        return map3;
    }

    public static void main(String[] args) {

        Set<Car> sortedSet = new HashSet<Car>();

        sortedSet.add(new Car(123456, "Volkswagen Caddy", "2000", "Black", CarType.COUPE));
        sortedSet.add(new Car(789101, "Renault Kangoo", "2000", "Red", CarType.SEDAN));
        sortedSet.add(new Car(112131, "Hyundai Santa FE", "2000", "Green", CarType.SUV));
        sortedSet.add(new Car(415161, "Mazda 6", "2003", "Grey", CarType.COUPE));
        sortedSet.add(new Car(171819, "Volkswagen Passat B8 TDI", "2004", "Yellow", CarType.SEDAN));

        sortedSet.add(new Car(202122, "Volvo V50", "2005", "White", CarType.SUV));
        sortedSet.add(new Car(232425, "Renault Megane", "2006", "Blue", CarType.COUPE));
        sortedSet.add(new Car(262728, "Ford Focus", "2007", "Pink", CarType.SEDAN));
        sortedSet.add(new Car(293031, "BMW X5", "2008", "Dark", CarType.SUV));
        sortedSet.add(new Car(323334, "BMW 530 AC", "2009", "Black", CarType.COUPE));

        sortedSet.add(new Car(353637, "Mitsubishi Grandis", "2010", "Grey", CarType.SEDAN));
        sortedSet.add(new Car(383940, "Nissan Juke 1.6 AT", "2011", "Black", CarType.SUV));
        sortedSet.add(new Car(414243, "INFINITY FX 35", "2012", "Brown", CarType.COUPE));
        sortedSet.add(new Car(444546, "MAZDA CX-5", "2013", "Orange", CarType.SEDAN));
        sortedSet.add(new Car(474849, "ALFA ROMEO Stelvio", "2014", "Coral", CarType.SUV));

        sortedSet.add(new Car(505152, "MITSUBISHI Outlander", "2015", "Purple", CarType.COUPE));
        sortedSet.add(new Car(535455, "FORD Fusion", "2016", "Silver", CarType.SEDAN));
        sortedSet.add(new Car(565758, "ВАЗ 2115", "2017", "Gold", CarType.SUV));
        sortedSet.add(new Car(596061, "SKODA Fabia", "2018", "Red", CarType.SEDAN));
        sortedSet.add(new Car(626364, "KIA Ceed", "2019", "Red", CarType.SUV));

        Map<String, Set<Car>> map = groupByYear(sortedSet);
        Map<String, Set<Car>> map2 = groupByColor(sortedSet);
        Map<CarType, Set<Car>> map3 = groupByType(sortedSet);

        for (Map.Entry<String, Set<Car>> entry : map.entrySet()) {
            String result = entry.getKey() + " -> ";
            Set<Car> values = entry.getValue();
            for (Car car : values) {
                result +=  car.getYear() + ", " + car.getVin() + ", " + car.getModel() + ", " + car.getColor()  + ", "  + car.getType() + "; ";

            }
            System.out.println(result);
        }

        System.out.println("___________________________________________________________________");

        for (Map.Entry<String, Set<Car>> entry : map2.entrySet()){
            String result = entry.getKey() + " -> ";
            final Set <Car> values = entry.getValue();
            for(Car car :values){
                result += car.getVin() + ", " + car.getModel() + ", " + car.getYear() + ", "  + car.getType() +  "; ";

            }
            System.out.println(result);
        }

        System.out.println("___________________________________________________________________");

        for (Map.Entry<CarType, Set<Car>> entry : map3.entrySet()){
            String result = entry.getKey() + " -> ";
            final Set <Car> values = entry.getValue();
            for(Car car :values){
                result += car.getVin() + ", " + car.getModel() + ", " + car.getYear() + ", "  + car.getColor() +  "; ";

            }
            System.out.println(result);
        }
    }

}
