package com.itstep.oop.interfaces.likhomanov_homework;

class StringSplitter {

    private final String sourceLine;
    private final String regex;

    StringSplitter(String sourceLine, String regex) {
        this.sourceLine = sourceLine;
        this.regex = regex;
    }

    String[] split() {
        return sourceLine.split(regex);
    }
}
