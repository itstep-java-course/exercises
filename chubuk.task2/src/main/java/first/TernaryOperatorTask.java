package first;

public class TernaryOperatorTask {
    public static void main(String[] args) {
    String decision = goodMood() ? goToCourses() : stayAtHome();

    System.out.println(decision);
}

    private static boolean goodMood() {
        return true;
    }

    private static String goToCourses() {
        return "go to courses";
    }

    private static String stayAtHome() {
        return "stay at home";
    }
}
