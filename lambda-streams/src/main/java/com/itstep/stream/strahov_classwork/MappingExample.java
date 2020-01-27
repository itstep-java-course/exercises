package com.itstep.stream.strahov_classwork;


import java.util.ArrayList;
import java.util.List;

public class MappingExample {
    private static class JobDefinition{
        private final String name;
        private final String id;
        private final List<Tag> tags;

        private JobDefinition(String name, String id, List<Tag> tags) {
            this.name = name;
            this.id = id;
            this.tags = new ArrayList<>();
        }
        public void addTag(Tag tag){
            this.tags.add(tag);
        }
        public String getName(){
            return name;
        }
        public String getId(){
            return id;
        }

    }
    private static class Tag{
        private final String name;
        private final String value;

        @Override
        public String toString() {
            return "Tag{" +
                    "name='" + name + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }

        public Tag(String name, String value){
            this.name= name;
            this.value=value;
        }
    }
    public static void main (String args[]){
        Tag tag1= new Tag("name","job1");
        Tag tag2= new Tag("name","job2");
        Tag tag3= new Tag("name","job3");
        Tag tag4= new Tag("discription","discription1");
        Tag tag5= new Tag("discription","discription2");
        Tag tag6= new Tag("discription","discription3");
        Tag tag7= new Tag("discription","discription4");
        Tag tag8= new Tag("field","field1");
        Tag tag9= new Tag("field","field2");
        Tag tag10= new Tag("field","field3");

        JobDefinition jb1= new JobDefinition("id1","copy files1");
        jb1.addTag(tag1);
        jb1.addTag(tag3);
        jb1.addTag(tag4);
        jb1.addTag(tag7);
    }
}
