package com.itstep.likhomanov_homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingTest {

    public static void main(String[] args) {
        Tag tag1 = new Tag("name", "Job1");
        Tag tag2 = new Tag("name", "Job2");
        Tag tag3 = new Tag("name", "Job3");
        Tag tag4 = new Tag("description", "Description1");
        Tag tag5 = new Tag("description", "Description2");
        Tag tag6 = new Tag("description", "Description3");
        Tag tag7 = new Tag("description", "Description4");
        Tag tag8 = new Tag("field", "Field1");
        Tag tag9 = new Tag("field", "Field2");
        Tag tag10 = new Tag("field", "Field3");

        JobDefinition jd1 = new JobDefinition("job1", "Copy files");
        jd1.addTag(tag1);
        jd1.addTag(tag3);
        jd1.addTag(tag5);
        jd1.addTag(tag7);


        JobDefinition jd2 = new JobDefinition("job2", "Remove files");
        jd2.addTag(tag2);
        jd2.addTag(tag4);
        jd2.addTag(tag6);
        jd2.addTag(tag8);


        JobDefinition jd3 = new JobDefinition("job3", "Load data");
        jd3.addTag(tag1);
        jd3.addTag(tag2);
        jd3.addTag(tag3);
        jd3.addTag(tag4);
        jd3.addTag(tag5);
        jd3.addTag(tag6);
        jd3.addTag(tag7);

        JobDefinition jd4 = new JobDefinition("job4", "Copy files");
        jd4.addTag(tag8);
        jd4.addTag(tag9);
        jd4.addTag(tag10);

        JobDefinition jd5 = new JobDefinition("job5", "Copy files");
        jd5.addTag(tag1);
        jd5.addTag(tag5);
        jd5.addTag(tag10);

        List<JobDefinition> definitions = new ArrayList<>();
        definitions.add(jd1);
        definitions.add(jd2);
        definitions.add(jd3);
        definitions.add(jd4);
        definitions.add(jd5);

        System.out.println("1. Group job definitions by name");
        Map<String, List<JobDefinition>> groupedByName = definitions.stream()
                                                                    .collect(Collectors.groupingBy(JobDefinition::getName));
        groupedByName.entrySet().stream()
                                .peek(entry -> System.out.println("\n" + entry.getKey() + ": "))
                                .flatMap(entry -> entry.getValue()
                                .stream()
                                .peek(jd -> System.out.println(jd.toString())))
                                .count();

        System.out.println("#####################################");
        System.out.println("2. Group job definitions by tag value");
        Map<String, List<JobDefinition>> groupedByTagValue = new HashMap<>();

        for (JobDefinition definition : definitions) {
            for (Tag tag : definition.getTags()) {
                if (groupedByTagValue.get(tag.getValue()) == null) {
                    List<JobDefinition> jds = new ArrayList<>();
                    jds.add(definition);
                    groupedByTagValue.put(tag.getValue(), jds);
                } else {
                    groupedByTagValue.get(tag.getValue()).add(definition);
                }
            }
        }

        System.out.println("#####################################");
        System.out.println("3. Group job definitions by tag value and display (use sout) definition id and name");

        groupedByTagValue.entrySet().stream()
                                    .peek(entry -> System.out.println("\n" + entry.getKey() + ": "))
                                    .flatMap(entry -> entry.getValue()
                                    .stream()
                                    .peek(jd -> System.out.println(jd.getId() + ", " + jd.getName())))
                                    .count();
    }

    private static class JobDefinition {
        private final String id;
        private final String name;
        private final List<Tag> tags;

        JobDefinition(String id, String name) {
            this.id = id;
            this.name = name;
            this.tags = new ArrayList<>();
        }

        String getName() {
            return name;
        }

        String getId() {
            return id;
        }

        void addTag(Tag tag) {
            this.tags.add(tag);
        }

        public List<Tag> getTags() {
            return tags;
        }

        @Override
        public String toString() {
            return "JobDefinition{" +
                    "name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    ", tags=" + tags +
                    '}';
        }
    }

    private static class Tag {
        private final String name;
        private final String value;

        Tag(String name, String value) {
            this.name = name;
            this.value = value;
        }

        String getName() {
            return name;
        }

        String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Tag{" +
                    "name='" + name + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
}
