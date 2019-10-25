package com.itstep.control.structures.safankov_classwork;

public class SwitchTask {
    public static void main(String[] args) {
        defineSlovo("good");
    }
    private static void defineSlovo(String slovo) {
        switch (slovo) {
            case "hello":
                System.out.println("Это слово на русском : привет");
                break;
            case "bad":
                System.out.println("Это слово на русском : плохой");
                break;
            case "good":
                System.out.println("Это слово на русском : хороший");
                break;
            default:
                System.out.println("я не знаю такое слово");
        }
    }
}
