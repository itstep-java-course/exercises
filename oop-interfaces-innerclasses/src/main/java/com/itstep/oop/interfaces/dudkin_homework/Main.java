package com.itstep.oop.interfaces.dudkin_homework;

import com.itstep.oop.interfaces.dudkin_homework.program_internals.MainInterface;
import com.itstep.oop.interfaces.dudkin_homework.program_internals.Reverser;
import com.itstep.oop.interfaces.dudkin_homework.program_internals.ReverserWithLimit6;
import com.itstep.oop.interfaces.dudkin_homework.program_internals.SymbolLengthSymbol;

public class Main {
    public static void main(String[] args) {
        String firstString = "description,main,maintenance-polymorphism encapsulation, bodies";
        MainInterface first = new SymbolLengthSymbol(firstString);
        MainInterface second = new Reverser(firstString);
        MainInterface third = new ReverserWithLimit6(firstString);
        MainInterface[] array = {first, second, third};
        for (int i = 0; i < array.length; i++) {
            array[i].show();
            System.out.println();
        }
    }
}
