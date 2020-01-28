package com.itstep.likhomanov_homework;

import java.util.*;

public class WorkingWithFilesTest {

    public static void main(String[] args) {

        FileGenerator fileGenerator = new FileGenerator();
        FileReader fileReader = new FileReader();
        Map<String, List<String>> groupedData;

        fileGenerator.createFileWithNames();
        fileGenerator.createFileWithAddresses();

        List<String> names = fileReader.readFileWithNames();
        List<String> addresses = fileReader.readFileWithAddresses();

        groupedData = groupById(names, null);
        groupedData = groupById(addresses, groupedData);

        fileGenerator.createFileWithUserProfiles(asList(groupedData));
    }

    private static Map<String, List<String>> groupById(List<String> data, Map<String, List<String>> groupedData){
        Map<String, List<String>> map;
        String[] strings;
        List<String> value;

        if (groupedData == null) map = new TreeMap<>();
        else map = groupedData;

        for (String line : data) {

            if (line.startsWith("id")) continue;

            strings = line.split(";");

            value = new ArrayList<>(Arrays.asList(strings));
            value.remove(0);

            if (map.get(strings[0]) == null) {
                map.put(strings[0], value);
            } else {
                map.get(strings[0]).addAll(value);
            }
        }
        return map;
    }

    private static List<String> asList(Map<String, List<String>> data) {
        List<String> list = new ArrayList<>();
        String info;

        for (String id : data.keySet()) {
            info = id + ";" + valueToString(data.get(id)) + getRandomAge();
            list.add(info);
        }
        return list;
    }

    private static String valueToString(List<String> value) {
        StringBuilder builder = new StringBuilder();
        for (String info : value) {
            builder.append(info).append(";");
        }
        return builder.toString();
    }

    private static String getRandomAge() {
        return String.valueOf(new Random().nextInt(100));
    }
}
