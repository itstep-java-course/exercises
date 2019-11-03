package com.itstep.string.array.shyrkov_homework;

public class Task2 {
    public static void main(String[] args) {
        String s = "hello_java_world";
        String[] arr = s.split("_");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].substring(1, 3));
            arr[i] = arr[i].replace("o", "$");
            System.out.println(arr[i]);
        }
    }
}
