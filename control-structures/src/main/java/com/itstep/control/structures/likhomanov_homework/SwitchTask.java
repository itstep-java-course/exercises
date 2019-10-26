package com.itstep.control.structures.likhomanov_homework;

import com.sun.jndi.ldap.sasl.SaslInputStream;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String englishWord;

        while (true) {
            System.out.println("Введите слово на английском:");
            englishWord = in.nextLine().toLowerCase();

            switch (englishWord) {
                case "table":
                    System.out.println("Стол");
                    break;
                case "bed":
                    System.out.println("Кровать");
                    break;
                case "room":
                    System.out.println("Комната");
                    break;
                case "space":
                    System.out.println("Космос");
                    break;
                case "job":
                    System.out.println("Работа");
                    break;
                case "car":
                    System.out.println("Машина");
                    break;
                case "wall":
                    System.out.println("Стена");
                    break;
                default:
                    System.out.println("Неизвестное слово:(");
            }
        }
    }
}
