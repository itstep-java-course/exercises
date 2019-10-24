package main.java.shyrkov;

public class LogicalOleratorsTask {
    public static void main(String[] args){
        if(isRinging() || (isWokeInTime() && !isRaining()))
        {
            System.out.println("I go to work!");
        }
        else {
            System.out.println("I still sleep...");
        }
    }

    private static boolean isWokeInTime() {
        System.out.println("Is Woke In Time method is called.");
        return true;
    }

    private static boolean isRaining() {
        System.out.println("Is raining method is called.");
        return true;
    }

    private static boolean isRinging(){
        System.out.println("Is ringing method is called");
        return true;
    }
}
