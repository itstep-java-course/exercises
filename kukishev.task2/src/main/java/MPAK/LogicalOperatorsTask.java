package MPAK;

public class LogicalOperatorsTask
{
    public static void main(String[] args) {
        if (bossCall() || wakeUp() && !Rain()) {
            run();
        } else {
            gdeMoyoPivo();
        }
    }

    private static boolean bossCall() {
        System.out.println("ok");
        return false;
    }

    private static boolean Rain() {
        System.out.println("ok");
        return true;
    }

    private static boolean wakeUp() {
        System.out.println("ok");
        return true;

    }
    private static void run() {
        System.out.println("naRabotu");}
    private static void gdeMoyoPivo(){
        System.out.println("gdeMoyoPivo");
    }
}
