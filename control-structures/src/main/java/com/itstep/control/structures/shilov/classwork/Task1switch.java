package com.itstep.control.structures.shilov.classwork;

import java.sql.SQLOutput;

public class Task1switch {

    public static void main(String[] args) {
        String word = "Bad";
        switch (word) {
            case "Hello":
                System.out.println("Привет");
                break;
            case "Bad":
                System.out.println("Плохо");
                break;
            case "Good":
                System.out.println("Хорошо");
            default:
                System.out.println("что-то непонятное");
        }
    }
}