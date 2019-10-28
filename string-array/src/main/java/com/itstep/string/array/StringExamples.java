package com.itstep.string.array;

public class StringExamples {
    public static void main(String[] args) {
        String s = "value";
        if (s.equals("value")) {
            System.out.println("the objects are the same");
        } else {
            System.out.println("not equals");
        }

        String s2 = "value";
        if (s2.equalsIgnoreCase("Value")) {
            System.out.println("strings are equal");
        } else {
            System.out.println("not equals");
        }
//
        String s3 = "value";
        if (s3.contains("val")) {
            System.out.println("строка содержит");
        } else {
            System.out.println("не содержит");
        }
//
        String s4 = "value";
        String result = s4.substring(2, 4);
        System.out.println(result);

        String result1 = s4.substring(3);
        System.out.println(result1);
//
        String s5 = "value";
        if (s5.endsWith("alue")) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
//
        String s6 = "value";
        if (s6.startsWith("lue")) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
//
        String s66 = "s";
        if (s66.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
//
        String s7 = "newmegastring";
        String result11 = s7.replace("meg", "");
        System.out.println(result11);
//
        String s77 = "value";
        final int l = s77.indexOf("a");
        System.out.println(l);
//
        String s8 = new String("fdfdfd");
        s8.intern();
//
        String s9 = "value";
        final char c = s9.charAt(0);
        System.out.println(c);
//
        String s10 = "veryveryveryveryveryveryveryveryverylongstr";
        System.out.println(s10.length());
//
        String s11 = "value";
        final char[] chars = s11.toCharArray();
        System.out.println(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
//
        String s12 = "value_value_value";
        final String[] s13 = s12.split("_");

        for (String s1 : s13) {
            System.out.println(s1);
        }

        //frequently used methods
        //        s.equals()
        //        s.contains()
        //        s.substring()
        //        s.endsWith()
        //        s.isEmpty()
        //        s.replace()
        //        s.indexOf()
        //        s.intern()
        //        s.toCharArray()
        //        s.charAt()
        //        s.length()
    }
}
