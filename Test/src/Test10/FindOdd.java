package Test10;
import java.util.Scanner;

public class FindOdd {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Enter a range from A to B! \n");//Введите диапазон от А до B

            System.out.print("Enter the number A: ");//Введите число А
            int A = in.nextInt();

            System.out.print("Enter the number B: ");//Введите число B
            int B = in.nextInt();

            in.close();//метод закрытия потока ввода-ввывода класса Scanner

            int SumOdd = 0;//сумма всех нечетных
            for (int i = A; i <= B; i++) {
                if (i % 2 != 0) {//если число нечетное
                    SumOdd = SumOdd + i;//SumEven=+i;//то мы плюсуем его к сумме
                }
            }
            System.out.println("The sum of all even numbers in the range is: = " + SumOdd);//Сумма всех нечетных чисел диапазона равна
        }
    }
