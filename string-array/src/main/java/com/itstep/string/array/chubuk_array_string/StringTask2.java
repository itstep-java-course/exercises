package com.itstep.string.array.chubuk_array_string;

public class StringTask2
{
    public static void main(String[] args)
    {
        String s="hello_java_world";
        final String[] s2 = s.split("_");
        for (String s1 : s2)
        {
            final char a = s1.charAt(2);
            final char b = s1.charAt(3);
            System.out.println("2s an 3s letter: " + a + "" + b);
            String result = s1.replace("o", "$");
            System.out.println("result with changing: " + result);
        }
    }
}
