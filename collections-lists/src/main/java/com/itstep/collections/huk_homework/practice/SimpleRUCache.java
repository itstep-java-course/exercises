package com.itstep.collections.huk_homework.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleRUCache<K,V> extends LinkedHashMap<K,V> {
    private final int capacity;


    public SimpleRUCache(int capacity) {
        super(capacity + 1, 1.1f, true);//сделать Map + 1; loadFactor > 1 чтоб она не росла(не увеличивалась); true чтоб  элементы сортировались как мы к ним достукиваемся
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > capacity;
    }
}
