package com.techquestsoft.training.java9features;

import java.util.stream.Stream;

public class StreamExample5 {
    public static void main(String[] args) {
        Stream.iterate(1, i -> i <= 10, i -> i * 3)
                .forEach(System.out::println);
    }
}