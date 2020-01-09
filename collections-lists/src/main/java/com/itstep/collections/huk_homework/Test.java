package com.itstep.collections.huk_homework;



import jdk.nashorn.api.scripting.AbstractJSObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {


    public static void main(String[] args) {


        //System.out.println(Arrays.toString(type.values()));


        List<Car> list = new ArrayList<Car>(3);
        list.add(new Car(123456, "Volkswagen Caddy", "2000", "Black"));
        list.add(new Car(789101, "Renault Kangoo", "2001", "Black"));
        list.add(new Car(112131, "Hyundai Santa FE", "2002", "Black"));
        list.add(new Car(415161, "Mazda 6", "2003", "Black"));
        list.add(new Car(171819, "Volkswagen Passat B8 TDI", "2004", "Black"));
        list.add(new Car(202122, "Volvo V50", "2005", "Black"));
        list.add(new Car(232425, "Renault Megane", "2006", "Black"));
        list.add(new Car(262728, "Ford Focus", "2007", "Black"));
        list.add(new Car(293031, "BMW X5", "2008", "Black"));
        list.add(new Car(323334, "BMW 530 AC", "2009", "Black"));
        list.add(new Car(353637, "Mitsubishi Grandis", "2010", "Black"));
        list.add(new Car(383940, "Nissan Juke 1.6 AT", "2011", "Black"));
        list.add(new Car(414243, "INFINITY FX 35", "2012", "Black"));
        list.add(new Car(444546, "MAZDA CX-5", "2013", "Black"));
        list.add(new Car(474849, "ALFA ROMEO Stelvio", "2014", "Black"));
        list.add(new Car(505152, "MITSUBISHI Outlander", "2015", "Black"));
        list.add(new Car(535455, "FORD Fusion", "2016", "Black"));
        list.add(new Car(565758, "ВАЗ 2115", "2017", "Black"));
        list.add(new Car(596061, "SKODA Fabia", "2018", "Black"));
        list.add(new Car(626364, "KIA Ceed", "2019", "Black"));




        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));


    }
}
