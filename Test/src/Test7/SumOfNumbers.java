package Test7;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number A: ");//Введите число А
        int A = in.nextInt();

        System.out.print("Enter the number B: ");//Введите число B
        int B = in.nextInt();

        System.out.print("Enter step D: ");//Введите число D
        int D = in.nextInt();

        in.close();//метод закрытия потока ввода-ввывода класса Scanner

        int sum = 0;

        //В цикле задаем интервал от А до В с шагом D
        for (int i = A; i <= B; i = i + D) { //i=i+D тоже самое i+=D, но в цикле нельзя применить
            sum = sum + i;//sum=+i; одно и тоже
        }
        //Сумма всех чисел в диапазоне от A до B c шагом D
        System.out.println("The sum of all numbers in the range from A to B in step D = " + sum);
    }
}
