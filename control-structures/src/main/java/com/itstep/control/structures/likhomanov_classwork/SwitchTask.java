package com.itstep.control.structures.likhomanov_classwork;

import java.util.Scanner;

public class SwitchTask {

    public static void main(String[] args) {

        String englishWord;
        Scanner in = new Scanner(System.in);

        System.out.println("Задай английское слово");

        englishWord = in.nextLine();

        switch (englishWord) {
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
                System.out.println("Неизвестное слово");
        }
    }
}
