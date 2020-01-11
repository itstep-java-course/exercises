package com.itstep;

import com.itstep.ExtendingGenericsAdvancedExampleEXTEND.Product;

import java.util.List;

public class ExtendingGenericsAdvancedExampleSUPER {
    public static void main(String[] args) {

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

//    source - extends
//    dest - super
    static void copy3(List<? extends Product> l1, List<? super Product> l2) {
        for (Product o : l1) {
            l2.add(o);
        }
    }


}
