package com.itstep.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("id1", "v1");
        map.put("id2", "v2");
        map.put("id3", "v3");
        map.put("id4", "v4");
        map.put("id5", "v5");

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("id1", "v1");
        linkedHashMap.put("id2", "v2");
        linkedHashMap.put("id3", "v3");
        linkedHashMap.put("id4", "v4");
        linkedHashMap.put("id5", "v5");

        map.get("inn");

        System.out.println("get by key");
        final String v3 = map.get("id3");
        System.out.println(v3);
        System.out.println("------/------/------/------/------/------/------/------/");


        for (Map.Entry<String, String> entry : map.entrySet()) {
            final String key = entry.getKey();
            final String value = entry.getValue();

            System.out.println("key: " + key + " value: " + value);
        }

        System.out.println("------/------/------/------/------/------/------/------/");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            final String key = entry.getKey();
            final String value = entry.getValue();

            System.out.println("key: " + key + " value: " + value);
        }

//        так нельзя тк не Iterable
//        for (Map.Entry<String, String> entry : map) {
//            final String key = entry.getKey();
//            final String value = entry.getValue();
//        }

        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("id1", "v1");
        map1.put("id2", "v1");
        map1.put("id3", "v1");
        map1.put("id4", "v1");
        map1.put("id5", "v1");

        System.out.println("------/------/------/------/------/------/------/------/");
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            final String key = entry.getKey();
            final String value = entry.getValue();

            System.out.println("key: " + key + " value: " + value);
        }

        final boolean hasValue = map1.getOrDefault("id22", "default").equals("s3");

        System.out.println(hasValue);

        final boolean hasValue1 = map1.getOrDefault("id1", "default").equals("v1");

        System.out.println(hasValue1);
    }
}
