package com.itstep.likhomanov_homework.testing_streams_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.itstep.likhomanov_homework.testing_streams_api.Sex.*;

public class StreamsTest {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a1", "a2", "a3", "a1");

        //count some elements
        long numberOfA1 = strings.stream()
                                .filter("a1"::equals)
                                .count();
        System.out.println(numberOfA1);

        //find first element
        String firstStr = strings.stream()
                                .findFirst()
                                .orElse("0");
        System.out.println(firstStr);

        //find last element
        String lastStr = strings.stream()
                                .skip(strings.size() - 1)
                                .findFirst()
                                .orElse("empty");
        System.out.println(lastStr);

        //find first specific element or throw an exception
        String firstA3 = strings.stream()
                                .filter("a3"::equals)
                                .findFirst()
                                .get();
        System.out.println(firstA3);

        //pick Nth element
        String thirdStr = strings.stream()
                                .skip(2)
                                .findFirst()
                                .get();
        System.out.println(thirdStr);

        //pick N elements beginning with Nth element
        Arrays.stream(strings.stream()
                            .skip(1)
                            .limit(2)
                            .toArray())
                            .forEach(s -> System.out.print(s + " "));
        System.out.println();

        //find all specific elements
        Arrays.stream(strings.stream()
                            .filter(s -> s.contains("1"))
                            .toArray())
                            .forEach(s -> System.out.print(s + " "));
        System.out.println();

        List<Person> people = Arrays.asList(new Person("Sam", 21, WOMAN),
                                            new Person("Sam", 21, WOMAN),
                                            new Person("Will", 25, MAN),
                                            new Person("Bill", 34, MAN),
                                            new Person("Bill", 34, MAN),
                                            new Person("Jami", 17, MAN),
                                            new Person("Jill", 33, WOMAN),
                                            new Person("Jill", 33, WOMAN),
                                            new Person("John", 18, MAN),
                                            new Person("Arnold", 41, MAN),
                                            new Person("Brad", 68, MAN),
                                            new Person("Elizabeth", 60, WOMAN),
                                            new Person("Elsa", 26, WOMAN));

        List<Person> militaryObligedMen = people.stream()
                                                .filter(person -> person.getSex() == MAN &&
                                                        person.getAge() >= 18 &&
                                                        person.getAge() < 28)
                                                .collect(Collectors.toList());
        System.out.println(militaryObligedMen);

        double averageMenAge = people.stream()
                                    .filter(person -> person.getSex() == MAN)
                                    .mapToInt(Person::getAge)
                                    .average()
                                    .getAsDouble();
        System.out.println(averageMenAge);

        long potentialWorkers = people.stream()
                                    .filter(person -> person.getAge() >= 18)
                                    .filter(person ->
                                            (person.getSex() == WOMAN && person.getAge() < 55) ||
                                            (person.getSex() == MAN && person.getAge() < 60))
                                    .count();
        System.out.println(potentialWorkers);

        List<Person> orderedUniquePeople = people.stream()
                                                .distinct()
                                                .collect(Collectors.toList());
        System.out.println(orderedUniquePeople);

        Set<Person> notOrderedCollection = new HashSet<>(people);
        List<Person> notOrderedUniquePeople = notOrderedCollection.stream()
                                                                .distinct()
                                                                .collect(Collectors.toList());
        System.out.println(notOrderedUniquePeople);

        boolean containsElsa = people.stream()
                                    .anyMatch(person -> person.getName().equals("Elsa"));
        System.out.println("There is Elsa: " + containsElsa);

        boolean containsGeorge = people.stream()
                                        .anyMatch(person -> person.getName().equals("George"));
        System.out.println("There is George: " + containsGeorge);

        boolean noGeorge = people.stream()
                                .noneMatch(person -> person.getName().equals("George"));
        System.out.println("There is no George: " + noGeorge);

        boolean noTeens = people.stream()
                                .allMatch(person -> person.getAge() > 16);
        System.out.println("Everyone is older 16: " + noTeens);


    }
}
