package Testing;

public class LogicalOperatorsTask {
    /*Я пойду на работу если проснусь во время и не будет дождя или если
            позвонит начальник */
    public static void main(String[] args) {


        if (bossring() || (getupintime() && thereisntrainingoutside())) {
            gotoawork();
        } else {
            stayathome();
        }

    }

    private static boolean getupintime() {
        System.out.println("Get up in time  method is called.");
        return false;
    }

    private static boolean thereisntrainingoutside() {
        System.out.println("There isn't raining outside method is called.");
        return false;
    }

    private static boolean bossring() {
        System.out.println("Boss ring method is called.");
        return true;
    }

    private static boolean stayathome() {
        System.out.println("Stay at home  method is called.");
        return false;
    }

    private static boolean gotoawork() {
        System.out.println("Go to work method is called.");
        return false;
    }
}