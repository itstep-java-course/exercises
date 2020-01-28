package com.itstep.stream.perepeliatnyk;

import java.util.ArrayList;
import java.util.List;

public class MappingExample {
    public static void main(String[] args) {
        Tag tag1 = new Tag("name", "job1");
        Tag tag2 = new Tag("name", "job2");
        Tag tag3 = new Tag("name", "job3");
        Tag tag4 = new Tag("description", "Description1");
        Tag tag5 = new Tag("description", "Description2");
        Tag tag6 = new Tag("description", "Description3");
        Tag tag7 = new Tag("description", "Description4");
        Tag tag8 = new Tag("field", "Field1");
        Tag tag9 = new Tag("field", "Field2");
        Tag tag10 = new Tag("field", "Field3");



    }
    private static class JobDefinition{
        private final String name;
        private final String id;
        private final List<Tag> tags;

        public JobDefinition(String name, String id) {
            this.name = name;
            this.id = id;
            this.tags = new ArrayList<>();
        }


        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public void addTag(Tag tag){

            this.tags.add(tag);
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
    private static class Tag{

        private final String name;
        private final String value;

        private Tag(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public String getValue() {
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
