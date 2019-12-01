package com.itstep.oop.interfaces.dudkin_homework;

import com.itstep.oop.interfaces.dudkin_homework.program_internals.FirstLogic;
import com.itstep.oop.interfaces.dudkin_homework.program_internals.MainInterface;
import com.itstep.oop.interfaces.dudkin_homework.program_internals.SecondLogic;
import com.itstep.oop.interfaces.dudkin_homework.program_internals.ThirdLogic;

public class Main {
    public static void main(String[] args) {
        String firstString = "description,main,maintenance-polimorfism encapsulation, bodies";
        MainInterface first = new FirstLogic(firstString);
        MainInterface second = new SecondLogic(firstString);
        MainInterface third = new ThirdLogic(firstString);
        MainInterface[] array = {first, second, third};
        for (int i = 0; i < array.length; i++) {
            array[i].show();
            System.out.println();
        }
    }
}
