package com.itstep.oop.interfaces.dudkin_homework;

import com.itstep.oop.interfaces.dudkin_homework.program_internals.MainInterface;

public class Main implements MainInterface {
    public static void main(String[] args) {
        String firstString = "description,main,maintenance-polimorfism encapsulation, bodies";
        Main forTest = new Main();
        forTest.showResultOfFirstLogic(firstString);
        forTest.showResultOfRevers(firstString);
        System.out.println();
        forTest.showResultOfReversWithLimit(firstString);
    }
}
