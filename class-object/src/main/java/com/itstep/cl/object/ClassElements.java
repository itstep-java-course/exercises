package com.itstep.cl.object;

public class ClassElements {

    //статические поля
    private static String className;
    private static int classesCount;

    //статический блок инициализации
    static {
        System.out.println("Статический блок инициализации");
    }

    //обычные поля
    private String name;
    private int age;

    //обычные блоки инициализации
    {
        System.out.println("Обычный блок инициализации");
    }

    //Конструктор класса
    public ClassElements() {
        System.out.println("Конструктор класса");
    }

    public static String printStaticMethod() {
        System.out.println("Статический метод класса");
        return "s";
    }

    public String printNonStaticMethod() {
        System.out.println("Не статический метод класса");
        return "s";
    }
}
