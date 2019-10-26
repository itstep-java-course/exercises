package com.itstep.control.structures.huk_homework;

public class SwitchTask {
    public static void main(String[] args) {

        String voice = "Hello";

        switch (voice) {
            case "Hello":
                System.out.println("Привет");
                break;
            case "Bad":
                System.out.println("Плохой");
                break;
            case "Good":
                System.out.println("Хороший");
                break;
            default:
                System.out.println("что-то непонятное");

        }
    }
}