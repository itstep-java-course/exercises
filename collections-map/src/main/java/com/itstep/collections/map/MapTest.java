package com.itstep.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("id1", "java");

        final Set<String> set = map.keySet();

        final Collection<String> values = map.values();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            final String key = entry.getKey();
            final String value = entry.getValue();
        }

//        так нельзя тк не Iterable
//        for (Map.Entry<String, String> entry : map) {
//            final String key = entry.getKey();
//            final String value = entry.getValue();
//        }

        final String value = map.get("id1");

        System.out.println(value);
    }
}
