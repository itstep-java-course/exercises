package com.itstep.stream.borovoy_classwork;

import java.util.ArrayList;
import java.util.List;

public class MapingExample {
    public static void main(String[] args) {
        JobDefinition.Tag tag1=new JobDefinition.Tag("name", "Job1");
        JobDefinition.Tag tag2=new JobDefinition.Tag("name", "Job2");
        JobDefinition.Tag tag3=new JobDefinition.Tag("name", "Job2");
        JobDefinition.Tag tag4=new JobDefinition.Tag("description", "Description1");
        JobDefinition.Tag tag5=new JobDefinition.Tag("description", "Description2");
        JobDefinition.Tag tag6=new JobDefinition.Tag("description", "Description3");
        JobDefinition.Tag tag7=new JobDefinition.Tag("description", "Description4");
        JobDefinition.Tag tag8=new JobDefinition.Tag("field", "Field1");
        JobDefinition.Tag tag9=new JobDefinition.Tag("field", "Field2");
        JobDefinition.Tag tag10=new JobDefinition.Tag("field", "Field3");


    }
    public static class JobDefinition{
        private final String name;
        private final String id;
        private final List<Tag> tags;
        private  static class Tag{
            private final String name;
            private final String value;

            public Tag(String name, String value) {
                this.name = name;
                this.value = value;
            }
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        @Override
        public String toString() {
            return "JobDefinition{" +
                    "name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    ", tags=" + tags +
                    '}';
        }

        public JobDefinition(String name, String id) {
            this.name = name;
            this.id = id;
            this.tags = new ArrayList<>();
        }
        public void addTag(Tag tag){
            this.tags.add(tag);
        }
    }
}
