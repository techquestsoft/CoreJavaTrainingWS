package com.techquestsoft.training.java8newfeatures.java8stream;
import java.util.List;
import java.util.Arrays;

public class FlatMapDemo2 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Scot","David", "John");
        List<String> list2 = Arrays.asList("Mary", "Luna", "Tom");
        List<String> list3 = Arrays.asList("Ken", "Johny", "Kitty");

        List<List<String>> finalList = Arrays.asList(list1,list2,list3);

        //finalList.stream().map(n->n+5).forEach(n->System.out.println(n));
        // finalList.stream().flatMap(n->n.stream()).forEach(n->System.out.println(n));
        finalList.stream().flatMap(n->n.stream()).map(n->n+5).forEach(n->System.out.println(n));

        // List<Integer> finalResults =
        //      finalList.stream().flatMap(n->n.stream()).collect(java.util.stream.Collectors.toList());

        // before JAVA 8
        for(List<String> team: finalList){
            for(String name: team){
                System.out.println(name);
            }
        }

        List<String> finalResults =
                finalList.stream().flatMap(n->n.stream().map(n1->n1+5)).collect(java.util.stream.Collectors.toList());
        System.out.println(finalResults);

    }
}
