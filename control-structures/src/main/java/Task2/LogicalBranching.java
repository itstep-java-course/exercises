package main.java.Task2;

public class LogicalBranching {
    public static void main(String[] args) {
        System.out.println((goodMood()) ? "I'll go to classes." : "I'll stay at home.");
    }

    private static boolean goodMood() {
        System.out.println("Good Mood method is called!");
        return true;

    }
}
