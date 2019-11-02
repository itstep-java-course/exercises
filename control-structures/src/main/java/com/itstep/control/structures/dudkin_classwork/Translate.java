package com.itstep.control.structures.dudkin_classwork;

public class Translate {
    public static void main(String[] args) {
        String word = "Hello";
        switch (word) {
            case "Hello":
                System.out.println("Привет");
                break;
            case "Bad":
                System.out.printf("Плохо");
                break;
            case "Good":
                System.out.println("Хорошо");
                break;
            default:
                System.out.printf("Да фиг его знает,преводи сам!");
        }
    }
}
