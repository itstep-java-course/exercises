package com.itstep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExtendingGenericsExample {
    public static void main(String[] args) {
//        1.
//        List<String> lstr = new ArrayList<>();
//        List<Object> lobj = new ArrayList<>();
//        compile error
//        lobj = lstr;
//        lstr = lobj;

//        2.
//        List<String> lstr = new ArrayList<>();
//        Collection<String> cstr = new ArrayList<>();
//        cstr = lstr;

//        3.
//        List<String> lstr = new ArrayList<>();
//        List<Object> lobj = new ArrayList<>();
//        test(lstr);
//        test(lobj);


    }

    private static void test(Collection<String> collection) {
        for (String s : collection) {
            System.out.println(s);
        }
    }
}
