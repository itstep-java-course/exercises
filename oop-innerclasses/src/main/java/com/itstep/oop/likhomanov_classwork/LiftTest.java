package com.itstep.oop.likhomanov_classwork;

import com.itstep.oop.likhomanov_classwork.lift.Lift;

import java.util.Scanner;

public class LiftTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Lift lift = Lift.getInstance(6);

        do {
            System.out.println("Type the number of passengers to enter the lift...");
            lift.comeIn(in.nextInt());
            in.nextLine();

            System.out.println("Press any button:");
            for (String button : lift.getButtons()) {
                System.out.print("| " + button + " |");
            }
            System.out.println();
            lift.pressButton(in.nextLine());

            System.out.println("Passengers can leave the lift...");
            lift.getOut();
            System.out.println("========================================================");
        } while (true);
    }
}
