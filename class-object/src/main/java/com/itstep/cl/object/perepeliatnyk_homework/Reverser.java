package com.itstep.cl.object.perepeliatnyk_homework;

// Создать класс с именем Reverser. У класса должно быть одно поле String inputString.
// Это поле должно инициализироваться при создании объекта Reverser.
// Добавить метод doReverse(), который будет возвращать строку с обратной последовательностью символов.
// В методе мейн вывести строку.
// Пример: String inputString = “hello”, метод doReverse() должен вернуть строку “olleh”


public class Reverser {


    private String inputString; //простая строка

    {
        System.out.println(inputString); //инициализация строки
    }

    public Reverser(String inputString) {
        this.inputString = inputString;
    } // конструктор

    private static void doReverse(String p) {
        char[] ch = p.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--){
            System.out.print(ch[i]);
        }

    } // метод переворота слова

    //    public static void main(String[] args) {
//        StringBuffer str = new StringBuffer("hello");
//        str.reverse();
//        System.out.println(str);
//    }


    public static void main(String[] args) {
        Reverser.doReverse("hello");

    }
}
