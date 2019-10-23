package valera;

public class LogicalOperatorsTask {


    public static void main(String[] args) {
        if (callBoss() || istimeok() && rainno()) {
            goWork();
        } else {
            stayAtHome();
        }
    }

    private static boolean callBoss() {
        System.out.println("Босс позвонил");
        return false ;

    }


    private static boolean istimeok() {
        System.out.println("Вовремя");
        return false;
    }

    private static boolean rainno() {
        System.out.println("Нет дождя");
        return true;
    }

    private static void goWork() {
        System.out.println("Иду на работу");
    }

    private static void stayAtHome() {
        System.out.println("Буду дома");
    }
}