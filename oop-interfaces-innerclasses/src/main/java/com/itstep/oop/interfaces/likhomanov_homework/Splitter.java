package com.itstep.oop.interfaces.likhomanov_homework;

final class Splitter {

    static Modifiable[] splitLine(String line, String delimiters) {

        String[] strings = line.split(delimiters);

        Modifiable[] words = new Modifiable[strings.length];

        for (int i = 0; i < strings.length; ++i) {
            words[i] = new Word(strings[i]);
        }

        return words;
    }
}
