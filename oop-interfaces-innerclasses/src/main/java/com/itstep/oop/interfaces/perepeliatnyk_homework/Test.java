package com.itstep.oop.interfaces.perepeliatnyk_homework;

public class Test {

    public static void main(String[] args) {
        String str = "description,main,maintenance-polimorfism encapsulation, bodies";

        Modifiable[] words;

        words = Splitter.getReplaceable(str, "\\s*,\\s*|-|\\s");
        for (Modifiable word : words) {
            word.modify();
        }
        System.out.println();

        words = Splitter.getReversible(str, "\\s*,\\s*|-|\\s");
        for (Modifiable word : words) {
            word.modify();
        }
        System.out.println();

        words = Splitter.getLongReplaceableWord(str, "\\s*,\\s*|-|\\s");
        for (Modifiable word : words) {
            word.modify();

        }
    }
}
