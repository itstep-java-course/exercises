package com.itstep.stream.huk_classwork;

import java.util.ArrayList;
import java.util.List;

public class MappingExample {
    public static void main(String[] args) {

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

       public  void addTag(String name, String value){
            final Tag tag =new Tag(name, value);
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

        private static class Tag{
            private final String name;
            private final String value;

            public Tag(String name, String value) {
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
}
