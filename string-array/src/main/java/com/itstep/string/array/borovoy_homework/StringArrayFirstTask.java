package com.itstep.string.array.borovoy_homework;

public class StringArrayFirstTask {
    public static void main(String[] args) {
        int n = 0;
        String[] arr = {"Cheese", "Paper", "Task", "Cola", "String"};
        for (int i = 0; i < arr.length; i++, n++) {
            if (arr[i].startsWith("P")) {
                System.out.println("Starts with P=" + arr[i]);
            }
            if (arr[i].endsWith("a")) {
                System.out.println("Ends with a=" + arr[i]);
            }
            if (arr[i].length() <= 5) {
                System.out.println("Arr[].length<=5=" + arr[i]);
            }
        }
        System.out.println("Array.length=" + n);
    }
}

