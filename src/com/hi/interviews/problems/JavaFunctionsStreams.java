package com.hi.interviews.problems;
import java.util.*;
import java.util.function.*;
public class JavaFunctionsStreams {
    public static void main(String[] args){
        Function<List<Integer>, Integer> function1 = x -> x
                .stream()
                .map(i -> i *  2).mapToInt(i -> i)
                .distinct()
                .sum();
        Function<Integer, Integer> function2 = x -> x * 10;
        Function<Integer, Integer> function3 = x -> x * 100;

        int len = function1.andThen(function2).andThen(function3).apply(Arrays.asList(1,2,2));

        System.out.println(len);

        // when using mapToInt check i type if it is mapper then may give compilation error
/*        int sum = java.util.stream.Stream.iterate(new int[] {0,1},
                x -> new int[] {x[1], x[0] + x[1]})
                .limit(2).map(x -> x[0]).collect(java.util.stream.Collectors.toList())
                .stream().distinct().filter(i -> i%2 == 0).mapToInt(i + i).sum();*/

        int sum = java.util.stream.Stream.iterate(new int[] {0,1},
                        x -> new int[] {x[1], x[0] + x[1]})
                .limit(2).map(x -> x[0]).collect(java.util.stream.Collectors.toList())
                .stream().distinct().filter(i -> i%2 == 0).mapToInt(i -> i).sum();

        System.out.println(sum);

    }
}
