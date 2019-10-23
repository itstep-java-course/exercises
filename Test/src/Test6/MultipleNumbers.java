package Test6;
import java.util.Scanner;

public class MultipleNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number A: ");//Введите число А
        int A = in.nextInt();

        System.out.print("Enter the number B: ");//Введите число B
        int B = in.nextInt();

        in.close();//метод закрытия потока ввода-ввывода класса Scanner

        if ((A % B) == 0) {// % получение остатка от деления двух чисел. Если при делени А(36) на B(6) равно(0)
            System.out.println("Yes! " + A + " is a multiple of " + B + "!");//Число кратное
        } else {
            System.out.println("No! " + A + " is not a multiple of " + B + "!");//Число не кратное
        }
    }
}
