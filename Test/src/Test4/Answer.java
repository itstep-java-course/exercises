package Test4;
import java.util.Scanner;
//Так как класс Scanner находится в пакете java.util,
// то мы вначале его импортируем с помощью инструкции import java.util.Scanner.

public class Answer {
    public static void main(String[] args) {

        //Для получения ввода с консоли в классе System определен объект in.
        //Однако непосредственно через объект System.in не очень удобно работать, поэтому, как правило,
        // используют класс Scanner, который, в свою очередь использует System.in.

        //Для создания самого объекта Scanner в его конструктор передается объект System.in.
        //После этого мы можем получать вводимые значения. Например, в данном случае вначале выводим приглашение
        // к вводу и затем получаем вводимое число в переменную num.
        //Чтобы получить введенное число, используется метод in.nextInt();,
        // который возвращает введенное с клавиатуры целочисленное значение.

    /*
            Класс Scanner имеет еще ряд методов, которые позволяют получить введенные пользователем значения:

    next(): считывает введенную строку до первого пробела

    nextLine(): считывает всю введенную строку

    nextInt(): считывает введенное число int

    nextDouble(): считывает введенное число double

    nextBoolean(): считывает значение boolean

    nextByte(): считывает введенное число byte

    nextFloat(): считывает введенное число float

    nextShort(): считывает введенное число short

            То есть для ввода значений каждого примитивного типа в классе Scanner определен свой метод.
    */

        Scanner in = new Scanner(System.in);

        System.out.print("Input a number num1 = ");
        int num1 = in.nextInt();

        System.out.print("Input a number num2 = ");
        int num2 = in.nextInt();

        System.out.print("Input a number num3 = ");
        int num3 = in.nextInt();

        in.close();//метод закрытия потока ввода-ввывода класса Scanner
        /*

        // переменные можно назвать a, b, c;
        int num1 = 1; //int num1 = 1; //int num1 = 2; //int num1 = 3; //int num1 = 3;
        int num2 = 2; //int num2 = 1; //int num2 = 2; //int num2 = 2; //int num2 = 4;
        int num3 = 3; //int num3 = 1; //int num3 = 1; //int num3 = 3; //int num3 = 4;
        */

        //когда (a>b и a>c)
        if (num1 > num2 && num1 > num3) {
            System.out.println("Число num1 большее, num1 = " + num1);
        }
        //когда (b>a и b>c)
        if (num2 > num1 && num2 > num3) {
            System.out.println("Число num2 большее, num2 = " + num2);
        }
        //когда (c>a и c>b)
        if (num3 > num1 && num3 > num2) {
            System.out.println("Число num3 большее, num3 = " + num3);
        }

//-------------------------------------------------------------------------------------
        //когда a=b=c
        if (num1 == num2 && num1 == num3) {
            System.out.println("Числа равны: num1 = num2 = num3 = " + num1);
        }
//-------------------------------------------------------------------------------------

        //когда (a=b)>c
        if (num1 == num2 && num1 > num3) {
            System.out.println("Число num1 = num2 и больше num3, num1 = num2 = " + num1);
        }
        //когда (a=c)>b
        if (num1 == num3 && num1 > num2) {
            System.out.println("Число num1 = num3 и больше num2, num1 = num3 = " + num1);
        }
        //когда (b=c)>a
        if (num2 == num3 && num2 > num1) {
            System.out.println("Число num2 = num3 и больше num1, num2 = num3 = " + num2);
        }
    }
}
