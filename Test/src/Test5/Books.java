package Test5;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount of money that you have: ");//Введите сумму денег, которая у вас есть
        double Money = in.nextDouble();

        System.out.print("Enter the price of one magazine: ");//Введите цену одного журнала
        double PriceOfMagazine = in.nextDouble();

        System.out.print("Enter the price of one book: ");//Введите цену одной книги
        double PriceOfBook = in.nextDouble();

        System.out.print("Enter the number of magazines you want to buy: ");//Введите количество журналов, которые вы хотите купить
        int NumberOfMagazines = in.nextInt();

        System.out.print("Enter the number of books you want to buy: ");//Введите количество журналов, которые вы хотите купить
        int NumberOfBooks = in.nextInt();

        in.close();//метод закрытия потока ввода-ввывода класса Scanner

        double TotalPriceOfLiterature = 0;//Общая стоимость литературы

        //формула расчета Общей Стоимости Литературы = Количество Журналов * Цену одного Журнала + Количество Книг * Цену одной Книги
        TotalPriceOfLiterature = NumberOfMagazines * PriceOfMagazine + NumberOfBooks * PriceOfBook;

        //если Общая Стоимость Литературы < Денег
        if (TotalPriceOfLiterature < Money) {
            System.out.println("You have enough money :) ");//У вас достаточно денег
        } else {
            System.out.println("You don’t have enough money :( ");//У вас недостаточно денег
        }
    }
}