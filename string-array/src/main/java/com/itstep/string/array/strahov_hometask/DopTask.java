package com.itstep.string.array.strahov_hometask;

public class DopTask {
    public static void main(String[] args) {
        int n = 4;//n это n!
        int results = 1;
        for (int i = 1; i <= n; i++) {
            results = results * i;
            System.out.println(results);
        }
        // решение квадратного уравнения через дискриминант
        double a = 2, b = 4, c = 8;//переменные уравнения
        double D;//дискриминант
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("корни уравнения равны: х1= " + x1 + ", x2= " + x2);
        } else if (D == 0) {
            double x;
            x = -b / 2 * a;
            System.out.println("у уравнения олин корень x= " + x);
        } else
            System.out.println("уравнение не имеет действительных корней ");

        //выведение двухмерного массива в консоль
        int[][] dvuxMassive = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        for (int i = 0; i < 3; i++) {
            for (int i1 = 0; i1 < 4; i1++) {
                System.out.print(" " + dvuxMassive[i][i1] + " ");
            }
        }

    }
}