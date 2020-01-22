package com.itstep.dudkin_homework;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<File> files = createNewFiles();
        setInitialData(files.get(0), files.get(1));
        List<String> lines = groupById(files.get(0), files.get(1));
        File file3 = writeToNewFile(lines);
        lines = addAge(file3);
        commitChanges(file3, lines);
    }

    public static ArrayList<File> createNewFiles() throws IOException {
        final File file1 = new File("input-output/src/main/java/com/itstep/dudkin_homework/myData/text1.txt");
        final File file2 = new File("input-output/src/main/java/com/itstep/dudkin_homework/myData/text2.txt");
        file1.createNewFile();
        file2.createNewFile();
        ArrayList<File> files = new ArrayList<>(2);
        files.add(file1);
        files.add(file2);
        return files;
    }

    public static void setInitialData(File file1, File file2) throws IOException {
        BufferedWriter writer1 = new BufferedWriter(new FileWriter(file1));
        writer1.write("id;name;last_name\n1;Petr;Maksimov\n5;Ivan;Egorov\n2;Petr;Rakul\n3;Miha;Dobkin\n4;Danil;Maksimov");
        writer1.close();
        BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2));
        writer2.write("id;street;house\n1;Gagarina;25\n2;Pushkina;17\n4;Nauki;7\n5;Bajana;33\n3;Derjavinska;18");
        writer2.close();
    }

    public static List<String> groupById(File file1, File file2) throws IOException {
        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedReader reader2 = new BufferedReader(new FileReader(file2));
        SortedSet<HumanData> humanData = new TreeSet<>();
        List<String> lines = new LinkedList<>();
        lines.add(reader1.readLine() + reader2.readLine());
        String line;
        while ((line = reader1.readLine()) != null) {
            String[] info = line.split(";");
            humanData.add(new HumanData(Integer.parseInt(info[0]), info[1], info[2]));
        }
        while ((line = reader2.readLine()) != null) {
            String[] info = line.split(";");
            humanData.add(new HumanData(info[1], info[2], Integer.parseInt(info[0])));
        }
        reader1.close();
        reader2.close();
        for (HumanData humanData1 : humanData) {
            lines.add(humanData1.getAllInfo());
        }
        return lines;
    }

    public static File writeToNewFile(List<String> lines) throws IOException {
        final File file = new File("input-output/src/main/java/com/itstep/dudkin_homework/myData/text3.txt");
        file.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (String str : lines) {
            writer.write(str + "\n");
        }
        writer.close();
        return file;
    }

    public static List<String> addAge(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<String> list = new LinkedList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            list.add(line);
        }
        reader.close();
        line = list.get(0);
        list.remove(0);
        list.add(0, line + ";age");
        for (int i = 1; i < list.size(); i++) {
            line = list.get(i);
            list.remove(i);
            list.add(i, line + ";" + (int) (Math.random() * 40 + 10));
        }
        return list;
    }

    public static void commitChanges(File file, List<String> lines) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (String str : lines) {
            writer.write(str + "\n");
        }
        writer.close();
    }

    static class HumanData implements Comparable<HumanData> {
        private Integer id;
        private String name;
        private String lastName;
        private String street;
        private String house;

        HumanData(int id, String name, String lastName) {
            this.id = id;
            this.name = name;
            this.lastName = lastName;
        }

        HumanData(String street, String house, int id) {
            this.id = id;
            this.house = house;
            this.street = street;
        }

        public String getAllInfo() {
            return id + ";" + name + ";" + lastName + ";" + street + ";" + house;
        }

        @Override
        public int compareTo(HumanData o) {
            if (this.id.compareTo(o.id) == 0) {
                o.house = this.house;
                o.street = this.street;
                return 0;
            } else
                return this.id.compareTo(o.id);
        }
    }
}

