package com.techquestsoft.training.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //ArrayList is better to store and view data
        List<String> list = new ArrayList<>();
        list.add("ankit");
        list.add("peter");
        list.add("mayank");

        System.out.println("Traversing ArrayList...");
        for (String s : list) {
            System.out.println(s);
        }
    }
}