package com.itstep.control.structures.dudkin_homework;

public class Translator {
    public static void main(String[] args) {
        String word = "Hello";
        switch (word) {
            case "Hello":
                System.out.println("Привет");
                break;
            case "Bad":
                System.out.println("Плохо");
                break;
            case "Good":
                System.out.println("Хорошо");
                break;
            case "Equal to":
                System.out.println("Равно");
                break;
            case "Plus":
                System.out.println("Плюс");
                break;
            case "Minus":
                System.out.println("Минус");
                break;
            default:
                System.out.println("Да фиг его знает,переводите в словаре!");
        }
    }
}
