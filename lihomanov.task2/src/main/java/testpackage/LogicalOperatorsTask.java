package testpackage;

public class LogicalOperatorsTask {

    public static void main(String[] args) {

        if (didBossCall() || isWokeUpOnTime() && !isRaining()) {
            System.out.println("I'm going to work:(");
        } else {
            System.out.println("I'll stay at home:)");
        }

    }

    private static boolean isWokeUpOnTime() {
        return false;
    }

    private static boolean isRaining() {
        return true;
    }

    private static boolean didBossCall() {
        return false;
    }

}
