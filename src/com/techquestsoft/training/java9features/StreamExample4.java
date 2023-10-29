package com.techquestsoft.training.java9features;

import java.util.stream.Stream;

public class StreamExample4 {
    public static void main(String[] args) {
        Stream<Integer> val
                = Stream.ofNullable(null);
        val.forEach(System.out::println);
    }
}
