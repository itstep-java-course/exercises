package com.itstep.string.array.huk_homework;

/*2. Написать программу которая считает корни дифференциального уравнения.*/

import java.util.Scanner;

public class DifferentialEquationSqrtDiamond {
    public static void main(String[] args) {
        //Дискриминант D квадратного трёхчлена ax2 + bx + c
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid number a: "); //1
        int a = sc.nextInt();
        System.out.println("Enter a valid number b: "); //4
        int b = sc.nextInt();
        System.out.println("Enter a valid number c: "); //13
        int c = sc.nextInt();
        sc.close(); // закрытие

        //y" + 4y' + 13y = 0
        //k2 + 4k + 13 = 0

        int D = (int) Math.pow(b, 2) - (4 * a * c); //Дискриминант D квадратного трёхчлена ax2 + bx + c   равен b2 - 4ac; -36
        System.out.println("The discriminant of the square trinomial = " + D);

        //Корни квадратного уравнения зависят от знака дискриминанта (D) :
        if (D > 0) { //D > 0 - уравнение имеет 2 различных вещественных корня;
            //Общая формула для нахождения корней квадратного уравнения:
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Root of the number x1 = " + x1);
            System.out.println("Root of the number x2 = " + x2);

        } else if (D == 0) { //D = 0 - уравнение имеет 1 корень (или же 2 совпадающих вещественных корня): x = (-b) / (2 * a);
            double x = (-b) / (2 * a);
            System.out.println("Root of the number x = " + x);

        } else {
            System.out.println("There are no real roots "); //D < 0 - уравнение имеет 2 мнимых корня (т.е. вещественных корней нет).


        }
    }
}

