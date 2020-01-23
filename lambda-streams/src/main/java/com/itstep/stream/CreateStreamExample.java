package com.itstep.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamExample {
    public static void main(String[] args) {
//        create stream using stream() method in Collection
        List<String> list = new ArrayList<>();

        final List<String> collect = list.stream().collect(Collectors.toList());

//       Stream.of
        Stream.of("1", "2", "3");


//        limit must have
        final List<Integer> integers = Stream.generate(() -> 1)
                                             .limit(10)
                                             .collect(Collectors.toList());

        System.out.println(integers);

        final int sum = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7}).sum();

        System.out.println(sum);
    }
}
