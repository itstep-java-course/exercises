package first;

public class LogicalOperatorsTask {
    public static void main(String[] args) {
        if (wakeUpInTime() && rain() || collBoss()) {
            go();
        } else {
            sleep();
        }
    }
    private static boolean wakeUpInTime() {
        System.out.println("Is time method is called.");
        return false;
    }

    private static boolean rain() {
        System.out.println("has umbrella method is called.");
        return true;
    }

    private static boolean collBoss() {
        System.out.println("Is colling method is called.");
        return true;
    }

    private static void sleep() { System.out.println("Cool. I'm going for a sleep");
    }

    private static void go() {
        System.out.println("I will go to work");
    }
}
