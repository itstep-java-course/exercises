package com.itstep.oop.likhomanov_homework;

import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Car car = new Car(2, 500);

        do {
            System.out.println("Type in what you want your car to do:");
            System.out.println("1 - speed up; 2 - slow down; 0 - stop");
            car.acceptDriversChoice(in.nextInt());
            in.nextLine();
        } while (true);
    }
}
