package com.itstep.string.array.dudkin_classwork;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        String b="javastring";
        Scanner is=new Scanner(System.in);
        Double db=is.nextDouble();
        System.out.println(db);
       String h=b.substring(2,10).substring(2);
       h=h.replace("g","n");
       if(h.endsWith("n"))
        System.out.println(h);
        else
        System.out.println("no");


    }
}
