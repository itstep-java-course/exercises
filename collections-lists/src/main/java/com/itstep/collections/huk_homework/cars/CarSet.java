package com.itstep.collections.huk_homework.cars;

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

    private static Map<String, Set<Car>> groupByYear(SortedSet<Car> sortedSet){
        Map<String, Set<Car>> map = new HashMap<>();

        for (Car car : sortedSet) {
            if (map.get(car.getYear())==null){
                Set<Car> set = new HashSet<>();
                set.add(car);
                map.put(car.getYear(), set);

            }
            else{
                map.get(car.getYear()).add(car);
            }
        }
        return map;
    }

    private static Map<String, Set<Car>> groupByColor(SortedSet<Car> sortedSet){
        Map<String, Set<Car>> map2 = new HashMap<>();

        for (Car car : sortedSet) {
            if (map2.get(car.getColor())==null){
                Set<Car> set = new HashSet<>();
                set.add(car);
                map2.put(car.getColor(), set);

            }
            else{
                map2.get(car.getColor()).add(car);
            }
        }
        return map2;
    }


    private static Map<Car.CarType, Set<Car>> groupByType(SortedSet<Car> sortedSet){
        Map<Car.CarType, Set<Car>> map3 = new HashMap<>();

        for (Car car : sortedSet) {
            if (map3.get(car.getCarType())==null){
                Set<Car> set = new HashSet<>();
                set.add(car);
                map3.put(car.getCarType(), set);

            }
            else{
                map3.get(car.getCarType()).add(car);
            }
        }
        return map3;
    }


    public static void main(String[] args) {

        SortedSet<Car> sortedSet = new TreeSet<Car>();

        sortedSet.add(new Car(123456, "Volkswagen Caddy", "2000", "Black", Car.CarType.COUPE));
        sortedSet.add(new Car(789101, "Renault Kangoo", "2001", "Red", Car.CarType.SEDAN));
        sortedSet.add(new Car(112131, "Hyundai Santa FE", "2002", "Green", Car.CarType.SUV));
        sortedSet.add(new Car(415161, "Mazda 6", "2003", "Grey", Car.CarType.COUPE));
        sortedSet.add(new Car(171819, "Volkswagen Passat B8 TDI", "2004", "Yellow", Car.CarType.SEDAN));

        sortedSet.add(new Car(202122, "Volvo V50", "2005", "White", Car.CarType.SUV));
        sortedSet.add(new Car(232425, "Renault Megane", "2006", "Blue", Car.CarType.COUPE));
        sortedSet.add(new Car(262728, "Ford Focus", "2007", "Pink", Car.CarType.SEDAN));
        sortedSet.add(new Car(293031, "BMW X5", "2008", "Dark", Car.CarType.SUV));
        sortedSet.add(new Car(323334, "BMW 530 AC", "2009", "Black", Car.CarType.COUPE));

        sortedSet.add(new Car(353637, "Mitsubishi Grandis", "2010", "Grey", Car.CarType.SEDAN));
        sortedSet.add(new Car(383940, "Nissan Juke 1.6 AT", "2011", "Black", Car.CarType.SUV));
        sortedSet.add(new Car(414243, "INFINITY FX 35", "2012", "Brown", Car.CarType.COUPE));
        sortedSet.add(new Car(444546, "MAZDA CX-5", "2013", "Orange", Car.CarType.SEDAN));
        sortedSet.add(new Car(474849, "ALFA ROMEO Stelvio", "2014", "Coral", Car.CarType.SUV));

        sortedSet.add(new Car(505152, "MITSUBISHI Outlander", "2015", "Purple", Car.CarType.COUPE));
        sortedSet.add(new Car(535455, "FORD Fusion", "2015", "Silver", Car.CarType.SEDAN));
        sortedSet.add(new Car(565758, "ВАЗ 2115", "2017", "Gold", Car.CarType.SUV));
        sortedSet.add(new Car(596061, "SKODA Fabia", "2015", "Red", Car.CarType.SEDAN));
        sortedSet.add(new Car(626364, "KIA Ceed", "2019", "Red", Car.CarType.SUV));



        Map<String, Set<Car>> map = groupByYear(sortedSet);
        Map<String, Set<Car>> map2 = groupByColor(sortedSet);
        Map<Car.CarType, Set<Car>> map3 = groupByType(sortedSet);


        for (Map.Entry<String, Set<Car>> entry : map.entrySet()) {
            String result = entry.getKey() + " -> ";
            final Set<Car> values = entry.getValue();
            for (Car car : values) {
                result +=  car.getVin() + ", " + car.getModel() + ", " + car.getColor()  + ", "  + car.getCarType() + "; ";

            }
            System.out.println(result);

        }

        System.out.println("=========================================================================================");


        for (Map.Entry<String, Set<Car>> entry : map2.entrySet()){
            String result = entry.getKey() + " -> ";
            final Set <Car> values = entry.getValue();
            for(Car car :values){
                result += car.getVin() + ", " + car.getModel() + ", " + car.getYear() + ", "  + car.getCarType() +  "; ";

            }
            System.out.println(result);
        }

        System.out.println("=========================================================================================");

        for (Map.Entry<Car.CarType, Set<Car>> entry : map3.entrySet()){
            String result = entry.getKey() + " -> ";
            final Set <Car> values = entry.getValue();
            for(Car car :values){
                result += car.getVin() + ", " + car.getModel() + ", " + car.getYear() + ", "  + car.getColor() +  "; ";

            }
            System.out.println(result);
        }




//        for (Car car : sortedSet) { //выввод колекции на экран
//            System.out.println(car);
//        }


    }
}
