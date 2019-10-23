package LogikOperator;

public class LogicalOperatorsTask {
    public static void main(String[] args) {
        if ((wakeUpOnTime() && !hasRain()) || callBoss()) {
            goToWork();
        } else {
            notGoToWork();
        }
    }

        private static boolean wakeUpOnTime() {
            System.out.println("Wake up on time");
            return true;
        }

        private static boolean hasRain() {
            System.out.println("No rain");
            return true;
        }

        private static boolean callBoss() {
            System.out.println("Call boss");
            return true;
        }

        private static void goToWork() {
            System.out.println("Im Run to work");
        }

        private static void notGoToWork() {
            System.out.println("Im Not go to work");
        }
    }


