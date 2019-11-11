package com.itstep.cl.object.safankov.object.homework;
public class Reverser {
    private String inputString;
    private Reverser(String inputString){
        this.inputString=inputString;
    }
    private void doReverse(){
    char[] arr = inputString.toCharArray();
        for (int i = arr.length-1; i>=0;i--) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
    Reverser changedString = new Reverser("hello");
    changedString.doReverse();
    }
}
