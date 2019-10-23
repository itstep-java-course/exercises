package strahovtask2;

public class LogicalOperatorsTask {
    public static void main(String[] args) {
    if (callJob() || sleepToTime() && donRain()){

            drinkBeer();
    } else {

            System.out.println("relax");
    }


}

    private static boolean sleepToTime() {
        System.out.println("i stand in time");
        return false;
    }

    private static boolean donRain() {
        System.out.println("in street dont rain");
        return false;
    }

    private static void run() {
        System.out.println("go to work");
    }

    private static void waiting() {
        System.out.println("dont go to work ");
    }

    private static boolean callJob() {
        return true;
    }

    private static void drinkBeer() {
        System.out.println("go to work");
    }
}
