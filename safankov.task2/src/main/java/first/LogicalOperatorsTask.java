package first;

public class LogicalOperatorsTask {
    public static void main(String[] args) {
        if (wakeTime() && noRain() || phoneCall()) {
            go();
        }
       else{
                stayHome();
            }
        }

    private static boolean wakeTime() {
        System.out.println("Условие пробуждения выполнено");
        return true;
    }

    private static boolean noRain() {
        System.out.println("Отсутсвие дождя выполнено");
        return false;
    }

    private static boolean phoneCall() {
        System.out.println("иду на работу");
        return true;
    }

    private static void go() {
        System.out.println("Go");
    }

    private static void stayHome() {
        System.out.println("Stay");
    }
}