package com.itstep.control.structures.shyrkov_classwork;

public class SwitchTask {
    public static void main(String[] args) {
        translate("Hello");
        translate("Bad");
        translate("Good");
        translate("Java");
    }

    private static void translate(String word) {
        switch (word) {
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
                System.out.println("Непереводимый диалект :(");
        }
    }
}
