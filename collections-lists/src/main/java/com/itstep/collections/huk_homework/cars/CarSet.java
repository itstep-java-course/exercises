package com.itstep.collections.huk_homework.cars;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
/*

4. Создать класс Car с полями vin, model, year, color, CarType (sedan, coupe, suv). Создать 20 разных объектов класса Car
с периодически повторяющимися значениями для полей color, year, CarType. Добавить элементы в Set.
Сгруппировать элементы по color по year и по CarType. Вывести в консоль поле по которому выполнялась
группировка информацию по автомобилям. Пример вывода:

2010 → vin: 202020, model: CX-5, color: red, CarType: Sedan; (если несколько значение то через ‘;’)
red → vin: 202020, model: CX-5, year: 2010, CarType: Sedan
Sedan → vin: 202020, model: CX-5, color: red, year: 2010
 */



public class CarSet {
    public static void main(String[] args) {

        SortedSet<Car> sortedSet = new TreeSet<Car>();
//       3 разных мапы
//        Map<String,List<Car>>
//        get("2015");
//        если null таких значений нет
//        ("2015", [Car1,Car 4])
//        иквелс и hascode переопределить
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
        sortedSet.add(new Car(596061, "SKODA Fabia", "2018", "Khaki", Car.CarType.SEDAN));
        sortedSet.add(new Car(626364, "KIA Ceed", "2019", "Copper", Car.CarType.SUV));


        for (Car car : sortedSet) { //выввод колекции на экран
            System.out.println(car);
        }

        System.out.println("=========================================================================================");
        System.out.print("2015 → ");
        for (Car s : sortedSet) {
            if (s.getYear().equals("2015"))
                System.out.print("vin: " + s.getVin() + ", " + "model: " + s.getModel() + ", " + "color: " + s.getColor() + ", " + "CarType: " + s.getCarType() + ";\n");
        }


        System.out.println("=========================================================================================");
        System.out.print("Red → ");
        for (Car s : sortedSet) {
            if (s.getColor().equals("Red"))
                System.out.print("vin: " + s.getVin() + ", " + "model: " + s.getModel() + ", " + "year: " + s.getYear() + ", " + "CarType: " + s.getCarType() + ";\n");
        }


        System.out.println("=========================================================================================");
        System.out.print("SEDAN → ");
        for (Car s : sortedSet) {
            if (s.getCarType() == Car.CarType.SEDAN)
                System.out.print("vin: " + s.getVin() + ", " + "model: " + s.getModel() + ", " + "color: " + s.getColor() + ", " + "year: " + s.getYear() + ";\n");
        }

    }
}
