package com.itstep.cl.object.borovoy_homework;

public class Reverser {
    private String inputString;

    private Reverser(String inputString) {
        this.inputString = inputString;
    }

    private void doReserve() {
        char[] arr = inputString.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }

    public static void main(String[] args) {
        Reverser reversResult = new Reverser("hello");
        reversResult.doReserve();
    }
}

