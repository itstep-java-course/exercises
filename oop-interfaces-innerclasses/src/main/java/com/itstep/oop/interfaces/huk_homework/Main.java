package com.itstep.oop.interfaces.huk_homework;

public class Main {
    public static void main(String[] args) {

        String str = "description,main,maintenance-polimorfism encapsulation, bodies";

        SplitLine splitLine = new SplitLine();
        String[] str1 = splitLine.split(str);

        //System.out.println("==========================");
        Reverse reverse = new Reverse();
        String[] reversed = reverse.doTransformArray(str1);
        ShowStrings.Print(reversed);
        //ShowStrings.Print(reverse.doReverseArray(str1));

        //System.out.println("==========================");
        Hide hide = new Hide();
        String[] hided = hide.doTransformArray(str1);
        ShowStrings.Print(hided);

        //System.out.println("==========================");
        HideSix hideSix = new HideSix();
        String[] hidedSix = hideSix.doTransformArray(str1);
        ShowStrings.Print(hidedSix);
    }
}
