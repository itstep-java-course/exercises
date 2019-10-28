package com.itstep.homework;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println((goodMood()) ? "I'll go to classes." : "I'll stay at home.");
    }

    public static boolean goodMood() {
        System.out.println("Good Mood method is called!");
        return true;
    }
}

