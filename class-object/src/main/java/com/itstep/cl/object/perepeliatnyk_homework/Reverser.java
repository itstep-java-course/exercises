package com.itstep.cl.object.perepeliatnyk_homework;

// Создать класс с именем Reverser. У класса должно быть одно поле String inputString.
// Это поле должно инициализироваться при создании объекта Reverser.
// Добавить метод doReverse(), который будет возвращать строку с обратной последовательностью символов.
// В методе мейн вывести строку.
// Пример: String inputString = “hello”, метод doReverse() должен вернуть строку “olleh”


public class Reverser {


    private String inputString; //простая строка


    public Reverser(String P) {this.inputString = P;} // конструктор

    private void doReverse() {
        char[] ch = inputString.toCharArray();
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
        Reverser reverser = new Reverser("hello");
        reverser.doReverse();

    }
}
