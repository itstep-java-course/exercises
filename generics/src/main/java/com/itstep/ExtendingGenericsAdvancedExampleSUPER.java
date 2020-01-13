package com.itstep;

import com.itstep.ExtendingGenericsAdvancedExampleEXTEND.Camera;
import com.itstep.ExtendingGenericsAdvancedExampleEXTEND.Phone;
import com.itstep.ExtendingGenericsAdvancedExampleEXTEND.Product;

import java.util.*;

public class ExtendingGenericsAdvancedExampleSUPER {
    public static void main(String[] args) {

        List<Camera> cameras = Collections.singletonList(new Camera("name", 12.0, 12));

        List<Phone> phones = Collections.singletonList(new Phone("name1", 13.0, "xp"));

        List<Product> products = new ArrayList<>();

        copy3(cameras, products);

        copy3(phones, products);

        System.out.println(products);

        final Product product = products.get(0);

//        Map<String, String> map = new HashMap<>();
//
//        final String put1 = map.put("1", "2");
//        System.out.println("put 1 " + put1);
//
//        final String put2 = map.put("1", "3");
//        System.out.println("put 2 " + put2);
    }

    //    source - extends
    //    dest - super
    static void copy3(List<? extends Product> l1, List<? super Product> l2) {
        for (Product o : l1) {
            l2.add(o);
        }
    }

    static void copy(List l1, List l2) {
        for (Object o : l1) {
            l2.add(o);
        }
    }

    static void copy2(List<Product> l1, List<Product> l2) {
        for (Product o : l1) {
            l2.add(o);
        }
    }

//    static void copy3(List<? extends Product> l1, List<? extends Product> l2) {
//        for (Product o : l1) {
//            l2.add(o);
//        }
//    }


}
