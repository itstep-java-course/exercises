package com.itstep.stream.chubuk_classwork;

import java.util.List;

public class MappingExemple {
    public static void main(String[] args) {
        Tag tag1 = new Tag("name", "job1");
        Tag tag2 = new Tag("name", "job2");
        Tag tag3 = new Tag("name", "job3");
        Tag tag4 = new Tag("description", "description1");
        Tag tag5 = new Tag("description", "description2");

        Tag tag6 = new Tag("description", "description3");
        Tag tag7 = new Tag("description", "description4");
        Tag tag8 = new Tag("flied", "Flied1");
        Tag tag9 = new Tag("flied", "Flied2");
        Tag tag10 = new Tag("flied", "Flied3");

        JobDefinition jd1 = new JobDefinition("job1", "Copy Files");

    }

    private static class JobDefinition {
        private final String name;
        private final String id;
        private List<Tag> tags;

        private JobDefinition(String name, String id) {
            this.name = name;
            this.id = id;
            this.tags = tags;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public void addTag(Tag tag) {
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

    private static class Tag {
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
    }
}
