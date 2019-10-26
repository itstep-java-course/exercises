package com.itstep.control.structures.huk_homework;
/*С помощью цыкла for вывести только четные числа в диапазоне 0 -100*/
public class ForTask {
    public static void main(String[] args) {
        for (int i = 0; i >= -100; i--) { // от 0 до -100
            //for (int i = -100; i <= 0; i++) { // от -100 до 0
            if (i % 2 == 0) { // Если остаток от деления на 2 равен 0, то число четное
                System.out.println(i);
            }
        }
    }
}
