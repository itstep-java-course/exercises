package main.java.shyrkov;

public class TernarOperator {
    public static void main(String[] args){
        String res = (isHappy() ? "I will go to java courses" : "I will stay at home");
        System.out.println(res);
    }

    private static boolean isHappy(){
        return true;
    }
}
