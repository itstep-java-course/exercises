package com.itstep.control.structures.perepeliatnyk_classwork;

public class SwitchTask {
    public static void main(String[] args) {
        String voice = "Bad";
        switch (voice) {
            case "Hello":
                System.out.println("привет");
                break;
            case "Bad":
                System.out.println("Плохо");
                break;
            case "Good":
                System.out.println("Хорошо");
                break;
            default:
                System.out.println("Нет перевода");
        }

    }
}
