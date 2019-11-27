package com.itstep.oop.interfaces.perepeliatnyk_homework;

public final class Splitter {

    public static Modifiable[] getReplaceable(String str, String regex){

        String[] strings = str.split(regex);

        Modifiable[] words = new Modifiable[strings.length];

        for (int i = 0; i < strings.length ; i++) {
            words[i] = new ReplaceableWord(strings[i]);


        }
        return words;
    }

    public static Modifiable[] getReversible(String str, String regex){

        String[] strings = str.split(regex);

        Modifiable[] words = new Modifiable[strings.length];

        for (int i = 0; i < strings.length ; i++) {
            words[i] = new ReversibleWord(strings[i]);


        }
        return words;
    }

    public static Modifiable[] getLongReplaceableWord(String str, String regex){

        String[] strings = str.split(regex);

        Modifiable[] words = new Modifiable[strings.length];

        for (int i = 0; i < strings.length ; i++) {
            words[i] = new LongReplaceableWord(strings[i]);


        }
        return words;
    }
}
