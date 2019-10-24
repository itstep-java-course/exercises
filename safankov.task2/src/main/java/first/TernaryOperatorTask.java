package first;

public class TernaryOperatorTask {
        public static void main(String args[]) {
            String decision =  badMood()?stayAtHome():go();
            System.out.println(decision);
        }
        private static boolean badMood(){
            return false;
        }
        private static String go(){
            return "Go to step courses";
        }
        private static String stayAtHome(){
            return "Stay at home";
        }
}

