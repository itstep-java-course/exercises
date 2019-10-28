package com.itstep.string.array.shyrkov_classwork;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class StringTask1 {
    public static void main(String[] args) {
        String s = "ololo";
        String s1 = s + "2";
        System.out.println("s = " + s + "\ns1 = " + s1);
        System.out.println("s equals s1 = " + s.equals(s1));
        System.out.println("s1 contains s = " + s1.contains(s));
        System.out.println("s substring 1-4 = " + s.substring(1, 4));
        System.out.println("s endWith olo = " + s.endsWith("olo"));
        System.out.println("s isEmpty = " + s.isEmpty());
        System.out.println("s replace l-h = " + s.replace("l", "h"));
        System.out.println("s indexOf l = " + s.indexOf("l"));
        System.out.println("s intern = " + s.intern()); //Принудительное добавление строки в пулл строк
        System.out.println("s toCharArray = " + Arrays.toString(s.toCharArray()));
        System.out.println("s charAt 4 = " + s.charAt(4));
        System.out.println("s split l = "+ Arrays.toString(s.split("l")));
        System.out.println("s length = " + s.length());
    }
}
