package task3;

public class TernaryOperator {

    public static void main(String[] args) {

        boolean isGoingToCourse;

        isGoingToCourse = isMoodGood() ? goToCourse() : stayAtHome();

    }

    private static boolean isMoodGood () {
        boolean goodMood = false;                       //change according to your mood

        if (goodMood) {
            System.out.println("I feel great");
        } else {
            System.out.println("I feel awful");
        }

        return goodMood;
    }

    private static boolean goToCourse () {
        System.out.println("I'm going to the course");
        return true;
    }

    private static boolean stayAtHome () {
        System.out.println("I'll probably skip the class");
        return false;
    }

}
