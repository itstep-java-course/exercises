package com.itstep.cl.object.chubuk_homework;

public class Reverser
{
    private String inputString;
    private Reverser(String inputString)
    {
        this.inputString=inputString;
    }
    private void doReverse()
    {
        char[] array = inputString.toCharArray();
        for (int i = array.length-1; i >= 0 ; i--)
        {
            System.out.print(array[i]);
        }
    }
    public static void main(String[] args)
    {
        Reverser Resalt = new Reverser("hello");
        Resalt.doReverse();
    }
}
