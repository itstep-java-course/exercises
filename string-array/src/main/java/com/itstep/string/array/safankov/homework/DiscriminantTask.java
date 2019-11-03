package com.itstep.string.array.safankov.homework;
import java.util.Scanner;
public class DiscriminantTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = in.nextInt();
        System.out.println("Enter b : ");
        int b = in.nextInt();
        System.out.println("Enter c : ");
        int c = in.nextInt();

        int d = (int)Math.pow(b,2)-(4*a*c);
        if(d>0){
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if(d==0){
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else
            System.out.println("No solutions");
    }
}
