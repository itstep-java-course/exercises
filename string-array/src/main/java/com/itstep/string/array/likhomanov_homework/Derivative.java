package com.itstep.string.array.likhomanov_homework;

import java.util.Scanner;

public class Derivative {

    public static void main(String[] args) {

        double variableP, variableQ, discriminant, sqrtK1, sqrtK2;
        String equation;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите линейное дифференциальное уравнение вида:");
        System.out.println("Y\" - PY' + QY = 0");
        System.out.println("где P, Q - постоянные коэффициенты");

        equation = in.nextLine();

        variableP = getP(equation);
        variableQ = getQ(equation);

        System.out.println("Квадратное уравнение имеет вид:");
        System.out.println("K^2 - " + variableP + "K + " + variableQ + " = 0");

        discriminant = findDiscriminant(variableP, variableQ);
        sqrtK1 = findSqrtK1(variableP, discriminant);
        sqrtK2 = findSqrtK2(variableP, discriminant);

        System.out.println(analiseDiscriminant(sqrtK1, sqrtK2, discriminant));

    }

    private static double getP(String equation) {
        String[] strings = equation.split(" ");
        String number = "";

        for (char c : strings[2].toCharArray()) {
            if (Character.isDigit(c)) {
                number = number + c;
            } else {
                return Double.parseDouble(number);
            }
        }
        return Double.parseDouble(number);
    }

    private static double getQ(String equation) {
        String[] strings = equation.split(" ");
        String number = "";

        for (char c : strings[4].toCharArray()) {
            if (Character.isDigit(c)) {
                number = number + c;
            } else {
                return Double.parseDouble(number);
            }
        }
        return Double.parseDouble(number);
    }

    private static double findDiscriminant(double p, double q) {
        //D = b^2 - 4ac
        return p*p-4*q;
    }

    private static double findSqrtK1(double p, double discriminant) {
        //X = (-b - sqrt(D)) / 2a
        return (p - Math.sqrt(discriminant))/2;
    }

    private static double findSqrtK2(double p, double discriminant) {
        //X = (-b + sqrt(D)) / 2a
        return (p + Math.sqrt(discriminant))/2;
    }

    private static String analiseDiscriminant(double sqrtK1, double sqrtK2, double discriminant) {
        if (discriminant > 0) {
            return "D > 0, корни k1, k2 действительные и различные и равны: \n"
                    + "k1 = " + sqrtK1 + "\n"
                    + "k2 = " + sqrtK2 + "\n"
                    + "Общее решение будет иметь вид:" + "\n"
                    + "Y(X) = C1exp(" + sqrtK1 + "X) + C2exp(" + sqrtK2 + "X)";
        } else if (discriminant == 0) {
            return "D = 0, корни k1, k2 действительные и равны и составляют: \n"
                    + "k1 = " + sqrtK1 + "\n"
                    + "k2 = " + sqrtK2 + "\n"
                    + "Общее решение будет иметь вид:" + "\n"
                    + "Y(X) = (C1X + C2)exp(" + sqrtK1 + "X)";
        } else {
            return "D < 0, корни k1, k2 мнимые, т.е. вещественных корней нет";
        }
    }
}
