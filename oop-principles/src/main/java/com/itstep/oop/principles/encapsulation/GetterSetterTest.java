package com.itstep.oop.principles.encapsulation;

public class GetterSetterTest {

    //provide an example where need to return default values if field is null
    public static void main(String[] args) {
        GetterSetterExample test = new GetterSetterExample();

        test.name = "name";

        test.setName("name1");

        System.out.println(test.name == null ? "empty" : test.name);
        System.out.println(test.name);
        System.out.println(test.name);
        System.out.println(test.name);
        System.out.println(test.name);
        System.out.println(test.name);
        System.out.println(test.name);
        System.out.println(test.name);
        System.out.println(test.name);
        System.out.println(test.name);


    }
}
