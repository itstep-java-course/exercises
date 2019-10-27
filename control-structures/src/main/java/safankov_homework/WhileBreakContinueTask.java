package safankov_homework;

public class WhileBreakContinueTask {
    public static void main(String[] args) {
        int x = 20;
        while(x>0){
            if (x % 2 != 0) {
                x--;
                continue;
            }
            System.out.println(x);
            if(x==2) {
                break;
            }
            x--;
        }
    }
}
