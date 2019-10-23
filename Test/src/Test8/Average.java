package Test8;

public class Average {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 100;
        int Sum = 0;
        double Average = 0;
        int Count = 0;

        for (int i = 1; i <= 100; i++) {
            Sum = Sum + i;
            Count++;
        }

        Average = (double) Sum / Count;//используем приведение типов к double, так как мы пытаемся поделить int на int
        // Sum(это int) / Count (тоже int), а нам для деления нужен double(при делении числа на число большая вероятность
        // что будет дробная часть. Пример: 1 / 2 = 0.5

        //Среднее арифметическое последовательности чисел от 1 до 100
        System.out.println("Average of numbers from 1 to 100 = " + Average);
    }
}
