package com.itstep.oop.interfaces.borovoy_homework;

 class SourceStringSplitter {
    private final String sourceStr;

     SourceStringSplitter(String sourceStr) {
        this.sourceStr = sourceStr;
    }

     String[] makeSplit() {
        return sourceStr.split("[/ ,-]+");
    }
}
