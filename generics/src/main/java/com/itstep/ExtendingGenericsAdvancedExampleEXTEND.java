package com.itstep;

import java.util.ArrayList;
import java.util.List;

public class ExtendingGenericsAdvancedExampleEXTEND {
    public static void main(String[] args) {
        List<Camera> cameras = new ArrayList<>();

//        isProductExists(cameras, new Camera("name", 12.0, 20));
// with ?
// with T

    }

    static boolean isProductExists(List<Product> products, Product product) {
        for (Product p : products) {
            if (p.name.equals(product.name)){
                return true;
            }
        }
        return false;
    }

    public static class Product {
        final String name;
        final double price;

        private Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static class Camera extends Product {
        private final int pixel;

        private Camera(String name, double price, int pixel) {
            super(name, price);
            this.pixel = pixel;
        }

        @Override
        public String toString() {
            return "Camera{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", pixel=" + pixel +
                    '}';
        }
    }

    public static class Phone extends Product {
        private final String model;

        private Phone(String name, double price, String model) {
            super(name, price);
            this.model = model;
        }

        @Override
        public String toString() {
            return "Phone{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", model='" + model + '\'' +
                    '}';
        }
    }

//    bounded type parameter
    private static class Container<T extends Product & Comparable<T>> {
        private T item;

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }
}
