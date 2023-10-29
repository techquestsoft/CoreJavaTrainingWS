package com.techquestsoft.training.java8newfeatures.java8stream;

import java.util.stream.Stream;

public class JavaStreamExample3 {
    public static void main(String[] args) {
        Stream.iterate(1, element -> element + 1)
                .filter(element -> element % 5 == 0)
                .limit(5)
                .forEach(System.out::println);
    }
}
