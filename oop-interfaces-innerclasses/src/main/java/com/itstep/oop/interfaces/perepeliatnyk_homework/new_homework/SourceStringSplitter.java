package com.itstep.oop.interfaces.perepeliatnyk_homework.new_homework;

public class SourceStringSplitter {
    private final String sourceStr;

    public SourceStringSplitter(String sourceStr) {
        this.sourceStr = sourceStr;
    }

    public String[] makeSplit() {
        return sourceStr.split("[/ ,-]+");
    }
}

