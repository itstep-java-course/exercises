package com.itstep.string.array.dudkin_homework;

public class SecondTask {
    public static void main(String[] args) {
        String str="hello_java_world";
        String[]strA=str.split("_");
        for(int i=0;i<3;i++)
            System.out.println(strA[i].substring(1,3));
        System.out.println("");
        for (int i = 0; i <3 ; i++) {
            System.out.println(strA[i].replace("o","$"));
        }
    }
}
