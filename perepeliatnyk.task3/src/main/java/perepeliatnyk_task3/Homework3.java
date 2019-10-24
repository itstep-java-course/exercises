package perepeliatnyk_task3;

public class Homework3 {
    public static void main(String[] args) {
        boolean runToCourses;
        runToCourses = goodMood() ? run() : stay();

    }
    private static boolean goodMood() {
        boolean goodMood = true;
        if (goodMood) {
            System.out.println("Good Mood");
        } else {
            System.out.println("Bad Mood");
        }
        return goodMood;
    }
    private static boolean run() {
        System.out.println("Run to courses");
        return true;
    }
    private static boolean stay() {
        System.out.println("Stay home");
        return false;
    }
}
