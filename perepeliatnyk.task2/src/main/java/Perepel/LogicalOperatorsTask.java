package Perepel;

public class LogicalOperatorsTask {
    public static void main(String[] args) {
        if (theChiefWillCall() || iWakeUpOnTime() && itWillNotRain()) {
            run();
        } else {
            stay();
        }
    }

    private static boolean iWakeUpOnTime() {
        System.out.println("i wake up on time");
        return true;
    }

    private static boolean itWillNotRain() {
        System.out.println("it will not rain");
        return true;
    }

    private static boolean theChiefWillCall() {
        System.out.println("the chief will call");
        return true;
    }
    private static void run() {
        System.out.println("Run to job");
    }

    private static void stay() { System.out.println("Stay at home");
    }




}
