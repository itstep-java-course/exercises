package com.itstep.control.structures.huk_homework;
/*Используя while, break, continue написать следующую логику:
начальное значение переменной х = 20,
используя while уменьшить значение переменной при помощи --,
вывести в консоль только четные числа,
когда х будет равен 2 - прервать выполнение
 */
public class WhileBreakContinueTask {
    public static void main(String[] args) {
        int x = 20;
        while (x >= 0) {
            if (x % 2 != 0) {
                x--;
                continue;
            }
            else if (x == 2)
            {
                break;
            }
            System.out.println("The value of i is: " + x);
            x--;
        }
    }
}

