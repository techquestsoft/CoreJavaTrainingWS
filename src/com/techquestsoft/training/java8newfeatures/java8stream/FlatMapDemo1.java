package com.techquestsoft.training.java8newfeatures.java8stream;
import java.util.List;
import java.util.Arrays;

public class FlatMapDemo1 {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
        //intList.stream().map(n->n+5).forEach(n->System.out.println(n));

        List<Integer> intList1 = Arrays.asList(1,2);
        List<Integer> intList2 = Arrays.asList(3,4);
        List<Integer> intList3 = Arrays.asList(5,6);

        List<List<Integer>> finalList = Arrays.asList(intList1,intList2,intList3);

        //finalList.stream().map(n->n+5).forEach(n->System.out.println(n));
        // finalList.stream().flatMap(n->n.stream()).forEach(n->System.out.println(n));
        finalList.stream().flatMap(n->n.stream()).map(n->n+5).forEach(n->System.out.println(n));

       // List<Integer> finalResults =
          //      finalList.stream().flatMap(n->n.stream()).collect(java.util.stream.Collectors.toList());

        List<Integer> finalResults =
                finalList.stream().flatMap(n->n.stream().map(n1->n1+5)).collect(java.util.stream.Collectors.toList());
        System.out.println(finalResults);

    }
}
